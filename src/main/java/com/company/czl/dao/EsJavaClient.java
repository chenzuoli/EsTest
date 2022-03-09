package com.company.czl.dao;

/**
 * company:
 * user: chenzuoli
 * date: 2018/10/23 10:14
 * description:
 */

public interface EsJavaClient {

    <T> void put(T object, Class<T> klass);

}
