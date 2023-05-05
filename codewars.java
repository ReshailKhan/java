
import java.util.*;
import java.lang.Math;
public class codewars {
    public static int getCount(String str) {
        int vowelCount = 0;
        ;
        char[] strArry = str.toCharArray();
        for (int i = 0; i < str.length(); i++
        ) {
            if (strArry[i] == ('a') || strArry[i] == ('e') || strArry[i] == ('i') || strArry[i] == ('o') || strArry[i] == ('u')) {
                vowelCount += 1;
            }
        }
        return vowelCount;
    }

    public static int getVowels(String str) {
        return str.replaceAll("[^aeiou]", "").length();
    }

    public static int summation(int n) {
        int res = 0;
        boolean flag = true;
        while (flag) {
            res += n;
            n -= 1;
            if (n == 0) flag = false;
        }
        return res;
    }

    public static long findNextSquare(long sq) {
        double sqr = Math.sqrt(Double.parseDouble(String.valueOf(sq)));
        int sqrInt = (int) sqr;
        if (Math.ceil(sqr) == sqrInt) {
            return (long) Math.pow(sqrInt + 1, 2);
        }
        return -1;
    }

    public static String printerError(String s) {
        // your code
        s = s.toLowerCase();
        System.out.println();
        String errorString = s.replaceAll("[^n-z]", "");
        String correctString = s.replaceAll("[n-z]", "");
        String str = errorString.length() + "/" + s.length();
        return str;
    }

    public static int[] map(int[] arr) {
        int[] arrNew = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrNew[i] = arr[i] + arr[i];
        }
        return arrNew;
    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        char[] firstCharacter = name.toCharArray();
        if (firstCharacter[0] == 'r' || firstCharacter[0] == 'R') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }

    public static boolean isIsogram(String str) {
        // ...
        System.out.println();
        str = str.toLowerCase();
        int length = str.length();
        char[] firstCharacter = str.toCharArray();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (firstCharacter[i] == firstCharacter[j]) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean isIsograms(String str) {
        Set<Character> letters = new HashSet<>();

        Map<String, Integer> charMap = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (letters.contains(str.toLowerCase().charAt(i)))
                return false;
            letters.add(str.charAt(i));
        }

        for (char c : str.toCharArray()) {
               String charStr = (c + "").toLowerCase();
               if (charMap.get(charStr) == null)
                   charMap.put(charStr, 1);
               else return false;
        }


        return true;
    }

    public static String getMiddle(String word) {
        //Code goes here!
        int wordInt = word.length() / 2;
        if (word.length() % 2 == 0)
            return word.substring(wordInt - 1, wordInt + 1);
        return word.substring(wordInt, wordInt + 1);
    }

    public static int[] invert(int[] array) {
        if (array.length >= 1)
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i] * -1;
            }
        return array;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (Boolean arrayOfSheep : arrayOfSheeps) {
            System.out.println(arrayOfSheep);
            if (arrayOfSheep != null && arrayOfSheep)
                count ++;

            // count += 1 = count = count + 1
        }
        return count;
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        System.out.println("input: "+ binary.toString());
        int res = 0 ;
        for (int i = 0 ; i < binary.size();i++){
            res =  (int) ((binary.get(binary.size()-(i+1)) * Math.pow(2,i))+res);
        }
        return res;
    }

    public static int grow(int[] x){
        int res = 1;
        for (int i :x) {
            res = i * res;
        }
        return res;
    }

    public int Liters(double time)  {
        //Your code goes here! Hint: You should change that -1
        return (int) (time*0.5);
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        List<Object> listInt = new ArrayList<>();
        for (Object obj:list) {
            String str = String.valueOf(obj);
            String str1 = str.replaceAll("[a-b]", "");
            if(!str1.equals(""))
                listInt.add(str1);
        }
        return listInt;
    }
    public static List<Object> filterList1(final List<Object> list) {
        // Return the List with the Strings filtered out
        Object[] listInt = new Object[list.size()];
        List<Object> myList = new ArrayList<>();
        String result = "";
        int count = 0;
        for (Object obj:list) {
            String str = String.valueOf(obj);
            str = str.replaceAll("[a-b]", "");
            if(!str.equals("")) {
                myList.add(str);
                //listInt[count++] = str;
                result += str + ",";
            }
        }
        System.out.println(result);
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
        Object[] arr = result.split(",");
        return List.copyOf(myList);
    }

}
