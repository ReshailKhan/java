import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class test {


    public boolean fnCheckString(String str){
        int i = 'f';
        System.out.println(i);

        str = str.replace(" ","");
        System.out.println(str);

        str = str.toLowerCase();
        System.out.println(str);
        boolean[] visited = new boolean[26];
        List<Character> alphabets = new ArrayList<>();
        alphabets.add('a');
        alphabets.add('b');
        alphabets.add('c');
        alphabets.add('d');
        alphabets.add('e');
        alphabets.add('f');
        alphabets.add('g');
        alphabets.add('h');
        alphabets.add('i');
        alphabets.add('j');
        alphabets.add('k');
        alphabets.add('l');
        alphabets.add('m');
        alphabets.add('n');
        alphabets.add('o');
        alphabets.add('p');
        alphabets.add('q');
        alphabets.add('r');
        alphabets.add('s');
        alphabets.add('t');
        alphabets.add('u');
        alphabets.add('v');
        alphabets.add('w');
        alphabets.add('x');
        alphabets.add('y');
        alphabets.add('z');

        int lenght = str.length();
        for (int id=0; id < lenght; id ++){
            System.out.println("id : "+id);
            System.out.println("+ "+str.charAt(id)+" +");
            if (alphabets.contains(str.charAt(id))){
                System.out.println("id: " + id);

                alphabets.remove(Character.valueOf(str.charAt(id)));
            }
        }
        if (alphabets.isEmpty()){
            System.out.println("Given String contains all aphatphet");
        }else {
            System.out.println("Given String does not contains all aphatphet");
        }

        return false;
    }

    public static String fnCheckPalindrome(String str ){
        String reversedStr = "";
        char[] charList = str.toCharArray();
        for(int i = 1; i <= str.length(); i++ ){
            reversedStr = reversedStr+charList[i-1]+"";
        }
        System.out.println(reversedStr+" <><><><><><");
        return "";
    }

}
