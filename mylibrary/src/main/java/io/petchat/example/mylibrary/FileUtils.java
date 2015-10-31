package io.petchat.example.mylibrary;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by zishell on 10/31/15.
 */
public class FileUtils {

    // each line of the file is a json string
    public static JSONArray readSensorFile(final String filePath) {
        try {
            FileReader fileReader = new FileReader(new File(filePath));
            BufferedReader br = new BufferedReader(fileReader);
            String line = null;
            JSONArray sensors = new JSONArray();
            JSONObject detectResults = new JSONObject();
            while ((line = br.readLine()) != null) {
                try {
                    JSONObject obj = new JSONObject(line);
                    sensors.put(obj);

                } catch (Exception e) {
                    continue;
                }
            }
            return sensors;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
