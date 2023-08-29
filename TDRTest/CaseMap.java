package TDRTest;

import java.util.HashMap;
import java.util.Map;

public class CaseMap {
    private static final Map<String, String> myMap = new HashMap<>();
    static {
        myMap.put("1", "one");
        myMap.put("2", "two");
        myMap.put("3", "two");
        myMap.put("4", "two");
        myMap.put("5", "two");
        myMap.put("6", "two");
        myMap.put("7", "two");
        myMap.put("8", "two");
        myMap.put("9", "two");
        myMap.put("10", "two");
        myMap.put("11", "two");
        myMap.put("11", "two");
        myMap.put("11", "two");
        myMap.put("13", "sout");

    }

    public static String getMethodName(String str){
        return myMap.get(str);
    }


}
