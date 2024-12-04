package com.json.beki;
import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;


public class NoteActivity extends Activity{
WebView WebV;
      @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

WebV = (WebView)findViewById(R.id.webV);

WebV.getSettings().setDomStorageEnabled(true);
WebV.getSettings().setJavaScriptEnabled(true);
WebV.loadUrl("file:///android_asset/list.html");



}
}