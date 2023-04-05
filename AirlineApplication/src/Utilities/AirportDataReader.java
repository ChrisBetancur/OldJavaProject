package Utilities;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AirportDataReader {
   public static JSONArray readJson(String path) throws IOException {
       String resourceName = path;
       BufferedReader reader = new BufferedReader(new FileReader(resourceName));
       StringBuilder stringBuilder = new StringBuilder();
       String line = null;
       String ls = System.getProperty("line.separator");
       while ((line = reader.readLine()) != null) {
           stringBuilder.append(line);
           stringBuilder.append(ls);
       }
       stringBuilder.deleteCharAt(stringBuilder.length() - 1);
       reader.close();

       String content = stringBuilder.toString();
       return stringToJSONArray(content);
   }

   public static JSONArray stringToJSONArray(String content) {
       JSONArray jsonArr = new JSONArray(content);
       return new JSONArray(content);
   }

   public static void printJSONObject(JSONArray jsonArray, int index) {

   }
}
