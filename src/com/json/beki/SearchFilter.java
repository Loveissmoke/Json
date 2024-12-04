package com.json.beki;


import android.widget.LinearLayout;
import android.widget.TextView;
import android.text.Editable;
import android.view.View;
import android.text.*;

public class SearchFilter implements TextWatcher {
    private LinearLayout linearLayoutContainer;

    public SearchFilter(LinearLayout linearLayoutContainer) {
        this.linearLayoutContainer = linearLayoutContainer;
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // Not used
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
        // Filter the linear layouts based on the search query
        filterLinearLayouts(charSequence.toString());
    }

    @Override
    public void afterTextChanged(Editable editable) {
        // Not used
    }

    private void filterLinearLayouts(String query) {
        for (int i = 0; i < linearLayoutContainer.getChildCount(); i++) {
            LinearLayout linearLayout = (LinearLayout) linearLayoutContainer.getChildAt(i);
            TextView textView = (TextView) linearLayout.getChildAt(0);
            // Assuming TextView is the first child

            if (textView.getText().toString().toLowerCase().contains(query.toLowerCase())) {
                linearLayout.setVisibility(View.VISIBLE);
            } else {
                linearLayout.setVisibility(View.GONE);
            }
        }
    }
}
