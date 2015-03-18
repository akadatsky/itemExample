package com.example.itemExample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        List<String> list = new ArrayList<String>();
        list.add("USD 22 25");
        list.add("EUR 25 28");
        list.add("RUB 0.3 0.35");
        list.add("GBP 32 35");

        LayoutInflater inflater = LayoutInflater.from(this);

        LinearLayout container = (LinearLayout) findViewById(R.id.container);

        for (int i = 0; i < list.size(); i++) {
            View view = inflater.inflate(R.layout.item, container, false);
            TextView currency = (TextView) view.findViewById(R.id.currency);
            currency.setText(list.get(i));

            container.addView(view);
        }




    }
}
