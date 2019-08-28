package com.kingsoft.czl;

import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.reindex.BulkByScrollResponse;
import org.elasticsearch.index.reindex.DeleteByQueryAction;
import org.elasticsearch.index.reindex.DeleteByQueryRequestBuilder;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * company: 金山软件
 * user: chenzuoli
 * date: 2018/8/15 10:12
 * description: 通过日期删除es中的数据
 * 参数传递顺序：
 * 1.索引
 * 2.类型
 * 3.字段名称
 * 4.字段值，日期的话，格式为yyyy-MM-dd
 * 5.es_cluster_name
 * 6.es_ip
 * 7.es_port
 * 8.删除模式（1为删除当前日期数据，2位删除除了当前日期的数据）
 */
public class DeleteEsByDate {
    private static TransportClient client;

    public static void main(String[] args) {
        System.out.println("args: ");
        for (String arg : args) {
            System.out.println("\t" + arg);
        }
        Settings settings = Settings.builder().put("cluster.name", args[4]).build();
        try {
            client = new PreBuiltTransportClient(settings)
                    .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(args[5]), Integer.parseInt(args[6])));
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        if ("1".equals(args[7])) {
            deleteDocumentByQuery(args[0], args[1], args[2], args[3]);
        } else if ("2".equals(args[7])) {
            deleteOthDocByQuery(args[0], args[1], args[2], args[3]);
        } else {
            System.out.println("please enter correct delete mode: 1 is delete equals, 2 is delete not equals!");
        }
    }

    /**
     * description: 按照给定的字段和值，删除查询到的结果
     * param: [index, type, col, val]
     * return: void
     * time: 2018/8/17 15:25
     */
    private static void deleteDocumentByQuery(String index, String type, String col, String val) {
        //DeleteByQueryRequestBuilder builder = new DeleteByQueryRequestBuilder(client,DeleteByQueryAction.INSTANCE);
        DeleteByQueryRequestBuilder builder = DeleteByQueryAction.INSTANCE.newRequestBuilder(client);
        //builder.filter(convertParam(param));
        builder.source().setIndices(index)
                .setTypes(type)
                .setQuery(QueryBuilders.matchPhraseQuery(col, val));
        BulkByScrollResponse response = builder.get();
        long deleted = response.getDeleted();
        System.out.println("delete number of document is " + deleted);
    }

    /**
     * description: 按照给定的字段和值，删除其他所有值
     * param: [index, type, col, val]
     * return: void
     * time: 2018/8/17 15:24
     */
    private static void deleteOthDocByQuery(String index, String type, String col, String val) {
        DeleteByQueryRequestBuilder builder = DeleteByQueryAction.INSTANCE.newRequestBuilder(client);
        BoolQueryBuilder boolQuery = QueryBuilders.boolQuery();
        boolQuery.mustNot(QueryBuilders.matchPhraseQuery(col, val));
        builder.source().setIndices(index)
                .setTypes(type)
                .setQuery(boolQuery);
        BulkByScrollResponse bulkByScrollResponse = builder.get();
        long deleted = bulkByScrollResponse.getDeleted();
        System.out.println("delete number of document is " + deleted);
    }

}
