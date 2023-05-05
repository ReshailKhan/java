package AT;

import MOSH.Array;

public class main {
    public static void main(String[] args) {
        AbstImplem abs = new AbstImplem();
        abs.method1();
        abs.print(" 1");


        InterImplem interImplem = new InterImplem();
        interImplem.method1();
        interImplem.print(" 1");
    }
}
