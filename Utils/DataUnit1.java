package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import tests.Spirit_User_Acc_Sanity;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class DataUnit1 extends Spirit_User_Acc_Sanity {

    @DataProvider
    public Object[][] dataProvider1() {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try {
            Object obj = parser.parse(new FileReader("src/TestData/Test Data1.json"));
            jsonObject = (JSONObject) obj;
        } catch (IOException | ParseException exception) {
            exception.printStackTrace();
        }
        Object[] data = new Object[1];
        HashMap<String, String> hashMap = new LinkedHashMap<>();
        if (jsonObject != null) {
            Set<String> jsonObjKeys = jsonObject.keySet();
            for (String jsonObjKey : jsonObjKeys) {
                hashMap.put(jsonObjKey, (String) jsonObject.get(jsonObjKey));
            }
        }
        data[0]=hashMap;
        return(Object[][])data;

    }

}