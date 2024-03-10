package Interview.staticExample;

import java.util.ArrayList;

public class StaticBlock {
    public static ArrayList<Boolean> staticArrayListBoolean = new ArrayList<Boolean>();
    static {

        // This is a static block
        System.out.println("This is executed when the class is loaded.");
        for (int i=0; i<StaticConnectionListClass.staticArrayListInt.size();i++) {
            System.out.println(StaticConnectionListClass.staticArrayListInt.get(i)+ " >>>>>>>>>>>>>>>>>>>>");
            if(StaticConnectionListClass.staticArrayListInt.get(i)%2==0){
                staticArrayListBoolean.add(true);
            }else {
                staticArrayListBoolean.add(false);
            }
        }
    }
}
