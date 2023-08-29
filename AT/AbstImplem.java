package AT;

public class AbstImplem extends Abst {
    @Override
    void method1() {
        System.out.println("Override method1 of AbstImplem extends Abst.");
        this.print("ajslk");
    }


    static void hello(){
        System.out.println("static method from AbstImplem is called ");
    }
    static void hello(String str){
        System.out.println("static method from AbstImplem is called "+str);
    }

    static String hello2(){
        return "static method hello2 from AbstImplem is called ";
    }
//    static boolean hello2(){
//        return true;
//    }
}
