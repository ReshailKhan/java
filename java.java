import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class java {
    public static void main(String[] args) {
        A a = new B();
        
        // B B = new A();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
        System.out.println(now);
        //B b = new A();
        String inputString = "Muhammad Reshail Khan";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Convert the string to lowercase (optional, to ignore case)
        inputString = inputString.toLowerCase();

        // Iterate through each character in the input string
        for (char c : inputString.toCharArray()) {

            if (charCountMap.containsKey(c))
                charCountMap.put(c,charCountMap.get(c)+1);
            else
                charCountMap.put(c, 1);
        }

        // Iterate through the map entries and print the character count
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            System.out.println("Character '" + c + "' appears " + count + " times.");

        }
    }
}
