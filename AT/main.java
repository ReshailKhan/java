package AT;

import MOSH.Array;

import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {
        AbstImplem abs = new AbstImplem();
        abs.method1();
        abs.print(" 1");
        AbstImplem.hello("dsf");
        System.out.println(AbstImplem.hello2());

        Abst abs2 = new AbstImplem();
        InterImplem interImplem = new InterImplem();
        interImplem.method1();
        interImplem.print(" 1");

        Integer one =1;
        Integer one1 = 2;

        if(one.equals(one1))
            System.out.println(" one1.equals(one) ");

        if(one1==one)
            System.out.println(" one1 == one ");

        Map<String,String> map = new HashMap<>();
        map.put("string","string1");
        Map<String,String> map1 = new HashMap<>();
        map1.put("string","string1");
        if(map.equals(map1))
            System.out.println("map.equals(map1)");
        if(map == map1)
            System.out.println("map == map1");

        System.out.println("map "+ map.hashCode());
        System.out.println("map1 "+ map1.hashCode());
    }

    public int hello(int a){
        return a;
    }

    public int hello(String a){
        return 1;
    }

//    public String hello(String a){
//        return a+"";
//    }
}
