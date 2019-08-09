package com.kingsoft.czl.util;

import net.sf.json.JSONObject;
import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;

/**
 * company: 北京金山软件股份有限公司
 * user: chenzuoli
 * date: 2018/11/7 18:49
 * description: es工具类，需先获取client，然后进行增删改查操作
 */
public class EsUtils {
    private TransportClient client;
    private String clusterName;
    private String host;
    private String port;

    public EsUtils(String clusterName, String host, String port) {
        this.clusterName = clusterName;
        this.host = host;
        this.port = port;
    }

    public TransportClient getClient() {
        if (client == null) {
            Settings settings = Settings.builder().put("cluster.name", clusterName).build();
            try {
                client = new PreBuiltTransportClient(settings)
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), Integer.parseInt(port)));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return client;
    }

    /**
     * description: 指定id为存储对象中的某个属性
     * param: [index, type, obj, id]
     * return: java.lang.String
     * time: 2018/11/8 11:54
     */
    public <T> String insertOne(String index, String type, T obj, String id) {
        IndexResponse response = null;
        try {
            JSONObject jsonObject = JSONObject.fromObject(obj);
            ActionFuture<IndexResponse> future = client.index(
                    new IndexRequest(index, type)
                            .id(jsonObject.optString(id, "default"))
                            .source(jsonObject));
            response = future.get();//此处会阻塞
            System.out.println(response.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response == null ? "" : response.getId();
    }

    /**
     * description: 随机生成id
     * param: [index, type, obj]
     * return: java.lang.String
     * time: 2018/11/8 11:52
     */
    public <T> String insertOneRandomId(String index, String type, T obj) {
        IndexResponse response = null;
        try {
            JSONObject jsonObject = JSONObject.fromObject(obj);
            ActionFuture<IndexResponse> future = client.index(
                    new IndexRequest(index, type)
                            .source(jsonObject));
            response = future.get();//此处会阻塞
            System.out.println(response.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return response == null ? "" : response.getId();
    }

}
