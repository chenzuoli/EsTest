package com.kingsoft.czl;

import com.alibaba.druid.pool.DruidDataSource;
import com.kingsoft.czl.common.TestConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

/**
 * company: 金山办公软件股份有限公司
 * user: chenzuoli
 * date: 2019/7/5 9:22
 * description: 测试jdbc方式连接es，保证es-sql已安装
 */
public class EsJdbc {

    public static void main(String[] args) throws Exception {
        testJDBC();
    }

    public static void testJDBC() throws Exception {
//        Properties properties = new Properties();
//        properties.put("url", TestConstants.testUrl + TestConstants.testIndex);
//        DruidDataSource dds = (DruidDataSource) ElasticSearchDruidDataSourceFactory.createDataSource(properties);
//        Connection connection = dds.getConnection();
//        PreparedStatement ps = connection.prepareStatement("SELECT actual_putout_amt, actual_putout_month from  " + TestConstants.testIndex + " where dt='2019-04-30'");
//        ResultSet resultSet = ps.executeQuery();
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("actual_putout_amt") + "," + resultSet.getInt("actual_putout_month") + "," + resultSet.getString("dt"));
//        }
//        ps.close();
//        connection.close();
//        dds.close();
    }

}
