package com.kingsoft.czl.impl;

import com.kingsoft.czl.dao.EsJavaClient;
import javafx.util.Pair;
import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.Client;

import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * company: 北京金山软件股份有限公司
 * user: chenzuoli
 * date: 2018/10/23 10:13
 * description:
 */

public class EsJavaClientImpl implements EsJavaClient {
    private static Logger logger = Logger.getLogger(EsJavaClientImpl.class.getName());
    private Client client;
    private String serverName;//es服务器地址
    private int port;//es服务器端口
    private String clusterName;//es服务器名称
    private volatile Map<String, Pair<String, String>> indexInfos;

    @Override
    public <T> void put(T object, Class<T> klass) {
//        String index = getIndex(klass);
//        String type = getType(klass);
//        try {
//            ActionFuture<IndexResponse> future = client.index(new IndexRequest(index, type).source(jsonStr));
//            IndexResponse response = future.get();//此处会阻塞
//            logger.info(response.getId());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    //获取注入的参数
    public void setIndexInfos(Map<String, Pair<String, String>> indexInfos) {
        this.indexInfos = indexInfos;
    }

    public Map<String, Pair<String, String>> getIndexInfos() {
        return this.indexInfos;
    }

    //获取index
//    private String getIndex(Class klass) {
//        return indexInfos.get(klass.getName()).fst;
//    }
//
//    //获取type
//    private String getType(Class klass) {
//        return indexInfos.get(klass.getName()).snd;
//    }


    //set,get方法
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }
}
