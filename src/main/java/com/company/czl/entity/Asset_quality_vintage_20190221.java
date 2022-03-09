package com.company.czl.entity;

/**
 * company: 
 * user: CHENZUOLI
 * date: 2019/5/30 14:48
 * description:
 */
public class Asset_quality_vintage_20190221 {
    private String actual_putout_month;
    private String mob;
    private String user_channel;
    private String term_month;
    private String finc_rate;
    private String actual_putout_amt;
    private String m0plus_receivable_corpus_balance;
    private String m1plus_receivable_corpus_balance;
    private String m2plus_receivable_corpus_balance;
    private String m3plus_receivable_corpus_balance;
    private String vintage_m0plus;
    private String vintage_m1plus;
    private String vintage_m2plus;
    private String vintage_m3plus;
    private String dt;

    public Asset_quality_vintage_20190221() {
    }

    public Asset_quality_vintage_20190221(String actual_putout_amt, String actual_putout_month, String dt, String finc_rate, String m0plus_receivable_corpus_balance, String m1plus_receivable_corpus_balance, String m2plus_receivable_corpus_balance, String m3plus_receivable_corpus_balance, String mob, String term_month, String user_channel, String vintage_m0plus, String vintage_m1plus, String vintage_m2plus, String vintage_m3plus) {
        this.actual_putout_amt = actual_putout_amt;
        this.actual_putout_month = actual_putout_month;
        this.dt = dt;
        this.finc_rate = finc_rate;
        this.m0plus_receivable_corpus_balance = m0plus_receivable_corpus_balance;
        this.m1plus_receivable_corpus_balance = m1plus_receivable_corpus_balance;
        this.m2plus_receivable_corpus_balance = m2plus_receivable_corpus_balance;
        this.m3plus_receivable_corpus_balance = m3plus_receivable_corpus_balance;
        this.mob = mob;
        this.term_month = term_month;
        this.user_channel = user_channel;
        this.vintage_m0plus = vintage_m0plus;
        this.vintage_m1plus = vintage_m1plus;
        this.vintage_m2plus = vintage_m2plus;
        this.vintage_m3plus = vintage_m3plus;
    }

    public String getActual_putout_amt() {
        return actual_putout_amt;
    }

    public void setActual_putout_amt(String actual_putout_amt) {
        this.actual_putout_amt = actual_putout_amt;
    }

    public String getActual_putout_month() {
        return actual_putout_month;
    }

    public void setActual_putout_month(String actual_putout_month) {
        this.actual_putout_month = actual_putout_month;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public String getFinc_rate() {
        return finc_rate;
    }

    public void setFinc_rate(String finc_rate) {
        this.finc_rate = finc_rate;
    }

    public String getM0plus_receivable_corpus_balance() {
        return m0plus_receivable_corpus_balance;
    }

    public void setM0plus_receivable_corpus_balance(String m0plus_receivable_corpus_balance) {
        this.m0plus_receivable_corpus_balance = m0plus_receivable_corpus_balance;
    }

    public String getM1plus_receivable_corpus_balance() {
        return m1plus_receivable_corpus_balance;
    }

    public void setM1plus_receivable_corpus_balance(String m1plus_receivable_corpus_balance) {
        this.m1plus_receivable_corpus_balance = m1plus_receivable_corpus_balance;
    }

    public String getM2plus_receivable_corpus_balance() {
        return m2plus_receivable_corpus_balance;
    }

    public void setM2plus_receivable_corpus_balance(String m2plus_receivable_corpus_balance) {
        this.m2plus_receivable_corpus_balance = m2plus_receivable_corpus_balance;
    }

    public String getM3plus_receivable_corpus_balance() {
        return m3plus_receivable_corpus_balance;
    }

    public void setM3plus_receivable_corpus_balance(String m3plus_receivable_corpus_balance) {
        this.m3plus_receivable_corpus_balance = m3plus_receivable_corpus_balance;
    }

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    public String getTerm_month() {
        return term_month;
    }

    public void setTerm_month(String term_month) {
        this.term_month = term_month;
    }

    public String getUser_channel() {
        return user_channel;
    }

    public void setUser_channel(String user_channel) {
        this.user_channel = user_channel;
    }

    public String getVintage_m0plus() {
        return vintage_m0plus;
    }

    public void setVintage_m0plus(String vintage_m0plus) {
        this.vintage_m0plus = vintage_m0plus;
    }

    public String getVintage_m1plus() {
        return vintage_m1plus;
    }

    public void setVintage_m1plus(String vintage_m1plus) {
        this.vintage_m1plus = vintage_m1plus;
    }

    public String getVintage_m2plus() {
        return vintage_m2plus;
    }

    public void setVintage_m2plus(String vintage_m2plus) {
        this.vintage_m2plus = vintage_m2plus;
    }

    public String getVintage_m3plus() {
        return vintage_m3plus;
    }

    public void setVintage_m3plus(String vintage_m3plus) {
        this.vintage_m3plus = vintage_m3plus;
    }
}
