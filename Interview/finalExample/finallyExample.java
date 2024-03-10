package Interview.finalExample;

import java.util.ArrayList;

public class finallyExample {

    public void fnNumberChecker(ArrayList<Integer> integerArrayList){
        try {
            // Code that may throw an exception
            integerArrayList.get(100);
        }
        catch (Exception e) {
            System.out.println("Enter into catch block "+e.getLocalizedMessage());
            // Exception handling code
        }
        finally {
            System.out.println("Enter into finally block");
            // Code that should be executed regardless of whether an exception occurred or not
            // e.g., releasing resources
        }
    }
}
