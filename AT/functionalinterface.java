package AT;


interface Doable{
    default void doIt(){
        System.out.println("Do it now");
    }
}
@FunctionalInterface
interface Sayable extends Doable{
    void say(String msg);   // abstract method
    default void doIt(String string){
        System.out.println("Do it now Sayable "+string);
    }
}
public class  functionalinterface implements Sayable{
    public void say(String msg){
        System.out.println(msg+ " >>>>>>>>>>>>");
    }
    public static void main(String[] args) {
        functionalinterface fie = new functionalinterface();
        fie.say("Hello there");
        fie.doIt();
        fie.doIt("Hello there");
    }
}
