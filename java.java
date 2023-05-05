import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java {
    public static void main(String[] args) {
        A a = new B();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println(now);
        //B b = new A();

    }
}
