package Interview.staticExample;

import java.util.ArrayList;

public class CheckBooleanArray {
    static {
        for (int k =0;k<StaticBlock.staticArrayListBoolean.size();k++) {
            if (StaticBlock.staticArrayListBoolean.get(k)){
                System.out.println("Number is divisible by 2.");
            }else {
                System.out.println("Number is not divisible by 2.");
            }
        }
    }
}
