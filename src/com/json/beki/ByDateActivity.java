package com.json.beki;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.json.beki.price;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import android.os.Build;
import android.content.pm.PackageManager;
import android.util.Log;

import android.Manifest;
import android.app.ActionBar;
import android.widget.EditText;
import android.widget.Button;



public class ByDateActivity extends Activity {

    private ListView listView;
private String extractedFileName;
private String sdate;
private EditText date;
private Button bview;


private static final int REQUEST_STORAGE_PERMISSION = 1;

    private boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int permission = checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            return permission == PackageManager.PERMISSION_GRANTED;
        }
        return true;
    }

    private void requestStoragePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_STORAGE_PERMISSION);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);

        if (requestCode == REQUEST_STORAGE_PERMISSION && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Storage permission granted, you can proceed with your logic here
   /*         loadDataFromJsonFile();*/
        }
}

private void checkStoragePermission() {
        if (!isStoragePermissionGranted()) {
            requestStoragePermission();
        } else {
          //  loadDataFromJsonFile();
        }
    }



// Create a HashMap to store the multipliers
    private HashMap<String, Double> multipliers = new HashMap<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bydate);



checkStoragePermission();
        
// Populate the multipliers HashMap with the appropriate values
populateMultipliers();
         

       





        listView = findViewById(R.id.listView);

bview = findViewById(R.id.bview);
date = findViewById(R.id.date);


bview.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View v) { Log.d("ByDateActivity", "Button clicked!"); sdate = date.getText().toString(); extractedFileName = "data_" + sdate + ".json"; loadDataAndUpdateAdapter(); } });









        List<DataModel> dataModels = loadDataFromJsonFile("data.json");

double sum = multiplyAndSumValues(dataModels);

int itemCounts = dataModels.size();


        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
String sum2 = String.format("%.2f", sum ); 
            actionBar.setTitle("Sum: " + sum2 + "      SKU: " +itemCounts);
        }

        CustomAdapter adapter = new CustomAdapter(dataModels);
        listView.setAdapter(adapter);




    }

// Populates the multipliers HashMap with the appropriate values
    private void populateMultipliers() {
        multipliers.put("lbt70g", price.plbt70g);
        multipliers.put("lbl70g", price.plbl70g);
        multipliers.put("lbt20g", price.plbt20g);
        multipliers.put("lbl20g", price.plbl20g);
        multipliers.put("lbt150g", price.plbt150g);
        multipliers.put("lbl150g", price.plbl150g);
        multipliers.put("knorraio", price.pknorraio);
        multipliers.put("knorrchicken", price.pknorrchicken);
        multipliers.put("signal30g", price.psignal30g);
        multipliers.put("signal60g", price.psignal60g);
        multipliers.put("signal140g", price.psignal140g);
        multipliers.put("sunlight_40g", price.psunlight_40g);
        multipliers.put("sunlight90g", price.psunlight90g);
        multipliers.put("sunlight160g", price.psunlight160g);
        multipliers.put("sunlightbar_200g", price.psunlightbar_200g);
        multipliers.put("sunlight500g", price.psunlight500g);
        multipliers.put("sunlight1kg", price.psunlight1kg);
        multipliers.put("sunlight5kg", price.psunlight5kg);
        multipliers.put("shacoc350ml", price.pshacoc350ml);
        multipliers.put("concoc350ml", price.pconcoc350ml);
        multipliers.put("shaavo350ml", price.pshaavo350ml);
        multipliers.put("conavo350ml", price.pconavo350ml);
        multipliers.put("shacoc700ml", price.pshacoc700ml);
        multipliers.put("concoc700ml", price.pconcoc700ml);
        multipliers.put("shaavo700ml", price.pshaavo700ml);
        multipliers.put("conavo700ml", price.pconavo700ml);
        multipliers.put("omo40g", price.pomo40g);
        multipliers.put("omo100g", price.pomo100g);
        multipliers.put("omo160g", price.pomo160g);
        multipliers.put("omo500g", price.pomo500g);
        multipliers.put("omo1kg", price.pomo1kg);
        multipliers.put("omo3kg", price.pomo3kg);
        multipliers.put("luxsc70g", price.pluxsc70g);
        multipliers.put("luxst70g", price.pluxst70g);
        multipliers.put("luxsc150g", price.pluxsc150g);
        multipliers.put("luxst150g", price.pluxst150g);
        multipliers.put("shacoc15ml", price.pshacoc15ml);
        multipliers.put("concoc15ml", price.pconcoc15ml);

        // Add more key-value pairs as needed
    }
private double multiplyAndSumValues(List<DataModel> dataModels) {
        double sum = 0;

        for (DataModel dataModel : dataModels) {
            String key = dataModel.getKey();
            double value = dataModel.getValue();
            double multiplier = multipliers.containsKey(key) ? multipliers.get(key) : 1.0;
            double multipliedValue = (double) (value * multiplier);

            sum += multipliedValue;
        }

        return sum;
    }



  private List<DataModel> loadDataFromJsonFile(String fileName) {
    List<DataModel> dataModels = new ArrayList<>();

    try {





    File file = new File("/storage/emulated/0/json_beki/", fileName);

        

        BufferedReader reader = new BufferedReader(new FileReader(file));

        StringBuilder jsonString = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            jsonString.append(line);
        }
        reader.close();

        JSONObject jsonObject = new JSONObject(jsonString.toString());

        Iterator<String> keys = jsonObject.keys();
        while (keys.hasNext()) {
            String key = keys.next();
            int value = jsonObject.getInt(key);
            int firstResult;
            int secondResult;
            int thirdResult;

            if (key.equals("lbt150g") || key.equals("lbl150g") || key.equals("luxsc150g") || key.equals("luxst150g") ) {
                firstResult = value / 36;
                secondResult = (value % 36) / 12;
                thirdResult = (value % 36) % 12;
            } else if (key.equals("lbt70g") || key.equals("lbl70g") || key.equals("sunlight90g") || key.equals("luxsc70g") || key.equals("luxst70g")|| key.equals("signal60g") || key.equals("omo100g")) {
                firstResult = value / 72;
                secondResult = (value % 72) / 12;
                thirdResult = (value % 72) % 12;
            } else if (key.equals("lbt20g") || key.equals("signal30g") || key.equals("lbl20g")) {
                firstResult = value / 144;
                secondResult = (value % 144) / 12;
                thirdResult = (value % 144) % 12;
            } else if (key.equals("sunlightbar_200g")) {
                firstResult = value / 50;
                secondResult = (value % 50) / 12;
                thirdResult = (value % 50) % 12;
            } else if (key.equals("signal140g") || key.equals("sunlight160g") || key.equals("omo160g")) {
                firstResult = value / 48;
                secondResult = (value % 48) / 12;
                thirdResult = (value % 48) % 12;
            } else if (key.equals("omo40g")) {
                firstResult = value / 100;
                secondResult = (value % 100) / 12;
                thirdResult = (value % 100) % 12;
            } else if (key.equals("sunlight_40g") || key.equals("sunlight40g") ){
                firstResult = value / 100;
                secondResult = (value % 100) / 12;
                thirdResult = (value % 100) % 12;
            } else if (key.equals("sunlight5kg")) {
                firstResult = value ;
                secondResult = 0;
                thirdResult = 0;
            } else if (key.equals("sunlight1kg") || key.equals("omo1kg") || key.equals("shacoc350ml") || key.equals("concoc350ml") || key.equals("shaavo350ml") || key.equals("conavo350ml") || key.equals("shacoc700ml") || key.equals("concoc700ml") || key.equals("shaavo700ml") || key.equals("conavo700ml")) {
                firstResult = value / 12;
                secondResult = 0;
                thirdResult = value % 12;

               
            }else if (key.equals("knorraio") || key.equals("knorrchicken")) {
                firstResult = value / 240;
                secondResult = (value % 240) / 12;
                thirdResult = (value % 240) % 12;
            }else if (key.equals("sunlight500g") || key.equals("omo500g")) {
                firstResult = value / 24;
                secondResult = (value % 24) / 12;
                thirdResult = (value % 24) % 12;
            } else if (key.equals("omo3kg")) {
                firstResult = value / 4;
                secondResult = 0;
                thirdResult = (value % 4);
            }
else if (key.equals("shacoc15ml")|| key.equals("concoc15ml")) {
                firstResult = value / 360;
                secondResult = (value % 360)/12;
                thirdResult = (value % 360)%12;
            }

else if (key.equals("sig30g")) {
                firstResult = value / 1440;
                secondResult = (value % 1440)/12;
                thirdResult = (value % 1440)%12;
            }





 else {
                firstResult = value / 72;
                secondResult = (value % 72) / 12;
                thirdResult = (value % 72) % 12;
            }

            if (value != 0) { // Filter out data models with value = 0
                DataModel dataModel = new DataModel(key, value, firstResult, secondResult, thirdResult);
                dataModels.add(dataModel);
            }
        }
    } catch (IOException | JSONException e) {
        e.printStackTrace();
    }

    return dataModels;
}





    private class CustomAdapter extends ArrayAdapter<DataModel> {

        CustomAdapter(List<DataModel> dataModels) {
            super(ByDateActivity.this, 0, dataModels);
        }

@Override
public View getView(int position, View convertView, ViewGroup parent) {
    if (convertView == null) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
    }

    TextView keyTextView = convertView.findViewById(R.id.keyTextView);


/*
    TextView valueTextView = convertView.findViewById(R.id.valueTextView);
*/


    TextView firstResultTextView = convertView.findViewById(R.id.firstResultTextView);
    TextView secondResultTextView = convertView.findViewById(R.id.secondResultTextView);
    TextView thirdResultTextView = convertView.findViewById(R.id.thirdResultTextView);

    DataModel dataModel = getItem(position);

    keyTextView.setText(dataModel.getKey());




/*

    valueTextView.setText(String.valueOf(dataModel.getValue()));
   


*/

 firstResultTextView.setText(String.valueOf(dataModel.getFirstResult()));
    secondResultTextView.setText(String.valueOf(dataModel.getSecondResult()));
    thirdResultTextView.setText(String.valueOf(dataModel.getThirdResult()));

    return convertView;












 


}
}
private void loadDataAndUpdateAdapter() {
    List<DataModel> updatedDataModels = loadDataFromJsonFile(extractedFileName);
    CustomAdapter adapter = new CustomAdapter(updatedDataModels);
    listView.setAdapter(adapter);

    // Calculate the sum and update the ActionBar title
    double sum = multiplyAndSumValues(updatedDataModels);

int itemCount = updatedDataModels.size();

    ActionBar actionBar = getActionBar();
    if (actionBar != null) {
        String sum2 = String.format("%.2f", sum);
        actionBar.setTitle("Sum: " + sum2 + "      SKU: " +itemCount);
    }
}

}