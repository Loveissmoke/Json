package com.json.beki;
import android.graphics.drawable.Drawable;


import android.widget.LinearLayout;



import com.json.beki.StoragePermissionManager;
import com.json.beki.SearchFilter;
import com.json.beki.price;
import com.json.beki.ExternalStorage;
import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.View;
import android.widget.EditText;
import android.view.Menu;
import android.view.MenuItem;
import android.os.Environment;
import java.io.File;
import java.io.FileWriter;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.IOException;



import android.widget.Toast;
import java.io.BufferedReader;
import java.io.FileReader;
import android.content.Intent;
import android.app.ActionBar;
import android.text.Editable;
import android.text.*;
import java.util.*;





public class MainActivity extends Activity {

private StoragePermissionManager storagePermissionManager;

private ExternalStorage mExternalStorage;

LinearLayout linearLayoutContainer;

SearchFilter searchFilter;

    EditText lbt70c,lbt70d,lbt70p,  lbl70c,lbl70d,lbl70p,  lbt150c,lbt150d,lbt150p, lbl150c,lbl150d,lbl150p,lbt20c,lbt20d,lbt20p, lbl20c,lbl20d,lbl20p, knorraioc,knorraiod,knorraiop,knorrchknc,knorrchknd,knorrchknp, sig60c,sig60d,sig60p, sig30c,sig30d,sig30p, sig140c,sig140d,sig140p, sun40c,sun40d,sun40p, sun90c,sun90d,sun90p, sun160c,sun160d,sun160p, sunbarc,sunbard,sunbarp, sun500c,sun500d,sun500p, sun950c,sun950p, sun1kc,sun1kp, sun5kc,  shacoc350c,shacoc350p, concoc350c,concoc350p, shaavo350c,shaavo350p, conavo350c,conavo350p, shacoc700c,shacoc700p, concoc700c,concoc700p, shaavo700c,shaavo700p, conavo700c,conavo700p, omo40c,omo40d,omo40p, omo100c,omo100d,omo100p, omo160c,omo160d,omo160p, omo500c,omo500d,omo500p, omo1kc,omo1kp, omo3kc,omo3kp, luxsc70c,luxsc70d,luxsc70p, luxst70c,luxst70d,luxst70p, luxsc150c,luxsc150d,luxsc150p, luxst150c,luxst150d,luxst150p,shacoc15c,shacoc15d,shacoc15p,concoc15c,concoc15d,concoc15p;








    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
        setContentView(R.layout.activity_main);

linearLayoutContainer = findViewById(R.id.linearLayoutContainer);

storagePermissionManager = new StoragePermissionManager(this);
        storagePermissionManager.checkStoragePermission();



mExternalStorage = new ExternalStorage();




lbt70c = findViewById(R.id.lbt70c);
lbt70d = findViewById(R.id.lbt70d);
lbt70p = findViewById(R.id.lbt70p);

lbl70c = findViewById(R.id.lbl70c);
lbl70d = findViewById(R.id.lbl70d);
lbl70p = findViewById(R.id.lbl70p);

lbt150c = findViewById(R.id.lbt150c);
lbt150d = findViewById(R.id.lbt150d);
lbt150p = findViewById(R.id.lbt150p);

lbl150c = findViewById(R.id.lbl150c);
lbl150d = findViewById(R.id.lbl150d);
lbl150p = findViewById(R.id.lbl150p);

lbt20c = findViewById(R.id.lbt20c);
lbt20d = findViewById(R.id.lbt20d);
lbt20p = findViewById(R.id.lbt20p);

lbl20c = findViewById(R.id.lbl20c);
lbl20d = findViewById(R.id.lbl20d);
lbl20p = findViewById(R.id.lbl20p);

knorraioc = findViewById(R.id.knorraioc);
knorraiod = findViewById(R.id.knorraiod);
knorraiop = findViewById(R.id.knorraiop);

knorrchknc = findViewById(R.id.knorrchknc);
knorrchknd = findViewById(R.id.knorrchknd);
knorrchknp = findViewById(R.id.knorrchknp);

sig30c = findViewById(R.id.sig30c);
sig30d = findViewById(R.id.sig30d);
sig30p = findViewById(R.id.sig30p);

sig60c = findViewById(R.id.sig60c);
sig60d = findViewById(R.id.sig60d);
sig60p = findViewById(R.id.sig60p);

sig140c = findViewById(R.id.sig140c);
sig140d = findViewById(R.id.sig140d);
sig140p = findViewById(R.id.sig140p);

sun40c = findViewById(R.id.sun40c);
sun40d = findViewById(R.id.sun40d);
sun40p = findViewById(R.id.sun40p);

sun90c = findViewById(R.id.sun90c);
sun90d = findViewById(R.id.sun90d);
sun90p = findViewById(R.id.sun90p);

sun160c = findViewById(R.id.sun160c);
sun160d = findViewById(R.id.sun160d);
sun160p = findViewById(R.id.sun160p);

sunbarc = findViewById(R.id.sunbarc);
sunbard = findViewById(R.id.sunbard);
sunbarp = findViewById(R.id.sunbarp);

sun500c = findViewById(R.id.sun500c);
sun500d = findViewById(R.id.sun500d);
sun500p = findViewById(R.id.sun500p);
/*
sun950c = findViewById(R.id.sun950c);
sun950p = findViewById(R.id.sun950p);
*/
sun1kc = findViewById(R.id.sun1kc);
sun1kp = findViewById(R.id.sun1kp);

sun5kc = findViewById(R.id.sun5kc);

shacoc350c = findViewById(R.id.shacoc350c);
shacoc350p = findViewById(R.id.shacoc350p);

concoc350c = findViewById(R.id.concoc350c);
concoc350p = findViewById(R.id.concoc350p);

shaavo350c = findViewById(R.id.shaavo350c);
shaavo350p = findViewById(R.id.shaavo350p);

conavo350c = findViewById(R.id.conavo350c);
conavo350p = findViewById(R.id.conavo350p);

shacoc700c = findViewById(R.id.shacoc700c);
shacoc700p = findViewById(R.id.shacoc700p);

concoc700c = findViewById(R.id.concoc700c);
concoc700p = findViewById(R.id.concoc700p);

shaavo700c = findViewById(R.id.shaavo700c);
shaavo700p = findViewById(R.id.shaavo700p);

conavo700c = findViewById(R.id.conavo700c);
conavo700p = findViewById(R.id.conavo700p);

omo40c = findViewById(R.id.omo50c);
omo40d = findViewById(R.id.omo50d);
omo40p = findViewById(R.id.omo50p);

omo100c = findViewById(R.id.omo100c);
omo100d = findViewById(R.id.omo100d);
omo100p = findViewById(R.id.omo100p);

omo160c = findViewById(R.id.omo160c);
omo160d = findViewById(R.id.omo160d);
omo160p = findViewById(R.id.omo160p);

omo500c = findViewById(R.id.omo500c);
omo500d = findViewById(R.id.omo500d);
omo500p = findViewById(R.id.omo500p);

omo1kc = findViewById(R.id.omo1kc);
omo1kp = findViewById(R.id.omo1kp);

omo3kc = findViewById(R.id.omo3kc);
omo3kp = findViewById(R.id.omo3kp);

luxsc70c = findViewById(R.id.luxsc70c);
luxsc70d = findViewById(R.id.luxsc70d);
luxsc70p = findViewById(R.id.luxsc70p);

luxst70c = findViewById(R.id.luxst70c);
luxst70d = findViewById(R.id.luxst70d);
luxst70p = findViewById(R.id.luxst70p);

luxsc150c = findViewById(R.id.luxsc150c);
luxsc150d = findViewById(R.id.luxsc150d);
luxsc150p = findViewById(R.id.luxsc150p);

luxst150c = findViewById(R.id.luxst150c);
luxst150d = findViewById(R.id.luxst150d);
luxst150p = findViewById(R.id.luxst150p);

shacoc15c = findViewById(R.id.shacoc15c);
shacoc15d = findViewById(R.id.shacoc15d);
shacoc15p = findViewById(R.id.shacoc15p);

concoc15c = findViewById(R.id.concoc15c);
concoc15d = findViewById(R.id.concoc15d);
concoc15p = findViewById(R.id.concoc15p);


 lbt70c.addTextChangedListener(new CustomTextWatcher());
lbt70d.addTextChangedListener(new CustomTextWatcher());
lbt70p.addTextChangedListener(new CustomTextWatcher());
 lbl70c.addTextChangedListener(new CustomTextWatcher());
lbl70d.addTextChangedListener(new CustomTextWatcher());
lbl70p.addTextChangedListener(new CustomTextWatcher());
  lbt150c.addTextChangedListener(new CustomTextWatcher());
lbt150d.addTextChangedListener(new CustomTextWatcher());
lbt150p.addTextChangedListener(new CustomTextWatcher());
 lbl150c.addTextChangedListener(new CustomTextWatcher());
lbl150d.addTextChangedListener(new CustomTextWatcher());
lbl150p.addTextChangedListener(new CustomTextWatcher());
 lbt20c.addTextChangedListener(new CustomTextWatcher());
lbt20d.addTextChangedListener(new CustomTextWatcher());
lbt20p.addTextChangedListener(new CustomTextWatcher());
 lbl20c.addTextChangedListener(new CustomTextWatcher());
lbl20d.addTextChangedListener(new CustomTextWatcher());
lbl20p.addTextChangedListener(new CustomTextWatcher());
 knorraioc.addTextChangedListener(new CustomTextWatcher());
knorraiod.addTextChangedListener(new CustomTextWatcher());
knorraiop.addTextChangedListener(new CustomTextWatcher());
 knorrchknc.addTextChangedListener(new CustomTextWatcher());
knorrchknd.addTextChangedListener(new CustomTextWatcher());
knorrchknp.addTextChangedListener(new CustomTextWatcher());
 sig60c.addTextChangedListener(new CustomTextWatcher());
sig60d.addTextChangedListener(new CustomTextWatcher());
sig60p.addTextChangedListener(new CustomTextWatcher());
 sig30c.addTextChangedListener(new CustomTextWatcher());
sig30d.addTextChangedListener(new CustomTextWatcher());
sig30p.addTextChangedListener(new CustomTextWatcher());
 sig140c.addTextChangedListener(new CustomTextWatcher());
sig140d.addTextChangedListener(new CustomTextWatcher());
sig140p.addTextChangedListener(new CustomTextWatcher());
 sun40c.addTextChangedListener(new CustomTextWatcher());
sun40d.addTextChangedListener(new CustomTextWatcher());
sun40p.addTextChangedListener(new CustomTextWatcher());
 sun90c.addTextChangedListener(new CustomTextWatcher());
sun90d.addTextChangedListener(new CustomTextWatcher());
sun90p.addTextChangedListener(new CustomTextWatcher());
 sun160c.addTextChangedListener(new CustomTextWatcher());
sun160d.addTextChangedListener(new CustomTextWatcher());
sun160p.addTextChangedListener(new CustomTextWatcher());
 sunbarc.addTextChangedListener(new CustomTextWatcher());
sunbard.addTextChangedListener(new CustomTextWatcher());
sunbarp.addTextChangedListener(new CustomTextWatcher());
 sun500c.addTextChangedListener(new CustomTextWatcher());
sun500d.addTextChangedListener(new CustomTextWatcher());
sun500p.addTextChangedListener(new CustomTextWatcher());
 sun1kc.addTextChangedListener(new CustomTextWatcher());
sun1kp.addTextChangedListener(new CustomTextWatcher());
 sun5kc.addTextChangedListener(new CustomTextWatcher());
  shacoc350c.addTextChangedListener(new CustomTextWatcher());
shacoc350p.addTextChangedListener(new CustomTextWatcher());
 concoc350c.addTextChangedListener(new CustomTextWatcher());
concoc350p.addTextChangedListener(new CustomTextWatcher());
 shaavo350c.addTextChangedListener(new CustomTextWatcher());
shaavo350p.addTextChangedListener(new CustomTextWatcher());
 conavo350c.addTextChangedListener(new CustomTextWatcher());
conavo350p.addTextChangedListener(new CustomTextWatcher());
 shacoc700c.addTextChangedListener(new CustomTextWatcher());
shacoc700p.addTextChangedListener(new CustomTextWatcher());
 concoc700c.addTextChangedListener(new CustomTextWatcher());
concoc700p.addTextChangedListener(new CustomTextWatcher());
 shaavo700c.addTextChangedListener(new CustomTextWatcher());
shaavo700p.addTextChangedListener(new CustomTextWatcher());
 conavo700c.addTextChangedListener(new CustomTextWatcher());
conavo700p.addTextChangedListener(new CustomTextWatcher());
 omo40c.addTextChangedListener(new CustomTextWatcher());
omo40d.addTextChangedListener(new CustomTextWatcher());
omo40p.addTextChangedListener(new CustomTextWatcher());
 omo100c.addTextChangedListener(new CustomTextWatcher());
omo100d.addTextChangedListener(new CustomTextWatcher());
omo100p.addTextChangedListener(new CustomTextWatcher());
 omo160c.addTextChangedListener(new CustomTextWatcher());
omo160d.addTextChangedListener(new CustomTextWatcher());
omo160p.addTextChangedListener(new CustomTextWatcher());
 omo500c.addTextChangedListener(new CustomTextWatcher());
omo500d.addTextChangedListener(new CustomTextWatcher());
omo500p.addTextChangedListener(new CustomTextWatcher());
 omo1kc.addTextChangedListener(new CustomTextWatcher());
omo1kp.addTextChangedListener(new CustomTextWatcher());
 omo3kc.addTextChangedListener(new CustomTextWatcher());
omo3kp.addTextChangedListener(new CustomTextWatcher());
 luxsc70c.addTextChangedListener(new CustomTextWatcher());
luxsc70d.addTextChangedListener(new CustomTextWatcher());
luxsc70p.addTextChangedListener(new CustomTextWatcher());
 luxst70c.addTextChangedListener(new CustomTextWatcher());
luxst70d.addTextChangedListener(new CustomTextWatcher());
luxst70p.addTextChangedListener(new CustomTextWatcher());
 luxsc150c.addTextChangedListener(new CustomTextWatcher());
luxsc150d.addTextChangedListener(new CustomTextWatcher());
luxsc150p.addTextChangedListener(new CustomTextWatcher());
 luxst150c.addTextChangedListener(new CustomTextWatcher());
luxst150d.addTextChangedListener(new CustomTextWatcher());
luxst150p.addTextChangedListener(new CustomTextWatcher());
shacoc15c.addTextChangedListener(new CustomTextWatcher());
shacoc15p.addTextChangedListener(new CustomTextWatcher());
shacoc15d.addTextChangedListener(new CustomTextWatcher());
concoc15c.addTextChangedListener(new CustomTextWatcher());
concoc15d.addTextChangedListener(new CustomTextWatcher());
concoc15p.addTextChangedListener(new CustomTextWatcher());


EditText searchEditText = findViewById(R.id.searchEditText);
        searchFilter = new SearchFilter(linearLayoutContainer);
        searchEditText.addTextChangedListener(searchFilter);
    

    // Get the search icon drawable
        
Drawable searchIcon = getResources().getDrawable(R.drawable.ic_search);
searchEditText.setCompoundDrawablesWithIntrinsicBounds(searchIcon, null, null, null);

        // Set the bounds of the drawable
        int iconWidth = 50;
        int iconHeight = 50;
        searchIcon.setBounds(0, 0, iconWidth, iconHeight);

        // Set the compound drawable to the start (left) of the EditText
        searchEditText.setCompoundDrawables(searchIcon, null, null, null);

        // Set the hint text
        searchEditText.setHint("Search");



        
        lbt70c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lbt70c.setCursorVisible(true);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

@Override
public boolean onOptionsItemSelected(MenuItem item) {
    if (item.getItemId() == R.id.action_save) {
        if (storagePermissionManager.isStoragePermissionGranted()) {



savedetail();

         saveDataToJsonFile();
        } else {
            storagePermissionManager.checkStoragePermission();
        }
        return true;
    }
    return super.onOptionsItemSelected(item);
}






    private JSONObject createJsonData() {
        JSONObject jsonData = new JSONObject();
        try {
            String value1 = lbt70c.getText().toString();

            jsonData.put("lbt70g", value1);

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return jsonData;
    }




public void saveDataToJsonFile() {
    JSONObject jsonData = createJsonData();

    // Get the path to the root directory of emulated storage
    File rootDir = Environment.getExternalStorageDirectory();
    File file = new File(rootDir, "data.json");

    try {
        int newNumber1 = 0;
        if (!lbt70c.getText().toString().isEmpty()) {
             newNumber1 = Integer.parseInt(lbt70c.getText().toString());
        }

        int newNumber2 = 0;
        if (!lbt70d.getText().toString().isEmpty()) {
            newNumber2 = Integer.parseInt(lbt70d.getText().toString());
        }

        int newNumber3 = 0;
        if (!lbt70p.getText().toString().isEmpty()) {
            newNumber3 = Integer.parseInt(lbt70p.getText().toString());
        }

        int newNumber4 = 0;
        if (!lbl70c.getText().toString().isEmpty()) {
            newNumber4 = Integer.parseInt(lbl70c.getText().toString());
        }

        int newNumber5 = 0;
        if (!lbl70d.getText().toString().isEmpty()) {
            newNumber5 = Integer.parseInt(lbl70d.getText().toString());
        }

        int newNumber6 = 0;
        if (!lbl70p.getText().toString().isEmpty()) {
          
                newNumber6 = Integer.parseInt(lbl70p.getText().toString());
        }
                int newNumber7 = 0;
        if (!lbt150c.getText().toString().isEmpty()) {
            newNumber7 = Integer.parseInt(lbt150c.getText().toString());
        }

        int newNumber8 = 0;
        if (!lbt150d.getText().toString().isEmpty()) {
            newNumber8 = Integer.parseInt(lbt150d.getText().toString());
        }

        int newNumber9 = 0;
        if (!lbt150p.getText().toString().isEmpty()) {
            newNumber9 = Integer.parseInt(lbt150p.getText().toString());
        }

        int newNumber10 = 0;
        if (!lbl150c.getText().toString().isEmpty()) {
            newNumber10 = Integer.parseInt(lbl150c.getText().toString());
        }

        int newNumber11 = 0;
        if (!lbl150d.getText().toString().isEmpty()) {
            newNumber11 = Integer.parseInt(lbl150d.getText().toString());
        }

        int newNumber12 = 0;
        if (!lbl150p.getText().toString().isEmpty()) {
          
                newNumber12 = Integer.parseInt(lbl150p.getText().toString());
        }

        int newNumber13 = 0;
        if (!lbt20c.getText().toString().isEmpty()) {
          
                newNumber13 = Integer.parseInt(lbt20c.getText().toString());
        }

        int newNumber14 = 0;
        if (!lbt20d.getText().toString().isEmpty()) {
          
                newNumber14 = Integer.parseInt(lbt20d.getText().toString());
        }

        int newNumber15 = 0;
        if (!lbt20p.getText().toString().isEmpty()) {
          
                newNumber15 = Integer.parseInt(lbt20p.getText().toString());
        }

        int newNumber16 = 0;
        if (!knorraioc.getText().toString().isEmpty()) {
          
                newNumber16 = Integer.parseInt(knorraioc.getText().toString());
        }

        int newNumber17 = 0;
        if (!knorraiod.getText().toString().isEmpty()) {
          
                newNumber17 = Integer.parseInt(knorraiod.getText().toString());
        }

        int newNumber18 = 0;
        if (!knorraiop.getText().toString().isEmpty()) {
          
                newNumber18 = Integer.parseInt(knorraiop.getText().toString());
        }

        int newNumber19 = 0;
        if (!knorrchknc.getText().toString().isEmpty()) {
          
                newNumber19 = Integer.parseInt(knorrchknc.getText().toString());
        }

        int newNumber20 = 0;
        if (!knorrchknd.getText().toString().isEmpty()) {
          
                newNumber20 = Integer.parseInt(knorrchknd.getText().toString());
        }

        int newNumber21 = 0;
        if (!knorrchknp.getText().toString().isEmpty()) {
          
                newNumber21 = Integer.parseInt(knorrchknp.getText().toString());
        }

        int newNumber22 = 0;
        if (!sig30c.getText().toString().isEmpty()) {
          
                newNumber22 = Integer.parseInt(sig30c.getText().toString());
        }

        int newNumber23 = 0;
        if (!sig30d.getText().toString().isEmpty()) {
          
                newNumber23 = Integer.parseInt(sig30d.getText().toString());
        }

        int newNumber24 = 0;
        if (!sig30p.getText().toString().isEmpty()) {
          
                newNumber24 = Integer.parseInt(sig30p.getText().toString());
        }

        int newNumber25 = 0;
        if (!sig60c.getText().toString().isEmpty()) {
          
                newNumber25 = Integer.parseInt(sig60c.getText().toString());
        }

        int newNumber26 = 0;
        if (!sig60d.getText().toString().isEmpty()) {
          
                newNumber26 = Integer.parseInt(sig60d.getText().toString());
        }

        int newNumber27 = 0;
        if (!sig60p.getText().toString().isEmpty()) {
          
                newNumber27 = Integer.parseInt(sig60p.getText().toString());
        }

        int newNumber28 = 0;
        if (!sig140c.getText().toString().isEmpty()) {
          
                newNumber28 = Integer.parseInt(sig140c.getText().toString());
        }

        int newNumber29 = 0;
        if (!sig140d.getText().toString().isEmpty()) {
          
                newNumber29 = Integer.parseInt(sig140d.getText().toString());
        }

        int newNumber30 = 0;
        if (!sig140p.getText().toString().isEmpty()) {
          
                newNumber30 = Integer.parseInt(sig140p.getText().toString());
        }
        int newNumber31 = 0;
        if (!sun40c.getText().toString().isEmpty()) {
          
                newNumber31 = Integer.parseInt(sun40c.getText().toString());
        }

        int newNumber32 = 0;
        if (!sun40d.getText().toString().isEmpty()) {
          
                newNumber32 = Integer.parseInt(sun40d.getText().toString());
        }

        int newNumber33 = 0;
        if (!sun40p.getText().toString().isEmpty()) {
          
                newNumber33 = Integer.parseInt(sun40p.getText().toString());
        }
        int newNumber34 = 0;
        if (!sun90c.getText().toString().isEmpty()) {
          
                newNumber34 = Integer.parseInt(sun90c.getText().toString());
        }

        int newNumber35 = 0;
        if (!sun90d.getText().toString().isEmpty()) {
          
                newNumber35 = Integer.parseInt(sun90d.getText().toString());
        }

        int newNumber36 = 0;
        if (!sun90p.getText().toString().isEmpty()) {
          
                newNumber36 = Integer.parseInt(sun90p.getText().toString());
        }
        int newNumber37 = 0;
        if (!sun160c.getText().toString().isEmpty()) {
          
                newNumber37 = Integer.parseInt(sun160c.getText().toString());
        }

        int newNumber38 = 0;
        if (!sun160d.getText().toString().isEmpty()) {
          
                newNumber38 = Integer.parseInt(sun160d.getText().toString());
        }

        int newNumber39 = 0;
        if (!sun160p.getText().toString().isEmpty()) {
          
                newNumber39 = Integer.parseInt(sun160p.getText().toString());
        }

        int newNumber40 = 0;
        if (!sunbarc.getText().toString().isEmpty()) {
          
                newNumber40 = Integer.parseInt(sunbarc.getText().toString());
        }

        int newNumber41 = 0;
        if (!sunbard.getText().toString().isEmpty()) {
          
                newNumber41 = Integer.parseInt(sunbard.getText().toString());
        }

        int newNumber42 = 0;
        if (!sunbarp.getText().toString().isEmpty()) {
          
                newNumber42 = Integer.parseInt(sunbarp.getText().toString());
        }

        int newNumber43 = 0;
        if (!sun500c.getText().toString().isEmpty()) {
          
                newNumber43 = Integer.parseInt(sun500c.getText().toString());
        }

        int newNumber44 = 0;
        if (!sun500d.getText().toString().isEmpty()) {
          
                newNumber44 = Integer.parseInt(sun500d.getText().toString());
        }

        int newNumber45 = 0;
        if (!sun500p.getText().toString().isEmpty()) {
          
                newNumber45 = Integer.parseInt(sun500p.getText().toString());
        }

        int newNumber46 = 0;
        if (!sun1kc.getText().toString().isEmpty()) {
          
                newNumber46 = Integer.parseInt(sun1kc.getText().toString());
        }

        int newNumber47 = 0;
        if (!sun1kp.getText().toString().isEmpty()) {
          
                newNumber47 = Integer.parseInt(sun1kp.getText().toString());
        }

        int newNumber48 = 0;
        if (!sun5kc.getText().toString().isEmpty()) {
          
                newNumber48 = Integer.parseInt(sun5kc.getText().toString());
        }
     

        int newNumber49 = 0;
        if (!shacoc350c.getText().toString().isEmpty()) {
          
                newNumber49 = Integer.parseInt(shacoc350c.getText().toString());
        }

        int newNumber50 = 0;
        if (!shacoc350p.getText().toString().isEmpty()) {
          
                newNumber50 = Integer.parseInt(shacoc350p.getText().toString());
        }

        int newNumber51 = 0;
        if (!concoc350c.getText().toString().isEmpty()) {
          
                newNumber51 = Integer.parseInt(concoc350c.getText().toString());
        }

        int newNumber52 = 0;
        if (!concoc350p.getText().toString().isEmpty()) {
          
                newNumber52 = Integer.parseInt(concoc350p.getText().toString());
        }

        int newNumber53 = 0;
        if (!shaavo350c.getText().toString().isEmpty()) {
          
                newNumber53 = Integer.parseInt(shaavo350c.getText().toString());
        }

        int newNumber54 = 0;
        if (!shaavo350p.getText().toString().isEmpty()) {
          
                newNumber54 = Integer.parseInt(shaavo350p.getText().toString());
        }
        int newNumber55 = 0;
        if (!conavo350c.getText().toString().isEmpty()) {
          
                newNumber55 = Integer.parseInt(conavo350c.getText().toString());
        }

        int newNumber56 = 0;
        if (!conavo350p.getText().toString().isEmpty()) {
          
                newNumber56 = Integer.parseInt(conavo350p.getText().toString());
        }

        int newNumber57 = 0;
        if (!shacoc700c.getText().toString().isEmpty()) {
          
                newNumber57 = Integer.parseInt(shacoc700c.getText().toString());
        }

        int newNumber58 = 0;
        if (!shacoc700p.getText().toString().isEmpty()) {
          
                newNumber58 = Integer.parseInt(shacoc700p.getText().toString());
        }

        int newNumber59 = 0;
        if (!concoc700c.getText().toString().isEmpty()) {
          
                newNumber59 = Integer.parseInt(concoc700c.getText().toString());
        }

        int newNumber60 = 0;
        if (!concoc700p.getText().toString().isEmpty()) {
          
                newNumber60 = Integer.parseInt(concoc700p.getText().toString());
        }

        int newNumber61 = 0;
        if (!shaavo700c.getText().toString().isEmpty()) {
          
                newNumber61 = Integer.parseInt(shaavo700c.getText().toString());
        }

        int newNumber62 = 0;
        if (!shaavo700p.getText().toString().isEmpty()) {
          
                newNumber62 = Integer.parseInt(shaavo700p.getText().toString());
        }
        int newNumber63 = 0;
        if (!conavo700c.getText().toString().isEmpty()) {
          
                newNumber63 = Integer.parseInt(conavo700c.getText().toString());
        }

        int newNumber64 = 0;
        if (!conavo700p.getText().toString().isEmpty()) {
          
                newNumber64 = Integer.parseInt(conavo700p.getText().toString());
        }

        int newNumber65 = 0;
        if (!omo40c.getText().toString().isEmpty()) {
          
                newNumber65 = Integer.parseInt(omo40c.getText().toString());
        }

        int newNumber66 = 0;
        if (!omo40d.getText().toString().isEmpty()) {
          
                newNumber66 = Integer.parseInt(omo40d.getText().toString());
        }

        int newNumber67 = 0;
        if (!omo40p.getText().toString().isEmpty()) {
          
                newNumber67 = Integer.parseInt(omo40p.getText().toString());
        }

        int newNumber68 = 0;
        if (!omo100c.getText().toString().isEmpty()) {
          
                newNumber68 = Integer.parseInt(omo100c.getText().toString());
        }

        int newNumber69 = 0;
        if (!omo100d.getText().toString().isEmpty()) {
          
                newNumber69 = Integer.parseInt(omo100d.getText().toString());
        }

        int newNumber70 = 0;
        if (!omo100p.getText().toString().isEmpty()) {
          
                newNumber70 = Integer.parseInt(omo100p.getText().toString());
        }

        int newNumber71 = 0;
        if (!omo160c.getText().toString().isEmpty()) {
          
                newNumber71 = Integer.parseInt(omo160c.getText().toString());
        }

        int newNumber72 = 0;
        if (!omo160d.getText().toString().isEmpty()) {
          
                newNumber72 = Integer.parseInt(omo160d.getText().toString());
        }

        int newNumber73 = 0;
        if (!omo160p.getText().toString().isEmpty()) {
          
                newNumber73 = Integer.parseInt(omo160p.getText().toString());
        }

        int newNumber74 = 0;
        if (!omo500c.getText().toString().isEmpty()) {
          
                newNumber74 = Integer.parseInt(omo500c.getText().toString());
        }

        int newNumber75 = 0;
        if (!omo500d.getText().toString().isEmpty()) {
          
                newNumber75 = Integer.parseInt(omo500d.getText().toString());
        }

        int newNumber76 = 0;
        if (!omo500p.getText().toString().isEmpty()) {
          
                newNumber76 = Integer.parseInt(omo500p.getText().toString());
        }

        int newNumber77 = 0;
        if (!omo1kc.getText().toString().isEmpty()) {
          
                newNumber77 = Integer.parseInt(omo1kc.getText().toString());
        }


        int newNumber78 = 0;
        if (!omo1kp.getText().toString().isEmpty()) {
          
                newNumber78 = Integer.parseInt(omo1kp.getText().toString());
        }

        int newNumber79 = 0;
        if (!omo3kc.getText().toString().isEmpty()) {
          
                newNumber79 = Integer.parseInt(omo3kc.getText().toString());
        }


        int newNumber80 = 0;
        if (!omo3kp.getText().toString().isEmpty()) {
          
                newNumber80 = Integer.parseInt(omo3kp.getText().toString());
        }
        int newNumber81 = 0;
        if (!luxsc70c.getText().toString().isEmpty()) {
            newNumber81 = Integer.parseInt(luxsc70c.getText().toString());
        }

        int newNumber82 = 0;
        if (!luxsc70d.getText().toString().isEmpty()) {
            newNumber82 = Integer.parseInt(luxsc70d.getText().toString());
        }

        int newNumber83 = 0;
        if (!luxsc70p.getText().toString().isEmpty()) {
            newNumber83 = Integer.parseInt(luxsc70p.getText().toString());
        }
        int newNumber84 = 0;
        if (!luxst70c.getText().toString().isEmpty()) {
            newNumber84 = Integer.parseInt(luxst70c.getText().toString());
        }

        int newNumber85 = 0;
        if (!luxst70d.getText().toString().isEmpty()) {
            newNumber85 = Integer.parseInt(luxst70d.getText().toString());
        }

        int newNumber86 = 0;
        if (!luxst70p.getText().toString().isEmpty()) {
            newNumber86 = Integer.parseInt(luxst70p.getText().toString());
        }


        int newNumber87 = 0;
        if (!luxsc150c.getText().toString().isEmpty()) {
            newNumber87 = Integer.parseInt(luxsc150c.getText().toString());
        }

        int newNumber88 = 0;
        if (!luxsc150d.getText().toString().isEmpty()) {
            newNumber88 = Integer.parseInt(luxsc150d.getText().toString());
        }

        int newNumber89 = 0;
        if (!luxsc150p.getText().toString().isEmpty()) {
            newNumber89 = Integer.parseInt(luxsc150p.getText().toString());
        }
        int newNumber90 = 0;
        if (!luxst150c.getText().toString().isEmpty()) {
            newNumber90 = Integer.parseInt(luxst150c.getText().toString());
        }

        int newNumber91 = 0;
        if (!luxst150d.getText().toString().isEmpty()) {
            newNumber91 = Integer.parseInt(luxst150d.getText().toString());
        }

        int newNumber92 = 0;
        if (!luxst150p.getText().toString().isEmpty()) {
            newNumber92 = Integer.parseInt(luxst150p.getText().toString());
         }   
        int newNumber93 = 0;
        if (!shacoc15c.getText().toString().isEmpty()) {
            newNumber93 = Integer.parseInt(shacoc15c.getText().toString());
        }

        int newNumber94 = 0;
        if (!shacoc15d.getText().toString().isEmpty()) {
            newNumber94 = Integer.parseInt(shacoc15d.getText().toString());
        }

        int newNumber95 = 0;
        if (!shacoc15p.getText().toString().isEmpty()) {
            newNumber95 = Integer.parseInt(shacoc15p.getText().toString());
        }
        int newNumber96 = 0;
        if (!concoc15c.getText().toString().isEmpty()) {
            newNumber96 = Integer.parseInt(concoc15c.getText().toString());
        }

        int newNumber97 = 0;
        if (!concoc15d.getText().toString().isEmpty()) {
            newNumber97 = Integer.parseInt(concoc15d.getText().toString());
        }

        int newNumber98 = 0;
        if (!concoc15p.getText().toString().isEmpty()) {
            newNumber98 = Integer.parseInt(concoc15p.getText().toString());
        }

        int newNumber99 = 0;
        if (!lbl20c.getText().toString().isEmpty()) {
          
                newNumber99 = Integer.parseInt(lbl20c.getText().toString());
        }

        int newNumber100 = 0;
        if (!lbl20d.getText().toString().isEmpty()) {
          
                newNumber100 = Integer.parseInt(lbl20d.getText().toString());
        }

        int newNumber101 = 0;
        if (!lbl20p.getText().toString().isEmpty()) {
          
                newNumber101 = Integer.parseInt(lbl20p.getText().toString());
        }
















        if (file.exists()) {
            // If the file exists, load its contents and update the existing numbers
            StringBuilder fileContent = new StringBuilder();
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent.append(line);
            }
            reader.close();

            JSONObject existingData = new JSONObject(fileContent.toString());

            // Get the previous numbers from the JSON
            int previousNumber1 = existingData.optInt("lbt70g", 0);
            int previousNumber2 = existingData.optInt("lbl70g", 0);
            int previousNumber3 = existingData.optInt("lbt150g", 0);
            int previousNumber4 = existingData.optInt("lbl150g", 0);
            int previousNumber5 = existingData.optInt("lbt20g", 0);
            int previousNumber6 = existingData.optInt("knorraio", 0);
            int previousNumber7 = existingData.optInt("knorrchicken", 0);
            int previousNumber8 = existingData.optInt("signal30g", 0);
            int previousNumber9 = existingData.optInt("signal60g", 0);
            int previousNumber10 = existingData.optInt("signal140g", 0);
            int previousNumber11 = existingData.optInt("sunlight_40g", 0);
            int previousNumber12 = existingData.optInt("sunlight90g", 0);
            int previousNumber13 = existingData.optInt("sunlight160g", 0);
            int previousNumber14 = existingData.optInt("sunlightbar_200g", 0);
            int previousNumber15 = existingData.optInt("sunlight500g", 0);
            int previousNumber16 = existingData.optInt("sunlight1kg", 0);
            int previousNumber17 = existingData.optInt("sunlight5kg", 0);
            int previousNumber18 = existingData.optInt("shacoc350ml", 0);
            int previousNumber19 = existingData.optInt("concoc350ml", 0);
            int previousNumber20 = existingData.optInt("shaavo350ml", 0);
            int previousNumber21 = existingData.optInt("conavo350ml", 0);
            int previousNumber22 = existingData.optInt("shacoc700ml", 0);
            int previousNumber23 = existingData.optInt("concoc700ml", 0);
            int previousNumber24 = existingData.optInt("shaavo700ml", 0);
            int previousNumber25 = existingData.optInt("conavo700ml", 0);
            int previousNumber26 = existingData.optInt("omo40g", 0);
            int previousNumber27 = existingData.optInt("omo100g", 0);
            int previousNumber28 = existingData.optInt("omo160g", 0);
            int previousNumber29 = existingData.optInt("omo500g", 0);
            int previousNumber30 = existingData.optInt("omo1kg", 0);
            int previousNumber31 = existingData.optInt("omo3kg", 0);
            int previousNumber32 = existingData.optInt("luxsc70g", 0);
            int previousNumber33 = existingData.optInt("luxst70g", 0);
            int previousNumber34 = existingData.optInt("luxsc150g", 0);
            int previousNumber35 = existingData.optInt("luxst150g", 0);
            int previousNumber36 = existingData.optInt("shacoc15ml", 0);
            int previousNumber37 = existingData.optInt("concoc15ml", 0);
            int previousNumber38 = existingData.optInt("lbl20g", 0);






            // Multiply the new numbers by the specified values
            newNumber1 *= 72;
            newNumber2 *= 12;

            newNumber4 *= 72;
            newNumber5 *= 12;
            
            newNumber7 *= 36;
            newNumber8 *= 12;
            
            newNumber10 *= 36;
            newNumber11*= 12;

            newNumber13 *= 144;
            newNumber14*= 12;

            newNumber16 *= 240;
            newNumber17*= 12;

            newNumber19 *= 240;
            newNumber20*= 12;

            newNumber22 *= 144;
            newNumber23*= 12;

            newNumber25 *= 72;
            newNumber26*= 12;

            newNumber28 *=48;
            newNumber29*= 12;

            newNumber31 *=100;
            newNumber32*= 12;

            newNumber34 *=72;
            newNumber35*= 12;

            newNumber37 *=48;
            newNumber38*= 12;

            newNumber40 *=50;
            newNumber41*= 12;

            newNumber43 *=24;
            newNumber44*= 12;

            newNumber46*= 12;

            newNumber49*= 12;

            newNumber51*= 12;

            newNumber53*= 12;

            newNumber55*= 12;

            newNumber57*= 12;

            newNumber59*= 12;

            newNumber61*= 12;

            newNumber63*= 12;

            newNumber65 *=100;
            newNumber66*= 12;

            newNumber68 *=72;
            newNumber69*= 12;

            newNumber71 *=48;
            newNumber72*= 12;

            newNumber74 *=24;
            newNumber75*= 12;

            newNumber77 *=12;

            newNumber79 *=4;

            newNumber81 *= 72;
            newNumber82 *= 12;

            newNumber84 *= 72;
            newNumber85 *= 12;
            
            newNumber87 *= 36;
            newNumber88 *= 12;
            
            newNumber90 *= 36;
            newNumber91*= 12;
            
            newNumber93 *= 360;
            newNumber94*= 12;
            
            newNumber96 *= 360;
            newNumber97*= 12;

            newNumber99 *= 144;
            newNumber100*= 12;

            // Add the new numbers to the previous numbers and update the JSON
            existingData.put("lbt70g", previousNumber1 + newNumber1 + newNumber2 + newNumber3);
            existingData.put("lbl70g", previousNumber2 + newNumber4 + newNumber5 + newNumber6);
            existingData.put("lbt150g", previousNumber3 + newNumber7 + newNumber8 + newNumber9);
            existingData.put("lbl150g", previousNumber4 + newNumber10+ newNumber11 + newNumber12);
            existingData.put("lbt20g", previousNumber5 + newNumber13+ newNumber14 + newNumber15);
            existingData.put("knorraio", previousNumber6 + newNumber16+ newNumber17 + newNumber18);
            existingData.put("knorrchicken", previousNumber7 + newNumber19+ newNumber20 + newNumber21);
            existingData.put("signal30g", previousNumber8 + newNumber22+ newNumber23 + newNumber24);
            existingData.put("signal60g", previousNumber9 + newNumber25+ newNumber26 + newNumber27);
            existingData.put("signal140g", previousNumber10 + newNumber28+ newNumber29 + newNumber30);
            existingData.put("sunlight_40g", previousNumber11 + newNumber31+ newNumber32 + newNumber33);
            existingData.put("sunlight90g", previousNumber12 + newNumber34+ newNumber35 + newNumber36);
            existingData.put("sunlight160g", previousNumber13 + newNumber37+ newNumber38 + newNumber39);
            existingData.put("sunlightbar_200g", previousNumber14 + newNumber40+ newNumber41 + newNumber42);
            existingData.put("sunlight500g", previousNumber15 + newNumber43+ newNumber44 + newNumber45);
            existingData.put("sunlight1kg", previousNumber16 + newNumber46+ newNumber47);
            existingData.put("sunlight5kg", previousNumber17 + newNumber48);
            existingData.put("shacoc350ml", previousNumber18 + newNumber49+ newNumber50);
            existingData.put("concoc350ml", previousNumber19 + newNumber51+ newNumber52);
            existingData.put("shaavo350ml", previousNumber20 + newNumber53+ newNumber54);
            existingData.put("conavo350ml", previousNumber21 + newNumber55+ newNumber56);
            existingData.put("shacoc700ml", previousNumber22 + newNumber57+ newNumber58);
            existingData.put("concoc700ml", previousNumber23 + newNumber59+ newNumber60);
            existingData.put("shaavo700ml", previousNumber24 + newNumber61+ newNumber62);
            existingData.put("conavo700ml", previousNumber25 + newNumber63+ newNumber64);
            existingData.put("omo40g", previousNumber26 + newNumber65+ newNumber66 + newNumber67);
            existingData.put("omo100g", previousNumber27 + newNumber68+ newNumber69 + newNumber70);
            existingData.put("omo160g", previousNumber28 + newNumber71+ newNumber72 + newNumber73);
            existingData.put("omo500g", previousNumber29 + newNumber74+ newNumber75 + newNumber76);
            existingData.put("omo1kg", previousNumber30 + newNumber77+ newNumber78);
            existingData.put("omo3kg", previousNumber31 + newNumber79 + newNumber80);
            existingData.put("luxsc70g", previousNumber32 + newNumber81 + newNumber82 + newNumber83);
            existingData.put("luxst70g", previousNumber33 + newNumber84 + newNumber85 + newNumber86);
            existingData.put("luxsc150g", previousNumber34 + newNumber87 + newNumber88 + newNumber89);
            existingData.put("luxst150g", previousNumber35 + newNumber90 + newNumber91 + newNumber92);
            existingData.put("shacoc15ml", previousNumber36 + newNumber93 + newNumber94 + newNumber95);
            existingData.put("concoc15ml", previousNumber37 + newNumber96 + newNumber97 + newNumber98);
            existingData.put("lbl20g", previousNumber38 + newNumber99+ newNumber100 + newNumber101);



            jsonData = existingData;
        } else {
            // Multiply the new numbers by the specified values
            newNumber1 *= 72;
            newNumber2 *= 12;
            
            newNumber4 *= 72;
            newNumber5 *= 12;
            
            newNumber7 *= 36;
            newNumber8 *= 12;
            
            newNumber10 *= 36;
            newNumber11*= 12;

            newNumber13 *= 144;
            newNumber14*= 12;

            newNumber16 *= 240;
            newNumber17*= 12;

            newNumber19 *= 240;
            newNumber20*= 12;

            newNumber22 *= 144;
            newNumber23*= 12;

            newNumber25 *= 72;
            newNumber26*= 12;

            newNumber28 *= 48;
            newNumber29*= 12;

            newNumber31 *=100;
            newNumber32*= 12;

            newNumber34 *=72;
            newNumber35*= 12;

            newNumber37 *=48;
            newNumber38*= 12;

            newNumber40 *=50;
            newNumber41*= 12;

            newNumber43 *=24;
            newNumber44*= 12;

            newNumber46*= 12;

            newNumber49*= 12;

            newNumber51*= 12;

            newNumber53*= 12;

            newNumber55*= 12;

            newNumber57*= 12;

            newNumber59*= 12;

            newNumber61*= 12;

            newNumber63*= 12;

            newNumber65 *=100;
            newNumber66*= 12;

            newNumber68 *=72;
            newNumber69*= 12;

            newNumber71 *=48;
            newNumber72*= 12;

            newNumber74 *=24;
            newNumber75*= 12;

            newNumber77 *=12;

            newNumber79 *=4;

            newNumber81 *= 72;
            newNumber82 *= 12;

            newNumber84 *= 72;
            newNumber85 *= 12;
            
            newNumber87 *= 36;
            newNumber88 *= 12;
            
            newNumber90 *= 36;
            newNumber91*= 12;
            
            newNumber93 *= 360;
            newNumber94*= 12;
            
            newNumber96 *= 360;
            newNumber97*= 12;

            newNumber99 *= 144;
            newNumber100*= 12;







            // Set the new numbers in the JSON
            jsonData.put("lbt70g", newNumber1 + newNumber2 + newNumber3);
            jsonData.put("lbl70g", newNumber4 + newNumber5 + newNumber6);
            jsonData.put("lbt150g", newNumber7 + newNumber8 + newNumber9);
            jsonData.put("lbl150g", newNumber10 + newNumber11 + newNumber12);
            jsonData.put("lbt20g", newNumber13 + newNumber14 + newNumber15);
            jsonData.put("knorraio", newNumber16 + newNumber17 + newNumber18);
            jsonData.put("knorrchicken", newNumber19 + newNumber20 + newNumber21);
            jsonData.put("signal30g", newNumber22 + newNumber23 + newNumber24);
            jsonData.put("signal60g", newNumber25 + newNumber26 + newNumber27);
            jsonData.put("signal140g", newNumber28 + newNumber29 + newNumber30);
            jsonData.put("sunlight_40g", newNumber31 + newNumber32 + newNumber33);
            jsonData.put("sunlight90g", newNumber34 + newNumber35 + newNumber36);
            jsonData.put("sunlight160g", newNumber37 + newNumber38 + newNumber39);
            jsonData.put("sunlightbar_200g", newNumber40 + newNumber41 + newNumber42);
            jsonData.put("sunlight500g", newNumber43 + newNumber44 + newNumber45);
            jsonData.put("sunlight1kg", newNumber46 + newNumber47);
            jsonData.put("sunlight5kg", newNumber48);
            jsonData.put("shacoc350ml", newNumber49 + newNumber50);
            jsonData.put("concoc350ml", newNumber51 + newNumber52);
            jsonData.put("shaavo350ml", newNumber53 + newNumber54);
            jsonData.put("conavo350ml", newNumber55 + newNumber56);
            jsonData.put("shacoc700ml", newNumber57 + newNumber58);
            jsonData.put("concoc700ml", newNumber59 + newNumber60);
            jsonData.put("shaavo700ml", newNumber61 + newNumber62);
            jsonData.put("conavo700ml", newNumber63 + newNumber64);
            jsonData.put("omo40g", newNumber65 + newNumber66 + newNumber67);
            jsonData.put("omo100g", newNumber68 + newNumber69 + newNumber70);
            jsonData.put("omo160g", newNumber71 + newNumber72 + newNumber73);
            jsonData.put("omo500g", newNumber74 + newNumber75 + newNumber76);
            jsonData.put("omo1kg", newNumber77 + newNumber78);
            jsonData.put("omo3kg", newNumber79 + newNumber80);
            jsonData.put("luxsc70g", newNumber81 + newNumber82 + newNumber83);
            jsonData.put("luxst70g", newNumber84 + newNumber85 + newNumber86);
            jsonData.put("luxsc150g", newNumber87 + newNumber88 + newNumber89);
            jsonData.put("luxst150g", newNumber90 + newNumber91 + newNumber92);
            jsonData.put("shacoc15ml", newNumber93 + newNumber94 + newNumber95);
            jsonData.put("concoc15ml", newNumber96 + newNumber97 + newNumber98);
            jsonData.put("lbl20g", newNumber99 + newNumber100 + newNumber101);







        }





        FileWriter writer = new FileWriter(file);
        writer.write(jsonData.toString());
        writer.flush();
        writer.close();
        Toast.makeText(this, "Data saved successfully", Toast.LENGTH_SHORT).show();

        // Clear the EditTexts
        lbt70c.setText("");
        lbt70d.setText("");
        lbt70p.setText("");
        
        lbl70c.setText("");
        lbl70d.setText("");
        lbl70p.setText("");

        lbt150c.setText("");
        lbt150d.setText("");
        lbt150p.setText("");

        lbl150c.setText("");
        lbl150d.setText("");
        lbl150p.setText("");

        lbt20c.setText("");
        lbt20d.setText("");
        lbt20p.setText("");

        lbl20c.setText("");
        lbl20d.setText("");
        lbl20p.setText("");

        knorraioc.setText("");
        knorraiod.setText("");
        knorraiop.setText("");

        knorrchknc.setText("");
        knorrchknd.setText("");
        knorrchknp.setText("");

        sig30c.setText("");
        sig30d.setText("");
        sig30p.setText("");

        sig60c.setText("");
        sig60d.setText("");
        sig60p.setText("");

        sig140c.setText("");
        sig140d.setText("");
        sig140p.setText("");

        sun40c.setText("");
        sun40d.setText("");
        sun40p.setText("");

        sun90c.setText("");
        sun90d.setText("");
        sun90p.setText("");

        sun160c.setText("");
        sun160d.setText("");
        sun160p.setText("");

        sunbarc.setText("");
        sunbard.setText("");
        sunbarp.setText("");

        sun500c.setText("");
        sun500d.setText("");
        sun500p.setText("");

        sun1kc.setText("");
        sun1kp.setText("");

        sun5kc.setText("");

        shacoc350c.setText("");
        shacoc350p.setText("");

        concoc350c.setText("");
        concoc350p.setText("");

        shaavo350c.setText("");
        shaavo350p.setText("");

        conavo350c.setText("");
        conavo350p.setText("");

        shacoc700c.setText("");
        shacoc700p.setText("");

        concoc700c.setText("");
        concoc700p.setText("");

        shaavo700c.setText("");
        shaavo700p.setText("");

        conavo700c.setText("");
        conavo700p.setText("");

        omo40c.setText("");
        omo40d.setText("");
        omo40p.setText("");

        omo100c.setText("");
        omo100d.setText("");
        omo100p.setText("");

        omo160c.setText("");
        omo160d.setText("");
        omo160p.setText("");

        omo500c.setText("");
        omo500d.setText("");
        omo500p.setText("");

        omo1kc.setText("");
        omo1kp.setText("");

        omo3kc.setText("");
        omo3kp.setText("");

        luxsc70c.setText("");
        luxsc70d.setText("");
        luxsc70p.setText("");

        luxst70c.setText("");
        luxst70d.setText("");
        luxst70p.setText("");

        luxsc150c.setText("");
        luxsc150d.setText("");
        luxsc150p.setText("");

        luxst150c.setText("");
        luxst150d.setText("");
        luxst150p.setText("");
        
        shacoc15c.setText("");
        shacoc15p.setText("");
        shacoc15d.setText("");
        
        concoc15c.setText("");
        concoc15p.setText("");
        concoc15d.setText("");




    } catch (IOException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error occurred while saving data", Toast.LENGTH_SHORT).show();
    } catch (JSONException e) {
        e.printStackTrace();
        Toast.makeText(this, "Error occurred while updating data", Toast.LENGTH_SHORT).show();
    }
}

@Override
    public void onBackPressed() {
        Intent intent = new Intent(MainActivity.this, PageTwo.class);
        startActivity(intent);
}

public void savedetail() {
    ArrayList<String> mItemList;
    mItemList = new ArrayList<String>();

    int newNumber1 = 0;
    if (!lbt70c.getText().toString().isEmpty()) {
        newNumber1 = Integer.parseInt(lbt70c.getText().toString());
    }

    int newNumber2 = 0;
    if (!lbt70d.getText().toString().isEmpty()) {
        newNumber2 = Integer.parseInt(lbt70d.getText().toString());
    }

    int newNumber3 = 0;
    if (!lbt70p.getText().toString().isEmpty()) {
        newNumber3 = Integer.parseInt(lbt70p.getText().toString());
    }
        int newNumber4 = 0;
        if (!lbl70c.getText().toString().isEmpty()) {
            newNumber4 = Integer.parseInt(lbl70c.getText().toString());
        }

        int newNumber5 = 0;
        if (!lbl70d.getText().toString().isEmpty()) {
            newNumber5 = Integer.parseInt(lbl70d.getText().toString());
        }

        int newNumber6 = 0;
        if (!lbl70p.getText().toString().isEmpty()) {
          
                newNumber6 = Integer.parseInt(lbl70p.getText().toString());
        }
                int newNumber7 = 0;
        if (!lbt150c.getText().toString().isEmpty()) {
            newNumber7 = Integer.parseInt(lbt150c.getText().toString());
        }

        int newNumber8 = 0;
        if (!lbt150d.getText().toString().isEmpty()) {
            newNumber8 = Integer.parseInt(lbt150d.getText().toString());
        }

        int newNumber9 = 0;
        if (!lbt150p.getText().toString().isEmpty()) {
            newNumber9 = Integer.parseInt(lbt150p.getText().toString());
        }

        int newNumber10 = 0;
        if (!lbl150c.getText().toString().isEmpty()) {
            newNumber10 = Integer.parseInt(lbl150c.getText().toString());
        }

        int newNumber11 = 0;
        if (!lbl150d.getText().toString().isEmpty()) {
            newNumber11 = Integer.parseInt(lbl150d.getText().toString());
        }

        int newNumber12 = 0;
        if (!lbl150p.getText().toString().isEmpty()) {
          
                newNumber12 = Integer.parseInt(lbl150p.getText().toString());
        }

        int newNumber13 = 0;
        if (!lbt20c.getText().toString().isEmpty()) {
          
                newNumber13 = Integer.parseInt(lbt20c.getText().toString());
        }

        int newNumber14 = 0;
        if (!lbt20d.getText().toString().isEmpty()) {
          
                newNumber14 = Integer.parseInt(lbt20d.getText().toString());
        }

        int newNumber15 = 0;
        if (!lbt20p.getText().toString().isEmpty()) {
          
                newNumber15 = Integer.parseInt(lbt20p.getText().toString());
        }

        int newNumber99 = 0;
        if (!lbl20c.getText().toString().isEmpty()) {
          
                newNumber99 = Integer.parseInt(lbl20c.getText().toString());
        }

        int newNumber100 = 0;
        if (!lbl20d.getText().toString().isEmpty()) {
          
                newNumber100 = Integer.parseInt(lbl20d.getText().toString());
        }

        int newNumber101 = 0;
        if (!lbl20p.getText().toString().isEmpty()) {
          
                newNumber101 = Integer.parseInt(lbl20p.getText().toString());
        }

        int newNumber16 = 0;
        if (!knorraioc.getText().toString().isEmpty()) {
          
                newNumber16 = Integer.parseInt(knorraioc.getText().toString());
        }

        int newNumber17 = 0;
        if (!knorraiod.getText().toString().isEmpty()) {
          
                newNumber17 = Integer.parseInt(knorraiod.getText().toString());
        }

        int newNumber18 = 0;
        if (!knorraiop.getText().toString().isEmpty()) {
          
                newNumber18 = Integer.parseInt(knorraiop.getText().toString());
        }

        int newNumber19 = 0;
        if (!knorrchknc.getText().toString().isEmpty()) {
          
                newNumber19 = Integer.parseInt(knorrchknc.getText().toString());
        }

        int newNumber20 = 0;
        if (!knorrchknd.getText().toString().isEmpty()) {
          
                newNumber20 = Integer.parseInt(knorrchknd.getText().toString());
        }

        int newNumber21 = 0;
        if (!knorrchknp.getText().toString().isEmpty()) {
          
                newNumber21 = Integer.parseInt(knorrchknp.getText().toString());
        }

        int newNumber22 = 0;
        if (!sig30c.getText().toString().isEmpty()) {
          
                newNumber22 = Integer.parseInt(sig30c.getText().toString());
        }

        int newNumber23 = 0;
        if (!sig30d.getText().toString().isEmpty()) {
          
                newNumber23 = Integer.parseInt(sig30d.getText().toString());
        }

        int newNumber24 = 0;
        if (!sig30p.getText().toString().isEmpty()) {
          
                newNumber24 = Integer.parseInt(sig30p.getText().toString());
        }

        int newNumber25 = 0;
        if (!sig60c.getText().toString().isEmpty()) {
          
                newNumber25 = Integer.parseInt(sig60c.getText().toString());
        }

        int newNumber26 = 0;
        if (!sig60d.getText().toString().isEmpty()) {
          
                newNumber26 = Integer.parseInt(sig60d.getText().toString());
        }

        int newNumber27 = 0;
        if (!sig60p.getText().toString().isEmpty()) {
          
                newNumber27 = Integer.parseInt(sig60p.getText().toString());
        }

        int newNumber28 = 0;
        if (!sig140c.getText().toString().isEmpty()) {
          
                newNumber28 = Integer.parseInt(sig140c.getText().toString());
        }

        int newNumber29 = 0;
        if (!sig140d.getText().toString().isEmpty()) {
          
                newNumber29 = Integer.parseInt(sig140d.getText().toString());
        }

        int newNumber30 = 0;
        if (!sig140p.getText().toString().isEmpty()) {
          
                newNumber30 = Integer.parseInt(sig140p.getText().toString());
        }
        int newNumber31 = 0;
        if (!sun40c.getText().toString().isEmpty()) {
          
                newNumber31 = Integer.parseInt(sun40c.getText().toString());
        }

        int newNumber32 = 0;
        if (!sun40d.getText().toString().isEmpty()) {
          
                newNumber32 = Integer.parseInt(sun40d.getText().toString());
        }

        int newNumber33 = 0;
        if (!sun40p.getText().toString().isEmpty()) {
          
                newNumber33 = Integer.parseInt(sun40p.getText().toString());
        }
        int newNumber34 = 0;
        if (!sun90c.getText().toString().isEmpty()) {
          
                newNumber34 = Integer.parseInt(sun90c.getText().toString());
        }

        int newNumber35 = 0;
        if (!sun90d.getText().toString().isEmpty()) {
          
                newNumber35 = Integer.parseInt(sun90d.getText().toString());
        }

        int newNumber36 = 0;
        if (!sun90p.getText().toString().isEmpty()) {
          
                newNumber36 = Integer.parseInt(sun90p.getText().toString());
        }
        int newNumber37 = 0;
        if (!sun160c.getText().toString().isEmpty()) {
          
                newNumber37 = Integer.parseInt(sun160c.getText().toString());
        }

        int newNumber38 = 0;
        if (!sun160d.getText().toString().isEmpty()) {
          
                newNumber38 = Integer.parseInt(sun160d.getText().toString());
        }

        int newNumber39 = 0;
        if (!sun160p.getText().toString().isEmpty()) {
          
                newNumber39 = Integer.parseInt(sun160p.getText().toString());
        }

        int newNumber40 = 0;
        if (!sunbarc.getText().toString().isEmpty()) {
          
                newNumber40 = Integer.parseInt(sunbarc.getText().toString());
        }

        int newNumber41 = 0;
        if (!sunbard.getText().toString().isEmpty()) {
          
                newNumber41 = Integer.parseInt(sunbard.getText().toString());
        }

        int newNumber42 = 0;
        if (!sunbarp.getText().toString().isEmpty()) {
          
                newNumber42 = Integer.parseInt(sunbarp.getText().toString());
        }

        int newNumber43 = 0;
        if (!sun500c.getText().toString().isEmpty()) {
          
                newNumber43 = Integer.parseInt(sun500c.getText().toString());
        }

        int newNumber44 = 0;
        if (!sun500d.getText().toString().isEmpty()) {
          
                newNumber44 = Integer.parseInt(sun500d.getText().toString());
        }

        int newNumber45 = 0;
        if (!sun500p.getText().toString().isEmpty()) {
          
                newNumber45 = Integer.parseInt(sun500p.getText().toString());
        }

        int newNumber46 = 0;
        if (!sun1kc.getText().toString().isEmpty()) {
          
                newNumber46 = Integer.parseInt(sun1kc.getText().toString());
        }

        int newNumber47 = 0;
        if (!sun1kp.getText().toString().isEmpty()) {
          
                newNumber47 = Integer.parseInt(sun1kp.getText().toString());
        }

        int newNumber48 = 0;
        if (!sun5kc.getText().toString().isEmpty()) {
          
                newNumber48 = Integer.parseInt(sun5kc.getText().toString());
        }
     

        int newNumber49 = 0;
        if (!shacoc350c.getText().toString().isEmpty()) {
          
                newNumber49 = Integer.parseInt(shacoc350c.getText().toString());
        }

        int newNumber50 = 0;
        if (!shacoc350p.getText().toString().isEmpty()) {
          
                newNumber50 = Integer.parseInt(shacoc350p.getText().toString());
        }

        int newNumber51 = 0;
        if (!concoc350c.getText().toString().isEmpty()) {
          
                newNumber51 = Integer.parseInt(concoc350c.getText().toString());
        }

        int newNumber52 = 0;
        if (!concoc350p.getText().toString().isEmpty()) {
          
                newNumber52 = Integer.parseInt(concoc350p.getText().toString());
        }

        int newNumber53 = 0;
        if (!shaavo350c.getText().toString().isEmpty()) {
          
                newNumber53 = Integer.parseInt(shaavo350c.getText().toString());
        }

        int newNumber54 = 0;
        if (!shaavo350p.getText().toString().isEmpty()) {
          
                newNumber54 = Integer.parseInt(shaavo350p.getText().toString());
        }
        int newNumber55 = 0;
        if (!conavo350c.getText().toString().isEmpty()) {
          
                newNumber55 = Integer.parseInt(conavo350c.getText().toString());
        }

        int newNumber56 = 0;
        if (!conavo350p.getText().toString().isEmpty()) {
          
                newNumber56 = Integer.parseInt(conavo350p.getText().toString());
        }

        int newNumber57 = 0;
        if (!shacoc700c.getText().toString().isEmpty()) {
          
                newNumber57 = Integer.parseInt(shacoc700c.getText().toString());
        }

        int newNumber58 = 0;
        if (!shacoc700p.getText().toString().isEmpty()) {
          
                newNumber58 = Integer.parseInt(shacoc700p.getText().toString());
        }

        int newNumber59 = 0;
        if (!concoc700c.getText().toString().isEmpty()) {
          
                newNumber59 = Integer.parseInt(concoc700c.getText().toString());
        }

        int newNumber60 = 0;
        if (!concoc700p.getText().toString().isEmpty()) {
          
                newNumber60 = Integer.parseInt(concoc700p.getText().toString());
        }

        int newNumber61 = 0;
        if (!shaavo700c.getText().toString().isEmpty()) {
          
                newNumber61 = Integer.parseInt(shaavo700c.getText().toString());
        }

        int newNumber62 = 0;
        if (!shaavo700p.getText().toString().isEmpty()) {
          
                newNumber62 = Integer.parseInt(shaavo700p.getText().toString());
        }
        int newNumber63 = 0;
        if (!conavo700c.getText().toString().isEmpty()) {
          
                newNumber63 = Integer.parseInt(conavo700c.getText().toString());
        }

        int newNumber64 = 0;
        if (!conavo700p.getText().toString().isEmpty()) {
          
                newNumber64 = Integer.parseInt(conavo700p.getText().toString());
        }

        int newNumber65 = 0;
        if (!omo40c.getText().toString().isEmpty()) {
          
                newNumber65 = Integer.parseInt(omo40c.getText().toString());
        }

        int newNumber66 = 0;
        if (!omo40d.getText().toString().isEmpty()) {
          
                newNumber66 = Integer.parseInt(omo40d.getText().toString());
        }

        int newNumber67 = 0;
        if (!omo40p.getText().toString().isEmpty()) {
          
                newNumber67 = Integer.parseInt(omo40p.getText().toString());
        }

        int newNumber68 = 0;
        if (!omo100c.getText().toString().isEmpty()) {
          
                newNumber68 = Integer.parseInt(omo100c.getText().toString());
        }

        int newNumber69 = 0;
        if (!omo100d.getText().toString().isEmpty()) {
          
                newNumber69 = Integer.parseInt(omo100d.getText().toString());
        }

        int newNumber70 = 0;
        if (!omo100p.getText().toString().isEmpty()) {
          
                newNumber70 = Integer.parseInt(omo100p.getText().toString());
        }

        int newNumber71 = 0;
        if (!omo160c.getText().toString().isEmpty()) {
          
                newNumber71 = Integer.parseInt(omo160c.getText().toString());
        }

        int newNumber72 = 0;
        if (!omo160d.getText().toString().isEmpty()) {
          
                newNumber72 = Integer.parseInt(omo160d.getText().toString());
        }

        int newNumber73 = 0;
        if (!omo160p.getText().toString().isEmpty()) {
          
                newNumber73 = Integer.parseInt(omo160p.getText().toString());
        }

        int newNumber74 = 0;
        if (!omo500c.getText().toString().isEmpty()) {
          
                newNumber74 = Integer.parseInt(omo500c.getText().toString());
        }

        int newNumber75 = 0;
        if (!omo500d.getText().toString().isEmpty()) {
          
                newNumber75 = Integer.parseInt(omo500d.getText().toString());
        }

        int newNumber76 = 0;
        if (!omo500p.getText().toString().isEmpty()) {
          
                newNumber76 = Integer.parseInt(omo500p.getText().toString());
        }

        int newNumber77 = 0;
        if (!omo1kc.getText().toString().isEmpty()) {
          
                newNumber77 = Integer.parseInt(omo1kc.getText().toString());
        }


        int newNumber78 = 0;
        if (!omo1kp.getText().toString().isEmpty()) {
          
                newNumber78 = Integer.parseInt(omo1kp.getText().toString());
        }

        int newNumber79 = 0;
        if (!omo3kc.getText().toString().isEmpty()) {
          
                newNumber79 = Integer.parseInt(omo3kc.getText().toString());
        }


        int newNumber80 = 0;
        if (!omo3kp.getText().toString().isEmpty()) {
          
                newNumber80 = Integer.parseInt(omo3kp.getText().toString());
        }
        int newNumber81 = 0;
        if (!luxsc70c.getText().toString().isEmpty()) {
            newNumber81 = Integer.parseInt(luxsc70c.getText().toString());
        }

        int newNumber82 = 0;
        if (!luxsc70d.getText().toString().isEmpty()) {
            newNumber82 = Integer.parseInt(luxsc70d.getText().toString());
        }

        int newNumber83 = 0;
        if (!luxsc70p.getText().toString().isEmpty()) {
            newNumber83 = Integer.parseInt(luxsc70p.getText().toString());
        }
        int newNumber84 = 0;
        if (!luxst70c.getText().toString().isEmpty()) {
            newNumber84 = Integer.parseInt(luxst70c.getText().toString());
        }

        int newNumber85 = 0;
        if (!luxst70d.getText().toString().isEmpty()) {
            newNumber85 = Integer.parseInt(luxst70d.getText().toString());
        }

        int newNumber86 = 0;
        if (!luxst70p.getText().toString().isEmpty()) {
            newNumber86 = Integer.parseInt(luxst70p.getText().toString());
        }


        int newNumber87 = 0;
        if (!luxsc150c.getText().toString().isEmpty()) {
            newNumber87 = Integer.parseInt(luxsc150c.getText().toString());
        }

        int newNumber88 = 0;
        if (!luxsc150d.getText().toString().isEmpty()) {
            newNumber88 = Integer.parseInt(luxsc150d.getText().toString());
        }

        int newNumber89 = 0;
        if (!luxsc150p.getText().toString().isEmpty()) {
            newNumber89 = Integer.parseInt(luxsc150p.getText().toString());
        }
        int newNumber90 = 0;
        if (!luxst150c.getText().toString().isEmpty()) {
            newNumber90 = Integer.parseInt(luxst150c.getText().toString());
        }

        int newNumber91 = 0;
        if (!luxst150d.getText().toString().isEmpty()) {
            newNumber91 = Integer.parseInt(luxst150d.getText().toString());
        }

        int newNumber92 = 0;
        if (!luxst150p.getText().toString().isEmpty()) {
            newNumber92 = Integer.parseInt(luxst150p.getText().toString());
        }
        
        int newNumber93 = 0;
        if (!shacoc15c.getText().toString().isEmpty()) {
            newNumber93 = Integer.parseInt(shacoc15c.getText().toString());
        }

        int newNumber94 = 0;
        if (!shacoc15d.getText().toString().isEmpty()) {
            newNumber94 = Integer.parseInt(shacoc15d.getText().toString());
        }

        int newNumber95 = 0;
        if (!shacoc15p.getText().toString().isEmpty()) {
            newNumber95 = Integer.parseInt(shacoc15p.getText().toString());
        }
        
        int newNumber96 = 0;
        if (!concoc15c.getText().toString().isEmpty()) {
            newNumber96 = Integer.parseInt(concoc15c.getText().toString());
        }

        int newNumber97 = 0;
        if (!concoc15d.getText().toString().isEmpty()) {
            newNumber97 = Integer.parseInt(concoc15d.getText().toString());
        }

        int newNumber98 = 0;
        if (!concoc15p.getText().toString().isEmpty()) {
            newNumber98 = Integer.parseInt(concoc15p.getText().toString());
        }




    newNumber1 *= 72;
    newNumber2 *= 12;

            newNumber4 *= 72;
            newNumber5 *= 12;
            
            newNumber7 *= 36;
            newNumber8 *= 12;
            
            newNumber10 *= 36;
            newNumber11*= 12;

            newNumber13 *= 144;
            newNumber14*= 12;

            newNumber16 *= 240;
            newNumber17*= 12;

            newNumber19 *= 240;
            newNumber20*= 12;

            newNumber22 *= 144;
            newNumber23*= 12;

            newNumber25 *= 72;
            newNumber26*= 12;

            newNumber28 *=48;
            newNumber29*= 12;

            newNumber31 *=100;
            newNumber32*= 12;

            newNumber34 *=72;
            newNumber35*= 12;

            newNumber37 *=48;
            newNumber38*= 12;

            newNumber40 *=50;
            newNumber41*= 12;

            newNumber43 *=24;
            newNumber44*= 12;

            newNumber46*= 12;

            newNumber49*= 12;

            newNumber51*= 12;

            newNumber53*= 12;

            newNumber55*= 12;

            newNumber57*= 12;

            newNumber59*= 12;

            newNumber61*= 12;

            newNumber63*= 12;

            newNumber65 *=100;
            newNumber66*= 12;

            newNumber68 *=72;
            newNumber69*= 12;

            newNumber71 *=48;
            newNumber72*= 12;

            newNumber74 *=24;
            newNumber75*= 12;

            newNumber77 *=12;

            newNumber79 *=4;

            newNumber81 *= 72;
            newNumber82 *= 12;

            newNumber84 *= 72;
            newNumber85 *= 12;
            
            newNumber87 *= 36;
            newNumber88 *= 12;
            
            newNumber90 *= 36;
            newNumber91*= 12;
            
            newNumber93 *= 360;
            newNumber94*= 12;
            
            newNumber96 *= 360;
            newNumber97*= 12;

            newNumber99 *= 144;
            newNumber100*= 12;
















    int sum1 = newNumber1 + newNumber2 + newNumber3;

  







    // Create a JSONObject to store the key-value pairs
    JSONObject jsonObject = new JSONObject();
    try {
jsonObject.put("lbt70g", sum1);
            jsonObject.put("lbl70g", newNumber4 + newNumber5 + newNumber6);
            jsonObject.put("lbt150g", newNumber7 + newNumber8 + newNumber9);
            jsonObject.put("lbl150g", newNumber10 + newNumber11 + newNumber12);
            jsonObject.put("lbt20g", newNumber13 + newNumber14 + newNumber15);
            jsonObject.put("lbl20g", newNumber99 + newNumber100 + newNumber101);
            jsonObject.put("knorraio", newNumber16 + newNumber17 + newNumber18);
            jsonObject.put("knorrchicken", newNumber19 + newNumber20 + newNumber21);
            jsonObject.put("signal30g", newNumber22 + newNumber23 + newNumber24);
            jsonObject.put("signal60g", newNumber25 + newNumber26 + newNumber27);
            jsonObject.put("signal140g", newNumber28 + newNumber29 + newNumber30);
            jsonObject.put("sunlight_40g", newNumber31 + newNumber32 + newNumber33);
            jsonObject.put("sunlight90g", newNumber34 + newNumber35 + newNumber36);
            jsonObject.put("sunlight160g", newNumber37 + newNumber38 + newNumber39);
            jsonObject.put("sunlightbar_200g", newNumber40 + newNumber41 + newNumber42);
            jsonObject.put("sunlight500g", newNumber43 + newNumber44 + newNumber45);
            jsonObject.put("sunlight1kg", newNumber46 + newNumber47);
            jsonObject.put("sunlight5kg", newNumber48);
            jsonObject.put("shacoc350ml", newNumber49 + newNumber50);
            jsonObject.put("concoc350ml", newNumber51 + newNumber52);
            jsonObject.put("shaavo350ml", newNumber53 + newNumber54);
            jsonObject.put("conavo350ml", newNumber55 + newNumber56);
            jsonObject.put("shacoc700ml", newNumber57 + newNumber58);
            jsonObject.put("concoc700ml", newNumber59 + newNumber60);
            jsonObject.put("shaavo700ml", newNumber61 + newNumber62);
            jsonObject.put("conavo700ml", newNumber63 + newNumber64);
            jsonObject.put("omo40g", newNumber65 + newNumber66 + newNumber67);
            jsonObject.put("omo100g", newNumber68 + newNumber69 + newNumber70);
            jsonObject.put("omo160g", newNumber71 + newNumber72 + newNumber73);
            jsonObject.put("omo500g", newNumber74 + newNumber75 + newNumber76);
            jsonObject.put("omo1kg", newNumber77 + newNumber78);
            jsonObject.put("omo3kg", newNumber79 + newNumber80);
            jsonObject.put("luxsc70g", newNumber81 + newNumber82 + newNumber83);
            jsonObject.put("luxst70g", newNumber84 + newNumber85 + newNumber86);
            jsonObject.put("luxsc150g", newNumber87 + newNumber88 + newNumber89);
            jsonObject.put("luxst150g", newNumber90 + newNumber91 + newNumber92);
            jsonObject.put("shacoc15ml", newNumber93 + newNumber94 + newNumber95);
            jsonObject.put("concoc15ml", newNumber96 + newNumber97 + newNumber98);












        
       
    } catch (JSONException e) {
        e.printStackTrace();
    }

    mItemList.add(jsonObject.toString());

    mExternalStorage.storeListAsJson(mItemList);
}


private void calculateTotal() {

        double lbt70cValue = getValueFromEditText( lbt70c )* 72 * price.plbt70g ;
        double lbt70dValue = getValueFromEditText( lbt70d )* 12 * price.plbt70g ;
        double lbt70pValue = getValueFromEditText( lbt70p ) * price.plbt70g ;
        double  lbl70cValue = getValueFromEditText(  lbl70c )* 72 * price.plbl70g ;
        double lbl70dValue = getValueFromEditText( lbl70d )* 12 * price.plbl70g ;
        double lbl70pValue = getValueFromEditText( lbl70p ) * price.plbl70g ;
        double  lbt150cValue = getValueFromEditText(  lbt150c )* 36 * price.plbt150g ;
        double lbt150dValue = getValueFromEditText( lbt150d )* 12 * price.plbt150g ;
        double lbt150pValue = getValueFromEditText( lbt150p ) * price.plbt150g ;
        double lbl150cValue = getValueFromEditText( lbl150c )* 36 * price.plbl150g ;
        double lbl150dValue = getValueFromEditText( lbl150d )* 12 * price.plbl150g ;
        double lbl150pValue = getValueFromEditText( lbl150p ) * price.plbl150g ;
        double lbt20cValue = getValueFromEditText( lbt20c )* 144 * price.plbt20g ;
        double lbt20dValue = getValueFromEditText( lbt20d )* 12 * price.plbt20g ;
        double lbt20pValue = getValueFromEditText( lbt20p )* price.plbt20g ;
        double lbl20cValue = getValueFromEditText( lbl20c )* 144 * price.plbl20g ;
        double lbl20dValue = getValueFromEditText( lbl20d )* 12 * price.plbl20g ;
        double lbl20pValue = getValueFromEditText( lbl20p )* price.plbl20g ;
        double knorraiocValue = getValueFromEditText( knorraioc )* 240 * price.pknorraio ;
        double knorraiodValue = getValueFromEditText( knorraiod )* 12 * price.pknorraio ;
        double knorraiopValue = getValueFromEditText( knorraiop )* price.pknorraio ;
        double knorrchkncValue = getValueFromEditText( knorrchknc )* 240 * price.pknorrchicken ;
        double knorrchkndValue = getValueFromEditText( knorrchknd )* 12 * price.pknorrchicken ;
        double knorrchknpValue = getValueFromEditText( knorrchknp )* price.pknorrchicken ;
        double sig60cValue = getValueFromEditText( sig60c )* 72 * price.psignal60g ;
        double sig60dValue = getValueFromEditText( sig60d )* 12 * price.psignal60g ;
        double sig60pValue = getValueFromEditText( sig60p )* price.psignal60g ;
        double sig30cValue = getValueFromEditText( sig30c )* 144 * price.psignal30g ;
        double sig30dValue = getValueFromEditText( sig30d )* 12 * price.psignal30g ;
        double sig30pValue = getValueFromEditText( sig30p )* price.psignal30g ;
        double sig140cValue = getValueFromEditText( sig140c )* 48 * price.psignal140g ;
        double sig140dValue = getValueFromEditText( sig140d )* 12 * price.psignal140g ;
        double sig140pValue = getValueFromEditText( sig140p )* price.psignal140g ;
        double sun40cValue = getValueFromEditText( sun40c )* 100 * price.psunlight_40g ;
        double sun40dValue = getValueFromEditText( sun40d )* 12 * price.psunlight_40g ;
        double sun40pValue = getValueFromEditText( sun40p )* price.psunlight_40g ;
        double sun90cValue = getValueFromEditText( sun90c )* 72 * price.psunlight90g ;
        double sun90dValue = getValueFromEditText( sun90d )* 12 * price.psunlight90g ;
        double sun90pValue = getValueFromEditText( sun90p )* price.psunlight90g ;
        double sun160cValue = getValueFromEditText( sun160c )* 48 * price.psunlight160g ;
        double sun160dValue = getValueFromEditText( sun160d )* 12 * price.psunlight160g ;
        double sun160pValue = getValueFromEditText( sun160p )* price.psunlight160g ;
        double sunbarcValue = getValueFromEditText( sunbarc )* 50 * price.psunlightbar_200g ;
        double sunbardValue = getValueFromEditText( sunbard )* 12 * price.psunlightbar_200g ;
        double sunbarpValue = getValueFromEditText( sunbarp )* price.psunlightbar_200g ;
        double sun500cValue = getValueFromEditText( sun500c )* 24 * price.psunlight500g ;
        double sun500dValue = getValueFromEditText( sun500d )* 12 * price.psunlight500g ;
        double sun500pValue = getValueFromEditText( sun500p )  * price.psunlight500g ;
        double sun1kcValue = getValueFromEditText( sun1kc )* 12 * price.psunlight1kg ;
        double sun1kpValue = getValueFromEditText( sun1kp )* price.psunlight1kg ;
        double sun5kcValue = getValueFromEditText( sun5kc )* price.psunlight5kg ;
        double  shacoc350cValue = getValueFromEditText(  shacoc350c )* 12 * price.pshacoc350ml ;
        double shacoc350pValue = getValueFromEditText( shacoc350p )* price.pshacoc350ml ;
        double concoc350cValue = getValueFromEditText( concoc350c )* 12 * price.pshacoc350ml ;
        double concoc350pValue = getValueFromEditText( concoc350p )* price.pshacoc350ml ;
        double shaavo350cValue = getValueFromEditText( shaavo350c )* 12* price.pshacoc350ml ;
        double shaavo350pValue = getValueFromEditText( shaavo350p )* price.pshacoc350ml ;
        double conavo350cValue = getValueFromEditText( conavo350c )* 12 * price.pshacoc350ml ;
        double conavo350pValue = getValueFromEditText( conavo350p )* price.pshacoc350ml ;
        double shacoc700cValue = getValueFromEditText( shacoc700c )* 12 * price.pshacoc700ml ;
        double shacoc700pValue = getValueFromEditText( shacoc700p )  * price.pshacoc700ml ;
        double concoc700cValue = getValueFromEditText( concoc700c )* 12 * price.pshacoc700ml ;
        double concoc700pValue = getValueFromEditText( concoc700p )* price.pshacoc700ml ;
        double shaavo700cValue = getValueFromEditText( shaavo700c )* 12 * price.pshacoc700ml ;
        double shaavo700pValue = getValueFromEditText( shaavo700p )* price.pshacoc700ml ;
        double conavo700cValue = getValueFromEditText( conavo700c )* 12 * price.pshacoc700ml ;
        double conavo700pValue = getValueFromEditText( conavo700p )* price.pshacoc700ml ;
        double omo40cValue = getValueFromEditText( omo40c )* 100 * price.pomo40g ;
        double omo40dValue = getValueFromEditText( omo40d )* 12 * price.pomo40g ;
        double omo40pValue = getValueFromEditText( omo40p )* price.pomo40g ;
        double omo100cValue = getValueFromEditText( omo100c )* 72 * price.pomo100g ;
        double omo100dValue = getValueFromEditText( omo100d )* 12 * price.pomo100g ;
        double omo100pValue = getValueFromEditText( omo100p )* price.pomo100g ;
        double omo160cValue = getValueFromEditText( omo160c )* 48 * price.pomo160g ;
        double omo160dValue = getValueFromEditText( omo160d )* 12 * price.pomo160g ;
        double omo160pValue = getValueFromEditText( omo160p )* price.pomo160g ;
        double omo500cValue = getValueFromEditText( omo500c )* 24 * price.pomo500g ;
        double omo500dValue = getValueFromEditText( omo500d )* 12 * price.pomo500g ;
        double omo500pValue = getValueFromEditText( omo500p )* price.pomo500g ;
        double omo1kcValue = getValueFromEditText( omo1kc )* 12 * price.pomo1kg ;
        double omo1kpValue = getValueFromEditText( omo1kp )* price.pomo1kg ;
        double omo3kcValue = getValueFromEditText( omo3kc )* 4 * price.pomo3kg ;
        double omo3kpValue = getValueFromEditText( omo3kp )* price.pomo3kg ;
        double luxsc70cValue = getValueFromEditText( luxsc70c )* 72 * price.pluxsc70g ;
        double luxsc70dValue = getValueFromEditText( luxsc70d )* 12 * price.pluxsc70g ;
        double luxsc70pValue = getValueFromEditText( luxsc70p )* price.pluxsc70g ;
        double luxst70cValue = getValueFromEditText( luxst70c )* 72 * price.pluxsc70g ;
        double luxst70dValue = getValueFromEditText( luxst70d )* 12 * price.pluxsc70g ;
        double luxst70pValue = getValueFromEditText( luxst70p )* price.pluxsc70g ;
        double luxsc150cValue = getValueFromEditText( luxsc150c )* 36 * price.pluxsc150g ;
        double luxsc150dValue = getValueFromEditText( luxsc150d )* 12 * price.pluxsc150g ;
        double luxsc150pValue = getValueFromEditText( luxsc150p )* price.pluxsc150g ;
        double luxst150cValue = getValueFromEditText( luxst150c )* 36 * price.pluxsc150g ;
        double luxst150dValue = getValueFromEditText( luxst150d )* 12 * price.pluxsc150g ;
        double luxst150pValue = getValueFromEditText( luxst150p ) * price.pluxsc150g ;
        double shacoc15cValue = getValueFromEditText( shacoc15c )* 360 * price.pshacoc15ml ;
        double shacoc15dValue = getValueFromEditText( shacoc15d )* 12 * price.pshacoc15ml ;
        double shacoc15pValue = getValueFromEditText( shacoc15p ) * price.pshacoc15ml ;
        double concoc15cValue = getValueFromEditText( concoc15c )* 360 * price.pconcoc15ml ;
        double concoc15dValue = getValueFromEditText( concoc15d )* 12 * price.pconcoc15ml ;
        double concoc15pValue = getValueFromEditText( concoc15p ) * price.pconcoc15ml ;


    double sum = lbt70cValue + lbt70dValue + lbt70pValue +   lbl70cValue + lbl70dValue + lbl70pValue +   lbt150cValue + lbt150dValue + lbt150pValue +  lbl150cValue + lbl150dValue + lbl150pValue + lbt20cValue + lbt20dValue + lbt20pValue + lbl20cValue + lbl20dValue + lbl20pValue +  knorraiocValue + knorraiodValue + knorraiopValue + knorrchkncValue + knorrchkndValue + knorrchknpValue +  sig60cValue + sig60dValue + sig60pValue +  sig30cValue + sig30dValue + sig30pValue +  sig140cValue + sig140dValue + sig140pValue +  sun40cValue + sun40dValue + sun40pValue +  sun90cValue + sun90dValue + sun90pValue +  sun160cValue + sun160dValue + sun160pValue +  sunbarcValue + sunbardValue + sunbarpValue +  sun500cValue + sun500dValue + sun500pValue +  sun1kcValue + sun1kpValue +  sun5kcValue +   shacoc350cValue + shacoc350pValue +  concoc350cValue + concoc350pValue +  shaavo350cValue + shaavo350pValue +  conavo350cValue + conavo350pValue +  shacoc700cValue + shacoc700pValue +  concoc700cValue + concoc700pValue +  shaavo700cValue + shaavo700pValue +  conavo700cValue + conavo700pValue +  omo40cValue + omo40dValue + omo40pValue +  omo100cValue + omo100dValue + omo100pValue +  omo160cValue + omo160dValue + omo160pValue +  omo500cValue + omo500dValue + omo500pValue +  omo1kcValue + omo1kpValue +  omo3kcValue + omo3kpValue +  luxsc70cValue + luxsc70dValue + luxsc70pValue +  luxst70cValue + luxst70dValue + luxst70pValue +  luxsc150cValue + luxsc150dValue + luxsc150pValue +  luxst150cValue + luxst150dValue + luxst150pValue + shacoc15cValue + shacoc15dValue + shacoc15pValue + concoc15cValue + concoc15dValue + concoc15pValue;
ActionBar actionBar = getActionBar();
String sum2 = String.format("%.2f", sum );
            actionBar.setTitle("Sum: " + String.valueOf(sum2));
}

private int getValueFromEditText(EditText editText) {
    try {
        String text = editText.getText().toString();
        if (!text.isEmpty()) {
            return Integer.parseInt(text);
        }
    } catch (NumberFormatException e) {
        e.printStackTrace();
    }
    return 0;
}

public class CustomTextWatcher implements TextWatcher {
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        calculateTotal();
    }

    @Override
    public void afterTextChanged(Editable s) {
    }
}


    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        storagePermissionManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }


}
