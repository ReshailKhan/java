package Interview.staticExample;

import java.util.ArrayList;

public class Myclass {
    private int x = 10;

    static int objectCounter = 0;
    static int m1() {
        Myclass myclassObj = new Myclass();
        int y = myclassObj.x;
        System.out.println(y);
        return y;
    }
    static {
        objectCounter++;
        System.out.println("New Object created. Total number of objects: "+objectCounter);
    }

    public static void main(String[] args) {
        Myclass myclass1 = new Myclass();
        myclass1.m1();
        StaticClass staticvariablepract = new StaticClass();
        System.out.println(StaticClass.j);

        Myclass myclass2 = new Myclass();
        Myclass myclass3 = new Myclass();
        staticvariablepract.soutMethodStaticClass();
        System.out.println(StaticClass.j);
        StaticClass.StaticNestedClass staticNestedClass = new StaticClass.StaticNestedClass();
        staticNestedClass.soutMethodStaticNestedClass();
        System.out.println(StaticClass.j);
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(101);
        list.add(202);
        list.add(301);
        list.add(402);
        list.add(501);
        list.add(602);
        list.add(701);
        list.add(802);
        list.add(901);
        list.add(1002);
        StaticConnectionListClass.staticArrayListInt = list;
        StaticBlock staticBlock = new StaticBlock();
        System.out.println(StaticBlock.staticArrayListBoolean);
        CheckBooleanArray checkBooleanArray = new CheckBooleanArray();
    }
}
