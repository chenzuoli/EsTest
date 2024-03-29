import com.company.czl.entity.Test;
import com.company.czl.util.EsUtils;

/**
 * company: 
 * user: chenzuoli
 * date: 2018/11/7 19:31
 * description: 测试es工具类
 */
public class TestEsUtils {
    public static void main(String[] args) {
        String clusterName = "my-application";
        String host = "192.168.68.73";
        String port = "9300";
        String index = "esutils";
        String type = "test";
        EsUtils esUtils = new EsUtils(clusterName, host, port);
        esUtils.getClient();
        Test test = new Test();
        test.setService("test");
        esUtils.insertOne(index, type, test, "id");
    }
}
