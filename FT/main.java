package FT;

import java.util.ArrayList;
import java.util.Collections;

public class main {
    public static void main(String[] args) {
        ArrayList<ftdto> ft = new ArrayList<>();
        ft.add(new ftdto("A1"));
        ft.add(new ftdto("AA1"));
        ft.add(new ftdto("B1"));
        ft.add(new ftdto("AA22"));
        ft.add(new ftdto("CC1"));
       // ft.add(new ftdto("A2"));
        ft.add(new ftdto("AB1"));
        ft.add(new ftdto("BB1"));
        ft.add(new ftdto("AA2"));
        ft.add(new ftdto("AA10"));
        ft.add(new ftdto("AAA10"));
        ft.sort(new AlphaNumericComparator());
        for (ftdto ftDto:ft
             ) {
            System.out.println(ftDto.getSerialNumber()+ " >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>...");
        }
    }
}
