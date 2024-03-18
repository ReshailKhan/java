package bhaitask;

import org.json.JSONObject;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestCustomObject {

    public static void main(String[] args) throws IOException {
        String filePath = "bhaitask/file.json";

        getDataFromJsonObject(filePath);
    }

    static void getDataFromJsonObject(String filePath) {

        // Read JSON file
        String jsonString = null;
        try {
            jsonString = new String(Files.readAllBytes(Paths.get(filePath)), StandardCharsets.UTF_8);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(jsonString);

        // Parse JSON string into JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        for (String key : jsonObject.keySet()) {
            System.out.println("\nKey ======= " + key);

            if (jsonObject.get(key) instanceof String ) {
                String str = (String) jsonObject.get(key);
                System.out.println("String - > " + str);
            }

            else if (jsonObject.get(key) instanceof JSONObject) {
                JSONObject map = (JSONObject) jsonObject.get(key);
                System.out.println("Map -> " + map);
                for (String nestedKey : map.keySet()) {
                    System.out.println("Map -> " + map.get(nestedKey));
                }

            }

        }

    }
}
