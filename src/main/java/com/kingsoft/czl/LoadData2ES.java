package com.kingsoft.czl;

import com.kingsoft.czl.entity.Mf_cus_urgeArrears;
import com.kingsoft.czl.entity.Receivable;
import com.kingsoft.czl.util.EsUtils;
import net.sf.json.JSONObject;
import org.elasticsearch.action.ActionFuture;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

/**
 * company: 北京金山软件股份有限公司
 * user: chenzuoli
 * date: 2018/10/23 9:56
 * description: load data to es local
 */
public class LoadData2ES {
    private static Logger logger = Logger.getLogger(LoadData2ES.class.getName());
    private TransportClient client;
    private static String clusterName;
    private static String host;
    private static String port;

    public static void main(String[] args) {
        clusterName = "my-application";
        host = "192.168.26.45";
        port = "9300";
        LoadData2ES loadData2ES = new LoadData2ES(clusterName, host, port);
//        loadData2ES.getClient();
//        mf_cus_urge_arrears();
    }

    /**
     * description: 催收
     * param: []
     * return: void
     * time: 2018/11/26 10:52
     */
    public static void mf_cus_urge_arrears() {
        String index = "res_mf_cus_urge_arrears";
        String type = "mf_cus_urge_arrears";
        EsUtils esUtils = new EsUtils(clusterName, host, port);
        esUtils.getClient();
        Mf_cus_urgeArrears mf_cus_urgeArrears = new Mf_cus_urgeArrears();
        for (int i = 1; i < 5000; i++) {
            mf_cus_urgeArrears.setTerm_num("1");
            mf_cus_urgeArrears.setSum_arrear_all("190.09");
            mf_cus_urgeArrears.setFinc_num("1");
            mf_cus_urgeArrears.setUserid(String.valueOf(i));
            mf_cus_urgeArrears.setHistory_max_overdue_days("7");
            mf_cus_urgeArrears.setMax_overdue_days("7");
            mf_cus_urgeArrears.setOver_cmpd_intst(null);
            mf_cus_urgeArrears.setMax_out_flag_user_id("3");
            mf_cus_urgeArrears.setSum_overdue_days("11");
            mf_cus_urgeArrears.setOverdue_term_num("2");
            mf_cus_urgeArrears.setMax_overdue_money("188");
            esUtils.insertOne(index, type, mf_cus_urgeArrears, "userid");
        }
    }

    /**
     * description: 还款明细
     * param: []
     * return: void
     * time: 2018/11/26 10:44
     */
    public void receivable() {
        Receivable receivable = new Receivable();
        for (int i = 0; i <= 14802; i++) {
            String randomDayofMonth = getRandomDayofMonth();
            String randomMonth = getRandomMonth();
            String randomNumber = getRandomNumber();
            receivable.setFinc_id("1803271039293485" + randomDayofMonth);
            receivable.setFinc_show_id("MFT20180209000147-IOU0" + randomDayofMonth);
            receivable.setCus_no("WqW2nccj");
            receivable.setCus_name("周权");
            receivable.setRepay_id("repay1809221500134402" + randomDayofMonth);
            receivable.setPrcp_normal(randomNumber);
            receivable.setNorm_intst_normal(randomNumber);
            receivable.setPrcp_over(randomNumber);
            receivable.setNorm_intst_over(randomNumber);
            receivable.setOver_intst(randomNumber);
            receivable.setCmpd_intst(randomNumber);
            receivable.setPenalty(randomNumber);
            receivable.setMoney_all(randomNumber);
            receivable.setKind_name("内部贷款");
            receivable.setFinc_channel("");
            receivable.setDt("2018-" + randomMonth + "-" + randomDayofMonth);
            insert(receivable);
            if (i == 10000) {
                System.out.println("inserted into es " + i + " records.");
            }
        }
    }

    public LoadData2ES(String clusterName, String host, String port) {
        this.clusterName = clusterName;
        this.host = host;
        this.port = port;
    }

    private TransportClient getClient() {
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

    public TransportClient getClient(String cluster_name) {
        if (client == null) {
            Settings settings = Settings.builder().put("cluster.name", cluster_name).build();
            try {
                client = new PreBuiltTransportClient(settings)
                        .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(host), Integer.parseInt(port)));
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
        }
        return client;
    }

    public <T> void insert(Receivable receivable) {
        try {
            JSONObject jsonObject = JSONObject.fromObject(receivable);
            ActionFuture<IndexResponse> future = client.index(
                    new IndexRequest("report_es_test_20181102", "test_20181102")
                            .source(jsonObject));
            IndexResponse response = future.get();//此处会阻塞
            logger.info(response.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public <T> void insert(T obj, String index, String type) {
        try {
            JSONObject jsonObject = JSONObject.fromObject(obj);
            System.out.println(jsonObject);
            ActionFuture<IndexResponse> future = client.index(
                    new IndexRequest(index, type)
                            .source(jsonObject));
            IndexResponse response = future.get();//此处会阻塞
            logger.info(response.getId());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private <T> String obj2Json(T receivable) {
//        Field[] fields = receivable.getClass().getDeclaredFields();
//
//    }

    @Test
    public String getRandomDayofMonth() {
        String returnStr = "";
        int i = (int) (Math.random() * 30);
        System.out.println(i);
        if (i == 0) {
            return "01";
        }
        if (i < 10) {
            returnStr = "0" + i;
        } else {
            returnStr = String.valueOf(i);
        }
        return returnStr;
    }

    public String getRandomNumber() {
        String restr = "";
        double v = Math.random() * 100;
        return String.valueOf(v);
    }

    public String getRandomMonth() {
        String returnStr = "";
        int i = (int) (Math.random() * 12);
        System.out.println(i);
        if (i == 0) {
            return "01";
        }
        if (i < 10) {
            returnStr = "0" + i;
        } else {
            returnStr = String.valueOf(i);
        }
        return returnStr;
    }

}
