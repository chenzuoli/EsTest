package com.kingsoft.czl.entity;

/**
 * company: 北京金山软件股份有限公司
 * user: chenzuoli
 * date: 2018/11/7 19:53
 * description:
 */
public class User {
    private String userid;

    public User(String userid) {
        this.userid = userid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
