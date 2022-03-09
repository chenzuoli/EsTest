package com.company.czl.entity;

/**
 * company: 
 * user: chenzuoli
 * date: 2018/10/23 10:23
 * description:
 */
public class Receivable {
    private String finc_id; // '借据id',
    private String finc_show_id;// '借据展示id',
    private String cus_no; //'客户编号',
    private String cus_name; // '客户姓名',
    private String repay_id; // '还款历史id',
    private String prcp_normal; // '回收正常本金',
    private String norm_intst_normal; // '回收正常利息',
    private String prcp_over; // '回收逾期本金',
    private String norm_intst_over; // '实收逾期利息',
    private String over_intst; // '实收罚息',
    private String cmpd_intst; // '实收复利',
    private String penalty; // '本期划款违约金合计',
    private String money_all; // '费用合计',
    private String kind_name; // '产品类型',
    private String finc_channel; // '订单来源渠道'
    private String dt;
    public Receivable(String dt, String finc_id, String finc_show_id, String cus_no, String cus_name, String repay_id, String prcp_normal, String norm_intst_normal, String prcp_over, String norm_intst_over, String over_intst, String cmpd_intst, String penalty, String money_all, String kind_name, String finc_channel) {
        this.finc_id = finc_id;
        this.finc_show_id = finc_show_id;
        this.cus_no = cus_no;
        this.cus_name = cus_name;
        this.repay_id = repay_id;
        this.prcp_normal = prcp_normal;
        this.norm_intst_normal = norm_intst_normal;
        this.prcp_over = prcp_over;
        this.norm_intst_over = norm_intst_over;
        this.over_intst = over_intst;
        this.cmpd_intst = cmpd_intst;
        this.penalty = penalty;
        this.money_all = money_all;
        this.kind_name = kind_name;
        this.finc_channel = finc_channel;
        this.dt = dt;
    }

    public Receivable() {
    }

    public String getFinc_id() {
        return finc_id;
    }

    public void setFinc_id(String finc_id) {
        this.finc_id = finc_id;
    }

    public String getFinc_show_id() {
        return finc_show_id;
    }

    public void setFinc_show_id(String finc_show_id) {
        this.finc_show_id = finc_show_id;
    }

    public String getCus_no() {
        return cus_no;
    }

    public void setCus_no(String cus_no) {
        this.cus_no = cus_no;
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public String getRepay_id() {
        return repay_id;
    }

    public void setRepay_id(String repay_id) {
        this.repay_id = repay_id;
    }

    public String getPrcp_normal() {
        return prcp_normal;
    }

    public void setPrcp_normal(String prcp_normal) {
        this.prcp_normal = prcp_normal;
    }

    public String getNorm_intst_normal() {
        return norm_intst_normal;
    }

    public void setNorm_intst_normal(String norm_intst_normal) {
        this.norm_intst_normal = norm_intst_normal;
    }

    public String getPrcp_over() {
        return prcp_over;
    }

    public void setPrcp_over(String prcp_over) {
        this.prcp_over = prcp_over;
    }

    public String getNorm_intst_over() {
        return norm_intst_over;
    }

    public void setNorm_intst_over(String norm_intst_over) {
        this.norm_intst_over = norm_intst_over;
    }

    public String getOver_intst() {
        return over_intst;
    }

    public void setOver_intst(String over_intst) {
        this.over_intst = over_intst;
    }

    public String getCmpd_intst() {
        return cmpd_intst;
    }

    public void setCmpd_intst(String cmpd_intst) {
        this.cmpd_intst = cmpd_intst;
    }

    public String getPenalty() {
        return penalty;
    }

    public void setPenalty(String penalty) {
        this.penalty = penalty;
    }

    public String getMoney_all() {
        return money_all;
    }

    public void setMoney_all(String money_all) {
        this.money_all = money_all;
    }

    public String getKind_name() {
        return kind_name;
    }

    public void setKind_name(String kind_name) {
        this.kind_name = kind_name;
    }

    public String getFinc_channel() {
        return finc_channel;
    }

    public void setFinc_channel(String finc_channel) {
        this.finc_channel = finc_channel;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    @Override
    public String toString() {
        return "Receivable{" +
                "finc_id='" + finc_id + '\'' +
                ", finc_show_id='" + finc_show_id + '\'' +
                ", cus_no='" + cus_no + '\'' +
                ", cus_name='" + cus_name + '\'' +
                ", repay_id='" + repay_id + '\'' +
                ", prcp_normal='" + prcp_normal + '\'' +
                ", norm_intst_normal='" + norm_intst_normal + '\'' +
                ", prcp_over='" + prcp_over + '\'' +
                ", norm_intst_over='" + norm_intst_over + '\'' +
                ", over_intst='" + over_intst + '\'' +
                ", cmpd_intst='" + cmpd_intst + '\'' +
                ", penalty='" + penalty + '\'' +
                ", money_all='" + money_all + '\'' +
                ", kind_name='" + kind_name + '\'' +
                ", finc_channel='" + finc_channel + '\'' +
                '}';
    }
}
