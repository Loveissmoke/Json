package com.json.beki;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class DenominationActivity extends Activity {
    EditText twohun, onehun, fifty, ten, five, one;
    TextView sum;
    private SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denomination);
        
        sum = findViewById(R.id.sum);
        twohun = findViewById(R.id.twohun);
        onehun = findViewById(R.id.onehun);
        fifty = findViewById(R.id.fifty);
        ten = findViewById(R.id.ten);
        five = findViewById(R.id.five);
        one = findViewById(R.id.one);

        sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        twohun.setText(String.valueOf(sharedPreferences.getInt("twohunValue", 0)));
        onehun.setText(String.valueOf(sharedPreferences.getInt("onehunValue", 0)));
        fifty.setText(String.valueOf(sharedPreferences.getInt("fiftyValue", 0)));
        ten.setText(String.valueOf(sharedPreferences.getInt("tenValue", 0)));
        five.setText(String.valueOf(sharedPreferences.getInt("fiveValue", 0)));
        one.setText(String.valueOf(sharedPreferences.getInt("oneValue", 0)));

        calculateTotal();

        twohun.addTextChangedListener(new CustomTextWatcher());
        onehun.addTextChangedListener(new CustomTextWatcher());
        fifty.addTextChangedListener(new CustomTextWatcher());
        ten.addTextChangedListener(new CustomTextWatcher());
        five.addTextChangedListener(new CustomTextWatcher());
        one.addTextChangedListener(new CustomTextWatcher());
    }

    private void calculateTotal() {
        int twohunValue = getValueFromEditText(twohun) * 200;
        int onehunValue = getValueFromEditText(onehun) * 100;
        int fiftyValue = getValueFromEditText(fifty) * 50;
        int tenValue = getValueFromEditText(ten) * 10;
        int fiveValue = getValueFromEditText(five) * 5;
        int oneValue = getValueFromEditText(one);
        int totalsum = twohunValue + onehunValue + fiftyValue + tenValue + fiveValue + oneValue;
        sum.setText(String.valueOf(totalsum));

        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("twohunValue", getValueFromEditText(twohun));
        editor.putInt("onehunValue", getValueFromEditText(onehun));
        editor.putInt("fiftyValue", getValueFromEditText(fifty));
        editor.putInt("tenValue", getValueFromEditText(ten));
        editor.putInt("fiveValue", getValueFromEditText(five));
        editor.putInt("oneValue", getValueFromEditText(one));
        editor.apply();
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
}
