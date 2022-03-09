package com.company.czl;

import com.company.czl.entity.User;
import com.company.czl.util.EsUtils;
import com.company.czl.util.FileUtils;

import java.util.List;

/**
 * company: 
 * user: chenzuoli
 * date: 2018/11/7 19:41
 * description: 临时任务：读取文件，插入es
 */
public class Temp {

    public static void main(String[] args) {
        if (args.length != 6) System.out.println("please enter six parameter: file path;" +
                "\nes host;" +
                "\nes port;" +
                "\nes index;" +
                "\nes type;" +
                "\nes cluster name.");
        String filePath = args[0];
        String host = args[1];
        String port = args[2];
        String index = args[3];
        String type = args[4];
        String clusterName = args[5];
        List<String> lines = FileUtils.readFile(filePath);
        EsUtils esUtils = new EsUtils(clusterName, host, port);
        esUtils.getClient();
        lines.forEach(line -> {
            User user = new User(line);
            esUtils.insertOne(index, type, user, "userid");
        });
    }

}
