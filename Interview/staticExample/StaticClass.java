package Interview.staticExample;

import java.util.ArrayList;

public class StaticClass {
    int i =1;
    ArrayList<Integer> arrayListInt = new ArrayList<Integer>();



    static int j =1;



    void soutMethodStaticClass(){
        System.out.println("soutMethodStaticClass >>>>>>>>>>>>>>>>>.");
    }
    static class StaticNestedClass {
        // Members of StaticNestedClass
        int k = 2;
        void soutMethodStaticNestedClass(){
            System.out.println("soutMethodStaticNestedClass >>>>>>>>>>>>>>>>>." + j+k);
        }
    }
}
