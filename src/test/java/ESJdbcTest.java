//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.pool.ElasticSearchDruidDataSourceFactory;
//import org.junit.Test;
//
//import java.sql.*;
//import java.util.Properties;
//
///**
// * company: 北京金山软件股份有限公司
// * user: chenzuoli
// * date: 2018/10/31 17:40
// * description: 测试jdbc连接es，未测试成功
// */
//public class ESJdbcTest {
//
//    public static void main(String[] args) {
//        try {
//            ESJdbcTest obj = new ESJdbcTest();
//            obj.testJDBC();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Test
//    public void testJDBC() throws Exception {
//        Properties properties = new Properties();
//        properties.put("url", "jdbc:elasticsearch://192.168.68.73:9300/davinci");
//        DruidDataSource dds = (DruidDataSource) ElasticSearchDruidDataSourceFactory.createDataSource(properties);
//        dds.setInitialSize(1);
//        Connection connection = dds.getConnection();
//        PreparedStatement ps = connection.prepareStatement("SELECT * from  davinci");
//        ResultSet resultSet = ps.executeQuery();
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString("service"));
//        }
//
//        ps.close();
//        connection.close();
//        dds.close();
//    }
//
//    @Test
//    public void testsql4es() {
//        try {
//            Class.forName("nl.anchormen.sql4es.jdbc.ESDriver");
//            Connection connection = DriverManager.getConnection("jdbc:sql4es://192.168.68.73:9300/davinci?cluster.name=my-application");
//            PreparedStatement pstmt = connection.prepareStatement("select * from favinci");
//            ResultSet rs = pstmt.executeQuery();
//            while (rs.next()) {
//                String service = rs.getString("service");
//                System.out.println(service);
//            }
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
