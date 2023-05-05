package Interface;

public class Main {
    public static void main(String[] args) {
        var calculator = new TaxCalculator2018(10000);
        var report = new TaxReport(calculator);
        report.show();

        report.setCalculator(new taxCalculator2019() );
        report.show();

        report.show1(new taxCalculator2019());
    }
}
