package com.json.beki;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

import org.json.*;

public class ExternalStorage
{
	private static final String STORAGE_FILE_PATH = "/sdcard/detail.json";
public void storeListAsJson(ArrayList<String> items) {
    JSONArray jArray;

    try {
        File file = new File(STORAGE_FILE_PATH);

        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] buffer = new byte[(int) file.length()];
            fileInputStream.read(buffer);
            fileInputStream.close();

            String existingJson = new String(buffer);
            jArray = new JSONArray(existingJson);
        } else {
            jArray = new JSONArray();
        }

        jArray.put(new JSONObject(items.get(0)));

        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(jArray.toString().getBytes());
        fileOutputStream.close();
    } catch (Exception ex) {
        // TODO: handle error
    }
}







public ArrayList<String> loadListAsJson() {
    ArrayList<String> output = new ArrayList<>();

    try {
        File f = new File(STORAGE_FILE_PATH);
        FileInputStream file = new FileInputStream(STORAGE_FILE_PATH);
        byte[] b = new byte[(int) f.length()];
        file.read(b);
        file.close();

        JSONArray jArray = new JSONArray(new String(b));

        for (int i = 0; i < jArray.length(); i++) {
            JSONObject jsonObject = jArray.getJSONObject(i);
            StringBuilder stringBuilder = new StringBuilder();

            Iterator<String> keys = jsonObject.keys();
            while (keys.hasNext()) {
                String key = keys.next();
                int value = jsonObject.optInt(key, 0);

                if (value > 0) {
                    stringBuilder.append(key).append(": ").append(value).append(", ");
                }
            }

            String result = stringBuilder.toString().trim();
            if (result.endsWith(",")) {
                result = result.substring(0, result.length() - 1);
            }
            output.add(result);
        }

    } catch (Exception ex) {
        // TODO: handle error
    }

    return output;
}


}