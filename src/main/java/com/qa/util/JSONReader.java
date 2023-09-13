package com.qa.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
public class JSONReader {


    public  JsonObject readJsonData(String filePath) {
        try {
            FileReader reader = new FileReader(filePath);
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            reader.close();
            return jsonObject;
        } catch (Exception e) {
            e.printStackTrace();
            return null; // Handle the error as needed
        }
    }
}
