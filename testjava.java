import java.util.HashMap;
import java.util.Map;

public class testjava {
    public static void main(String[] args) {
        Map<String, Object> queryMap = new HashMap<>();
//        String m1 = "";
//        String m2 = "" ;
//        queryMap.put("m1",m1);
//        queryMap.put("m1",m2);
        System.out.println("queryMap.isEmpty() "+queryMap.isEmpty() );
        System.out.println(" and queryMap.isnull ");
        System.out.println( queryMap==null);
        System.out.println(queryMap.get("m1") + " and "+queryMap.get("m2"));
    }
}
