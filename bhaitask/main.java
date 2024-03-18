package bhaitask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class main {
    public static void main(String[] args) {;
        String fileName = "file.json";
        String filePath = "bhaitask/file.json";
        try {
            String jsonString = new String(Files.readAllBytes(Paths.get(filePath)));
            jsonString = jsonString.substring(1,jsonString.length()-1);
            String[] pairs = jsonString.split(",");
            HashMap<String, Object> hashMap = new HashMap<>();
            for (String pair : pairs) {
                String[] keyValue = pair.split(":");
                if (keyValue.length == 2) {
                    hashMap.put(keyValue[0], keyValue[1]);
                } else {
                    System.out.println("Invalid key-value pair: " + pair);
                }
            }
            System.out.println("Final result: "+hashMap);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
