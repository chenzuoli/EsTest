package com.kingsoft.czl;

import com.kingsoft.czl.entity.Repayment_detail_report_20190115;
import com.kingsoft.czl.util.EsUtils;
import com.kingsoft.czl.util.FileUtils;
import org.elasticsearch.client.transport.TransportClient;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repayment_detail_report {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("please enter one file path param.");
            return;
        }
        String clusterName = "es-cluster-5.6.3";
        String host = "192.168.26.41";
        String port = "9300";
        String index = "report_es_repayment_detail_report_20190115";
        String type = "repayment_detail_report_20190115";
        EsUtils esUtils = new EsUtils(clusterName, host, port);
        TransportClient client = esUtils.getClient();
        List<String> lines = FileUtils.readFile(args[0]);
        lines.forEach(line -> {
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++) {
                if ("NULL".equals(columns[i])) {
                    columns[i] = "";
                }
                if (columns[0] == null) {
                    System.out.println(columns);
                }
                if (columns[0] == "") {
                    System.out.println(columns);
                }
            }
            Repayment_detail_report_20190115 repayment = new Repayment_detail_report_20190115(columns[0], columns[1], columns[2], columns[3], columns[4], columns[5], columns[6], columns[7], columns[8], columns[9], columns[10], columns[11], columns[12], columns[13], columns[14], columns[15], columns[16], columns[17], columns[18], columns[19], columns[20], columns[21], columns[22], columns[23], columns[24], columns[25], columns[26], columns[27], columns[28], columns[29], columns[30], columns[31], columns[32], columns[33], columns[34], columns[35]);
            System.out.println(repayment);
            esUtils.insertOneRandomId(index, type, repayment);
        });
    }

    private Map<Integer, String> mapping(String[] columns) {
        HashMap<Integer, String> int2column = new HashMap<>();
        for (int i = 0; i < columns.length; i++) {
            int2column.put(i, columns[i]);
        }
        return int2column;
    }
}
