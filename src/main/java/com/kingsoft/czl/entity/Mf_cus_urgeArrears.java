package com.kingsoft.czl.entity;

import java.io.Serializable;

/**
 * 催收
 */
public class Mf_cus_urgeArrears implements Serializable {
    private String userid;
    private String sum_arrear_all;
    private String over_cmpd_intst;
    private String finc_num;
    private String term_num;
    private String max_overdue_days;
    private String overdue_term_num;
    private String sum_overdue_days;
    private String history_max_overdue_days;
    private String max_overdue_money;
    private String max_out_flag_user_id;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getSum_arrear_all() {
        return sum_arrear_all;
    }

    public void setSum_arrear_all(String sum_arrear_all) {
        this.sum_arrear_all = sum_arrear_all;
    }

    public String getFinc_num() {
        return finc_num;
    }

    public void setFinc_num(String finc_num) {
        this.finc_num = finc_num;
    }

    public String getTerm_num() {
        return term_num;
    }

    public void setTerm_num(String term_num) {
        this.term_num = term_num;
    }

    public String getMax_overdue_days() {
        return max_overdue_days;
    }

    public void setMax_overdue_days(String max_overdue_days) {
        this.max_overdue_days = max_overdue_days;
    }

    public String getOverdue_term_num() {
        return overdue_term_num;
    }

    public void setOverdue_term_num(String overdue_term_num) {
        this.overdue_term_num = overdue_term_num;
    }

    public String getSum_overdue_days() {
        return sum_overdue_days;
    }

    public void setSum_overdue_days(String sum_overdue_days) {
        this.sum_overdue_days = sum_overdue_days;
    }

    public String getHistory_max_overdue_days() {
        return history_max_overdue_days;
    }

    public void setHistory_max_overdue_days(String history_max_overdue_days) {
        this.history_max_overdue_days = history_max_overdue_days;
    }

    public String getMax_overdue_money() {
        return max_overdue_money;
    }

    public void setMax_overdue_money(String max_overdue_money) {
        this.max_overdue_money = max_overdue_money;
    }

    public String getOver_cmpd_intst() {
        return over_cmpd_intst;
    }

    public void setOver_cmpd_intst(String over_cmpd_intst) {
        this.over_cmpd_intst = over_cmpd_intst;
    }

    public String getMax_out_flag_user_id() {
        return max_out_flag_user_id;
    }

    public void setMax_out_flag_user_id(String max_out_flag_user_id) {
        this.max_out_flag_user_id = max_out_flag_user_id;
    }
}
