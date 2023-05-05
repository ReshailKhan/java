import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Object> queryMap = new HashMap<>();
        String m1 = null;
        String m2 = null ;
        queryMap.put("m1",m1);
        queryMap.put("m1",m2);
        System.out.println("queryMap.isEmpty() "+queryMap.isEmpty() + " and queryMap.isnull "+queryMap==null);
    test test1 = new test();
    test1.fnCheckString("Farmer jack realized that big yellow quilts were expensive");
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };
        Boolean[] array2 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  null, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, null,  true };
        System.out.println("CountPassengers: "+CountPassengers.countPassengers(list));
        System.out.println("CountVowels: "+codewars.getCount("abracadabraeeeeeeeeeeeee"));
        System.out.println("CountVowels: "+codewars.getVowels("abracadabraeeeeeeeeeeeee"));
        System.out.println("summation: "+codewars.summation(8));
        System.out.println("findNextSquare: "+codewars.findNextSquare(49));
        System.out.println("printerError: "+codewars.printerError("aaaxbbbbyyhwawiwjjjwwm"));
        System.out.println("map: "+ Arrays.toString(codewars.map(new int[] {1, 2, 3})));
        System.out.println("areYouPlayingBanjo: "+ codewars.areYouPlayingBanjo("rikke"));
        System.out.println("isIsogram: "+ codewars.isIsogram("moOse"));
        System.out.println("isIsogram: "+ codewars.isIsograms("moOse"));
        System.out.println("getMiddle: "+ codewars.getMiddle("mose"));
        System.out.println("countSheeps: "+ codewars.countSheeps(array2));
        System.out.println("ConvertBinaryArrayToInt: "+ codewars.ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 0, 0, 0)) ));
        System.out.println("grow: "+ codewars.grow(new int[]{4,1,1,1,4}));
        System.out.println("filterList: "+ codewars.filterList(List.of(1, 2, "a", "b")));
        System.out.println("palindrome: "+ test.fnCheckPalindrome("racecar"));
        LinkedHashMap<String,String> test2 = new LinkedHashMap<>();
        test2.put("a","b");
        HashSet<String> test = new HashSet<>();
        test.add("a");
        test.add("a");
    }
}
