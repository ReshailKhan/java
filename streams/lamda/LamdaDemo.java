package streams.lamda;

public class LamdaDemo {

    public static void main(String[] arg){
        show();

    }
    public static void show(){
        //greeting(new ConsolePrinter());
//        greeting(new Printer() {
//            @Override
//            public void print(String message) {
//
//            }
//        });
        greeting((str) -> {
            System.out.println(str);
        });
    }
    public static void greeting(Printer printer){
        printer.print("hello world >>>>>>>>>.");
    }

}

