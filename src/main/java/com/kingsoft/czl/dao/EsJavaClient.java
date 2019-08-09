package com.kingsoft.czl.dao;

/**
 * company: 北京金山软件股份有限公司
 * user: chenzuoli
 * date: 2018/10/23 10:14
 * description:
 */

public interface EsJavaClient {

    <T> void put(T object, Class<T> klass);

}
