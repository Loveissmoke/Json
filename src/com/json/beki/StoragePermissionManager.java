package com.json.beki;


import com.json.beki.MainActivity;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.Manifest;
import android.os.Build;

public class StoragePermissionManager {

//private MainActivity mainActivity;

    private static final int REQUEST_STORAGE_PERMISSION = 1;
    private Activity activity;

    public StoragePermissionManager(Activity activity) {
        this.activity = activity;
    }

    public boolean isStoragePermissionGranted() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            int permission = activity.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            return permission == PackageManager.PERMISSION_GRANTED;
        }
        return true;
    }

    public void requestStoragePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            activity.requestPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE}, REQUEST_STORAGE_PERMISSION);
        }
    }

    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == REQUEST_STORAGE_PERMISSION && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            // Storage permission granted, you can proceed with your logic here
            ((MainActivity) activity).saveDataToJsonFile(); 

((MainActivity) activity).savedetail();
        
    }
}
    public void checkStoragePermission() {
        if (!isStoragePermissionGranted()) {
            requestStoragePermission();
        } else {
            // Handle logic when permission is already granted
        }
    }
}
