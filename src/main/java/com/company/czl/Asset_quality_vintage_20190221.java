package com.company.czl;

import com.company.czl.util.FileUtils;

import java.util.List;

/**
 * company: 
 * user: CHENZUOLI
 * date: 2019/5/23 16:05
 * description:
 */
public class Asset_quality_vintage_20190221 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("please enter one file path param.");
            return;
        }
        String clusterName = "my-application";
        String host = "192.168.26.45";
        String port = "9300";
        String index = "report_risk_es_asset_quality_vintage_20190221";
        String type = "asset_quality_vintage_20190221";
        LoadData2ES loadData2ES = new LoadData2ES(clusterName, host, port);
        loadData2ES.getClient(clusterName);
        List<String> lines = FileUtils.readFile(args[0]);
        lines.forEach(line -> {
            String[] columns = line.split(",");
            for (int i = 0; i < columns.length; i++) {
                if ("NULL".equals(columns[i])) {
                    columns[i] = "";
                }
            }
            com.company.czl.entity.Asset_quality_vintage_20190221 asset_quality_vintage_20190221 = new com.company.czl.entity.Asset_quality_vintage_20190221();
            asset_quality_vintage_20190221.setActual_putout_month(columns[0]);
            asset_quality_vintage_20190221.setMob(columns[1]);
            asset_quality_vintage_20190221.setUser_channel(columns[2]);
            asset_quality_vintage_20190221.setTerm_month(columns[3]);
            asset_quality_vintage_20190221.setFinc_rate(columns[4]);
            asset_quality_vintage_20190221.setActual_putout_amt(columns[5]);
            asset_quality_vintage_20190221.setM0plus_receivable_corpus_balance(columns[6]);
            asset_quality_vintage_20190221.setM1plus_receivable_corpus_balance(columns[7]);
            asset_quality_vintage_20190221.setM2plus_receivable_corpus_balance(columns[8]);
            asset_quality_vintage_20190221.setM3plus_receivable_corpus_balance(columns[9]);
            asset_quality_vintage_20190221.setVintage_m0plus(columns[10]);
            asset_quality_vintage_20190221.setVintage_m1plus(columns[11]);
            asset_quality_vintage_20190221.setVintage_m2plus(columns[12]);
            asset_quality_vintage_20190221.setVintage_m3plus(columns[13]);
            asset_quality_vintage_20190221.setDt(columns[14]);
            loadData2ES.insert(asset_quality_vintage_20190221, index, type);
        });
    }
}
