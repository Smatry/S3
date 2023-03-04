package Utils;

import jdk.nashorn.internal.parser.JSONParser;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import tests.Spirit_Home_Sanity;
import tests.Spirit_My_Trips_Sanity;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class DataUnit extends Spirit_My_Trips_Sanity {

    @DataProvider
    public Object[] dataProvider1() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;


        //Read JSON file
        try {
            Object obj = parser.parse (new FileReader("src/TestData/Test Data.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
         //Array to store JSON data
          Object[] data = new Object[1];

         //Store JSON data as ke/value paris in a hasMap
        HashMap<String,String> hashMap = new LinkedHashMap<>();
        if (jsonObject != null){
            Set<String> jsonObjKeys = jsonObject.keySet();
            for (String jsonObjKey : jsonObjKeys) {
                hashMap.put(jsonObjKey,(String) jsonObject.get(jsonObjKey));
            }
        } else {
            log.error("Error retrieving JSON data");
            throw new RuntimeException();
        }
         //Store HashMap in an array and return array
        data[0] = hashMap;
        return data;

    }
}
