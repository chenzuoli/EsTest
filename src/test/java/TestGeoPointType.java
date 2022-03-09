import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.unit.DistanceUnit;
import org.elasticsearch.index.query.QueryBuilders;

/**
 * company: 
 * user: chenzuoli
 * date: 2018/9/20 11:44
 * description: 测试es中的geo_point类型
 */
public class TestGeoPointType {

    public static void main(String[] args) {

    }

    public static long getNearByPeople(String path, String geoField, double lat, double lon) {
        String[] indexType = path.split("/");
        TransportClient client = null;
        SearchResponse searchResponse = client.prepareSearch(indexType[0])
                .setTypes(indexType[1])
                .setQuery(QueryBuilders.geoDistanceQuery(geoField)
                        .point(lat, lon)
                        .distance(1, DistanceUnit.KILOMETERS))
                .get();
        long totalHits = searchResponse.getHits().totalHits();
        return totalHits;
    }

}
