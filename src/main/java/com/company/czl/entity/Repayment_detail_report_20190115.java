package com.company.czl.entity;

import lombok.Data;

@Data
public class Repayment_detail_report_20190115 {
    private String repayment_account_id;
    private String trade_date;
    private String contract_code;
    private String contract_name;
    private String customer_code;
    private String customer_name;
    private String customer_name_md5;
    private String derate_amount;
    private String overdue_days;

    public Repayment_detail_report_20190115(String repayment_account_id, String trade_date, String contract_code, String contract_name, String customer_code, String customer_name, String customer_name_md5, String derate_amount, String overdue_days, String received_normal_interest, String received_debt_interest, String receivedfine, String receivedinterestrate, String received_normal_corpus, String received_debt_corpus, String received_fee, String received_amount, String product_name, String own_received_normal_interest, String own_received_debt_interest, String own_received_fine, String own_received_interest_rate, String own_received_normal_corpus, String own_received_debt_corpus, String investor_fund_info_name, String investor_received_interest, String investor_received_debt_interest, String investor_received_fine, String investor_received_interest_rate, String investor_received_normal_corpus, String investor_received_debt_corpus, String investor_received_amount, String order_channel, String repayment_type, String repayment_channel, String dt) {
        this.repayment_account_id = repayment_account_id;
        this.trade_date = trade_date;
        this.contract_code = contract_code;
        this.contract_name = contract_name;
        this.customer_code = customer_code;
        this.customer_name = customer_name;
        this.customer_name_md5 = customer_name_md5;
        this.derate_amount = derate_amount;
        this.overdue_days = overdue_days;
        this.received_normal_interest = received_normal_interest;
        this.received_debt_interest = received_debt_interest;
        this.receivedfine = receivedfine;
        this.receivedinterestrate = receivedinterestrate;
        this.received_normal_corpus = received_normal_corpus;
        this.received_debt_corpus = received_debt_corpus;
        this.received_fee = received_fee;
        this.received_amount = received_amount;
        this.product_name = product_name;
        this.own_received_normal_interest = own_received_normal_interest;
        this.own_received_debt_interest = own_received_debt_interest;
        this.own_received_fine = own_received_fine;
        this.own_received_interest_rate = own_received_interest_rate;
        this.own_received_normal_corpus = own_received_normal_corpus;
        this.own_received_debt_corpus = own_received_debt_corpus;
        this.investor_fund_info_name = investor_fund_info_name;
        this.investor_received_interest = investor_received_interest;
        this.investor_received_debt_interest = investor_received_debt_interest;
        this.investor_received_fine = investor_received_fine;
        this.investor_received_interest_rate = investor_received_interest_rate;
        this.investor_received_normal_corpus = investor_received_normal_corpus;
        this.investor_received_debt_corpus = investor_received_debt_corpus;
        this.investor_received_amount = investor_received_amount;
        this.order_channel = order_channel;
        this.repayment_type = repayment_type;
        this.repayment_channel = repayment_channel;
        this.dt = dt;
    }

    private String received_normal_interest;
    private String received_debt_interest;
    private String receivedfine;
    private String receivedinterestrate;
    private String received_normal_corpus;
    private String received_debt_corpus;
    private String received_fee;
    private String received_amount;
    private String product_name;
    private String own_received_normal_interest;
    private String own_received_debt_interest;
    private String own_received_fine;
    private String own_received_interest_rate ;
    private String own_received_normal_corpus;
    private String own_received_debt_corpus;
    private String investor_fund_info_name;
    private String investor_received_interest;
    private String investor_received_debt_interest;
    private String investor_received_fine;
    private String investor_received_interest_rate;
    private String investor_received_normal_corpus;
    private String investor_received_debt_corpus;
    private String investor_received_amount;
    private String order_channel;
    private String repayment_type;
    private String repayment_channel;
    private String dt;


}
