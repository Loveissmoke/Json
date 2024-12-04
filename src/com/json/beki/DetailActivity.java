package com.json.beki;

import com.json.beki.ExternalStorage;
import android.app.Activity;
import android.widget.*;
import java.util.ArrayList;
import android.os.Bundle;
import android.widget.ListView;


public class DetailActivity extends Activity {

private ExternalStorage mExternalStorage;
private ArrayList < String > mItemList;
private ListView detail;
  @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);

    detail = findViewById(R.id.detail);

    mExternalStorage = new ExternalStorage();
    mItemList = mExternalStorage.loadListAsJson();

    ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mItemList);
    detail.setAdapter(adapter);
}

}
