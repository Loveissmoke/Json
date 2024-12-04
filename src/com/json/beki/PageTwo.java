package com.json.beki;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.webkit.WebView;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import android.os.AsyncTask;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import android.os.Handler;





public class PageTwo extends Activity {


WebView calender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_two);


calender = (WebView)findViewById(R.id.calender);

calender.getSettings().setDomStorageEnabled(true);
calender.getSettings().setJavaScriptEnabled(true);
calender.loadUrl("file:///android_asset/calender.html");





Button deno = findViewById(R.id.deno);
        deno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent = new Intent(PageTwo.this, DenominationActivity.class);
        startActivity(intent);
   }
 });


Button dayend = findViewById(R.id.dayend);
        dayend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
showAlert();
                
            }
        });


Button price = findViewById(R.id.price);
        price.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

String packageName = "com.beki.dbirhanuni";
Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
if (intent != null) { startActivity(intent);
}
else { 
Toast.makeText(getApplicationContext(), "App not installed.", Toast.LENGTH_SHORT).show();
}
                
            }
        });

        
Button report = findViewById(R.id.report);
        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent = new Intent(PageTwo.this, ReportActivity.class);
        startActivity(intent);
   }
 });


Button bydate = findViewById(R.id.bydate);
        bydate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent = new Intent(PageTwo.this, ByDateActivity.class);
        startActivity(intent);
   }
 });

Button note = findViewById(R.id.note);
        note.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent = new Intent(PageTwo.this, NoteActivity.class);
        startActivity(intent);
   }
 });



Button detail = findViewById(R.id.detail);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

Intent intent = new Intent(PageTwo.this, DetailActivity.class);
        startActivity(intent);
   }
 });



}
private void renameDataJson() {
    File oldFile = new File("/storage/emulated/0/data.json");

    if (oldFile.exists()) {
        String newFileName = generateNewFileName();
        File newFile = new File(oldFile.getParentFile(), newFileName);

        if (oldFile.renameTo(newFile)) {
            // File renamed successfully
            Toast.makeText(this, "File renamed to " + newFileName, Toast.LENGTH_SHORT).show();

            // Move the renamed file to the specified folder
            File destinationFolder = new File("/storage/emulated/0/json_beki");
            if (!destinationFolder.exists()) {
                destinationFolder.mkdirs();
            }
            File destinationFile = new File(destinationFolder, newFileName);
            if (newFile.renameTo(destinationFile)) {
                // File moved successfully
                Toast.makeText(this, "File moved to " + destinationFolder.getAbsolutePath(), Toast.LENGTH_SHORT).show();
            } else {
                // Error moving the file
                Toast.makeText(this, "Error moving the file", Toast.LENGTH_SHORT).show();
            }
        } else {
            // Error renaming the file
            Toast.makeText(this, "Error renaming the file", Toast.LENGTH_SHORT).show();
        }
    } else {
        // File does not exist
        Toast.makeText(this, "File does not exist", Toast.LENGTH_SHORT).show();
    }
}

private String generateNewFileName() {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault());
        String formattedDate = dateFormat.format(currentDate);
        return "data_" + formattedDate + ".json";
    }

private void showAlert() { 
AlertDialog.Builder builder = new AlertDialog.Builder(this);
builder.setMessage("Do you want to proceed?") .setPositiveButton("OK", new DialogInterface.OnClickListener() { public void onClick(DialogInterface dialog, int id) {
 // OK button clicked
 dialog.dismiss(); 
sendDocumentToTelegram();


new Handler().postDelayed(new Runnable() {
@Override public void run() {
renameDataJson(); 
deleteFile();
}}, 2000);




} }) .setNegativeButton("Cancel", new DialogInterface.OnClickListener() { public void onClick(DialogInterface dialog, int id) {
 // Cancel button clicked 
dialog.dismiss();
 } }); AlertDialog dialog = builder.create(); dialog.show();

}



public void deleteFile() {
    String filePath = "/storage/emulated/0/detail.json";

    File file = new File(filePath);
    if (file.exists()) {
        boolean deleted = file.delete();
        if (deleted) {
            // File successfully deleted
            Toast.makeText(this, " File successfully deleted", Toast.LENGTH_SHORT).show();
        } else {
            // Failed to delete the file
            Toast.makeText(this, " Failed to delete the file", Toast.LENGTH_SHORT).show();
        }
    } else {
        // File does not exist
        Toast.makeText(this, " File does not exist", Toast.LENGTH_SHORT).show();
    }
}






    

/*

    private void sendDocumentToTelegram() {
        new SendTelegramTask().execute();
    }

    private class SendTelegramTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            String botToken = "6660089668:AAH31lgOdgCiz6NolE1kslm9W7aIZdKW46s";
            String chatId = "-1001645954621";
            String url = "https://api.telegram.org/bot" + botToken + "/sendDocument";

            File file = new File("/storage/emulated/0/data.json");

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);

                String boundary = "---------------------------" + System.currentTimeMillis();

                connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

                DataOutputStream dos = new DataOutputStream(connection.getOutputStream());

                dos.writeBytes("--" + boundary + "\r\n");
                dos.writeBytes("Content-Disposition: form-data; name=\"chat_id\"\r\n\r\n");
                dos.writeBytes(chatId + "\r\n");

                dos.writeBytes("--" + boundary + "\r\n");
                dos.writeBytes("Content-Disposition: form-data; name=\"document\"; filename=\"" + file.getName() + "\"\r\n");
                dos.writeBytes("Content-Type: application/json\r\n\r\n");

                FileInputStream fis = new FileInputStream(file);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    dos.write(buffer, 0, bytesRead);
                }
                fis.close();

                dos.writeBytes("\r\n--" + boundary + "--\r\n");
                dos.flush();
                dos.close();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Successfully sent the document
                } else {
                    // Handle unsuccessful response
                }

                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }
}

*/


    private void sendDocumentToTelegram() {
        new SendTelegramTask().execute();
    }

    private class SendTelegramTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            String botToken = "6660089668:AAH31lgOdgCiz6NolE1kslm9W7aIZdKW46s";
            String chatId = "-1001645954621";
            String url = "https://api.telegram.org/bot" + botToken + "/sendDocument";

            File sourceFile = new File("/storage/emulated/0/data.json");

            // Format the current date
            Date currentDate = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy", Locale.getDefault());
            String formattedDate = dateFormat.format(currentDate);

            // Construct the destination filename
            String destinationFilename = "data_" + formattedDate + ".json";

            try {
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
                connection.setRequestMethod("POST");
                connection.setDoOutput(true);

                String boundary = "---------------------------" + System.currentTimeMillis();

                connection.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + boundary);

                DataOutputStream dos = new DataOutputStream(connection.getOutputStream());

                dos.writeBytes("--" + boundary + "\r\n");
                dos.writeBytes("Content-Disposition: form-data; name=\"chat_id\"\r\n\r\n");
                dos.writeBytes(chatId + "\r\n");

                dos.writeBytes("--" + boundary + "\r\n");
                dos.writeBytes("Content-Disposition: form-data; name=\"document\"; filename=\"" + destinationFilename + "\"\r\n");
                dos.writeBytes("Content-Type: application/json\r\n\r\n");

                FileInputStream fis = new FileInputStream(sourceFile);
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    dos.write(buffer, 0, bytesRead);
                }
                fis.close();

                dos.writeBytes("\r\n--" + boundary + "--\r\n");
                dos.flush();
                dos.close();

                int responseCode = connection.getResponseCode();
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Successfully sent the document

                } else {
                    // Handle unsuccessful
showErrorResponseToast(connection.getErrorStream());
                }

                connection.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }
    }




    private void showErrorResponseToast(InputStream errorStream) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(errorStream));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            final String errorMessage = response.toString();

            runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    Toast.makeText(PageTwo.this, "Error: " + errorMessage, Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }






}






