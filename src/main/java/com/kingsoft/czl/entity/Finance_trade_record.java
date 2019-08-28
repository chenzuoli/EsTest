package com.kingsoft.czl.entity;

/**
 * company: 金山办公软件股份有限公司
 * user: CHENZUOLI
 * date: 2019/5/23 15:56
 * description:
 */
public class Finance_trade_record {
    private String market_date;
    private String serial_number;
    private String order_number;
    private String user_id;
    private String org_id;
    private String name;
    private String publicity_name;
    private String product_type;
    private String type;
    private String partner_pid;
    private String pid;
    private String platform;
    private String user_operation;
    private String operation;
    private double amount_trade;
    private String market_time;
    private String time_of_interest;
    private String expiration_time;
    private double amount_total_invest;
    private double amount_store_total;
    private String annualized_return;
    private String whitelist_type;
    private String reg_channel_code;
    private String reg_channel_name;
    private String status;

    public Finance_trade_record() {
    }

    public Finance_trade_record(String market_date, String serial_number, String order_number, String user_id, String org_id, String name, String publicity_name, String product_type, String type, String partner_pid, String pid, String platform, String user_operation, String operation, double amount_trade, String market_time, String time_of_interest, String expiration_time, double amount_total_invest, double amount_store_total, String annualized_return, String whitelist_type, String reg_channel_code, String reg_channel_name, String status) {
        this.market_date = market_date;
        this.serial_number = serial_number;
        this.order_number = order_number;
        this.user_id = user_id;
        this.org_id = org_id;
        this.name = name;
        this.publicity_name = publicity_name;
        this.product_type = product_type;
        this.type = type;
        this.partner_pid = partner_pid;
        this.pid = pid;
        this.platform = platform;
        this.user_operation = user_operation;
        this.operation = operation;
        this.amount_trade = amount_trade;
        this.market_time = market_time;
        this.time_of_interest = time_of_interest;
        this.expiration_time = expiration_time;
        this.amount_total_invest = amount_total_invest;
        this.amount_store_total = amount_store_total;
        this.annualized_return = annualized_return;
        this.whitelist_type = whitelist_type;
        this.reg_channel_code = reg_channel_code;
        this.reg_channel_name = reg_channel_name;
        this.status = status;
    }

    public String getMarket_date() {
        return market_date;
    }

    public void setMarket_date(String market_date) {
        this.market_date = market_date;
    }

    public String getSerial_number() {
        return serial_number;
    }

    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublicity_name() {
        return publicity_name;
    }

    public void setPublicity_name(String publicity_name) {
        this.publicity_name = publicity_name;
    }

    public String getProduct_type() {
        return product_type;
    }

    public void setProduct_type(String product_type) {
        this.product_type = product_type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPartner_pid() {
        return partner_pid;
    }

    public void setPartner_pid(String partner_pid) {
        this.partner_pid = partner_pid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getUser_operation() {
        return user_operation;
    }

    public void setUser_operation(String user_operation) {
        this.user_operation = user_operation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public double getAmount_trade() {
        return amount_trade;
    }

    public void setAmount_trade(double amount_trade) {
        this.amount_trade = amount_trade;
    }

    public String getMarket_time() {
        return market_time;
    }

    public void setMarket_time(String market_time) {
        this.market_time = market_time;
    }

    public String getTime_of_interest() {
        return time_of_interest;
    }

    public void setTime_of_interest(String time_of_interest) {
        this.time_of_interest = time_of_interest;
    }

    public String getExpiration_time() {
        return expiration_time;
    }

    public void setExpiration_time(String expiration_time) {
        this.expiration_time = expiration_time;
    }

    public double getAmount_total_invest() {
        return amount_total_invest;
    }

    public void setAmount_total_invest(double amount_total_invest) {
        this.amount_total_invest = amount_total_invest;
    }

    public double getAmount_store_total() {
        return amount_store_total;
    }

    public void setAmount_store_total(double amount_store_total) {
        this.amount_store_total = amount_store_total;
    }

    public String getAnnualized_return() {
        return annualized_return;
    }

    public void setAnnualized_return(String annualized_return) {
        this.annualized_return = annualized_return;
    }

    public String getWhitelist_type() {
        return whitelist_type;
    }

    public void setWhitelist_type(String whitelist_type) {
        this.whitelist_type = whitelist_type;
    }

    public String getReg_channel_code() {
        return reg_channel_code;
    }

    public void setReg_channel_code(String reg_channel_code) {
        this.reg_channel_code = reg_channel_code;
    }

    public String getReg_channel_name() {
        return reg_channel_name;
    }

    public void setReg_channel_name(String reg_channel_name) {
        this.reg_channel_name = reg_channel_name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
