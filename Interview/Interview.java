package Interview;

import java.util.HashMap;
import java.util.Map;

public class Interview {
    public static void main(String[] args) {
        int x = 5, y = 10;
        try {
            y /= x;
            System.out.println(y);
        } catch (Exception e) {
            System.out.println("Error");
        } finally {
            System.out.println("Finally");
        }

        Student s0 = new Student();
        Student s1 = new Student();
        s0.marks(s1);
        System.out.println("frequencyProduct: "+frequencyProduct(6,"aaabbc"));
        System.out.println("frequencyProduct: "+frequencyProduct(6,"aaabb"));
    }

    public static int frequencyProduct(int N,String S) {
        //this is default OUTPUT. You can change it.
        int result = -404;
        int strLenght = S.length();
        //write your Logic here:
        Map<Character, Integer> map = new HashMap<>();
        if (N == strLenght) {
            for (int i = 0; i <= strLenght-1; i++) {
                if (map.containsKey(S.charAt(i))) {
                    map.put(S.charAt(i), map.get(S.charAt(i)) + 1);
                } else {
                    map.put(S.charAt(i), 1);
                }
            }
            int res = 1;
            for (int i:map.values()
            ) {
                res *=i;
            }
            result = res;
        }
        return result;
    }

}
