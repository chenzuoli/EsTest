package com.company.czl;

import com.company.czl.entity.Finance_trade_record;
import com.company.czl.util.FileUtils;
import org.elasticsearch.client.transport.TransportClient;

import java.util.List;

/**
 * company: 
 * user: CHENZUOLI
 * date: 2019/5/23 16:05
 * description:
 */
public class FinanceTradeRecord {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("please enter one file path param.");
            return;
        }
        String clusterName = "my-application";
        String host = "192.168.26.45";
        String port = "9300";
        String index = "report_finance_es_finance_trade_record";
        String type = "finance_trade_record";
        LoadData2ES loadData2ES = new LoadData2ES(clusterName, host, port);
        TransportClient client = loadData2ES.getClient(clusterName);
        List<String> lines = FileUtils.readFile(args[0]);
        lines.forEach(line -> {
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++) {
                if ("NULL".equals(columns[i])) {
                    columns[i] = "";
                }
            }
            Finance_trade_record finance_trade_record = new Finance_trade_record();
            finance_trade_record.setMarket_date(columns[0]);
            finance_trade_record.setSerial_number(columns[1]);
            finance_trade_record.setOrder_number(columns[2]);
            finance_trade_record.setUser_id(columns[3]);
            finance_trade_record.setOrg_id(columns[4]);
            finance_trade_record.setName(columns[5]);
            finance_trade_record.setPublicity_name(columns[6]);
            finance_trade_record.setProduct_type(columns[7]);
            finance_trade_record.setType(columns[8]);
            finance_trade_record.setPartner_pid(columns[9]);
            finance_trade_record.setPid(columns[10]);
            finance_trade_record.setPlatform(columns[11]);
            finance_trade_record.setUser_operation(columns[12]);
            finance_trade_record.setOperation(columns[13]);
            if (columns[14].length() == 0) {
                finance_trade_record.setAmount_trade(0);
            } else {
                finance_trade_record.setAmount_trade(Double.parseDouble(columns[14]));
            }
            finance_trade_record.setMarket_time(columns[15]);
            finance_trade_record.setTime_of_interest(columns[16]);
            finance_trade_record.setExpiration_time(columns[17]);
            if (columns[18].length() == 0) {
                finance_trade_record.setAmount_total_invest(0);
            } else {
                finance_trade_record.setAmount_total_invest(Double.parseDouble(columns[18]));
            }
            if (columns[19].length() == 0) {
                finance_trade_record.setAmount_store_total(0);
            } else  {
                finance_trade_record.setAmount_store_total(Double.parseDouble(columns[19]));
            }
            finance_trade_record.setAnnualized_return(columns[20]);
            finance_trade_record.setWhitelist_type(columns[21]);
            finance_trade_record.setReg_channel_code(columns[22]);
            finance_trade_record.setReg_channel_name(columns[23]);
            finance_trade_record.setStatus(columns[24]);
            loadData2ES.insert(finance_trade_record, index, type);
//            Field[] fields = Finance_trade_record.class.getDeclaredFields();
//            for (int i = 0; i < fields.length; i++) {
//                Finance_trade_record finance = null;
//                try {
//                    finance = Finance_trade_record.class.newInstance();
//                } catch (InstantiationException e) {
//                    e.printStackTrace();
//                } catch (IllegalAccessException e) {
//                    e.printStackTrace();
//                }
//                Method[] declaredMethods = finance.getClass().getDeclaredMethods();
//
//            }

        });
    }
}
