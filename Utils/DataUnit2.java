package Utils;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
import tests.Spirit_User_Acc_Sanity;

import java.io.FileReader;
import java.io.IOException;

public class DataUnit2 extends Spirit_User_Acc_Sanity {

        @DataProvider
        public Object[] dataProvider1() {}

        @DataProvider
        public Object[] dataProvider2() {

            JSONParser parser = new JSONParser();
            JSONObject jsonObject;

            // Read JSON file
            Object obj = null;
            try {
                obj = parser.parse(new FileReader("src/TestData/Test Data2.json"));
            } catch (IOException | ParseException e) {
                e.printStackTrace();
            }
            jsonObject = (JSONObject) obj;

            //Extract array data  from JSONObject
            assert jsonObject != null;
            JSONArray formInfo = (JSONArray) jsonObject.get("form info");

            //String array to store JSONArray data
            String[] dataArray = new String[formInfo.size()];

            //JSONObject to read each JSONArray object
            JSONObject formInfoData;
            String userType, email, password, fsNumber;

            // GEt data from JSONArray and store in String Array
            for (int i = 0; i < formInfo.size(); i++) {
                formInfoData = (JSONObject) formInfo.get(i);
                userType = (String) formInfoData.get("User Type");
                email = (String) formInfoData.get("Email");
                password = (String) formInfoData.get("Password");
                fsNumber = (String) formInfoData.get("FS Number");

                dataArray[i] = userType + "," + email + "," + password + "," + fsNumber;

            }
            return dataArray;
        }
    }

