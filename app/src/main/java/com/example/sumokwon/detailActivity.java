package com.example.sumokwon;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class detailActivity extends AppCompatActivity {

    private TextView detail_name,detail_address,detail_link;
    String name,address,link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detailactivity);

        Intent i=getIntent();
        name=i.getStringExtra("name");
        address=i.getStringExtra("address");
        link=i.getStringExtra("link");

        detail_name = findViewById(R.id.detail_name);
        detail_link = findViewById(R.id.detail_link);
        detail_address = findViewById(R.id.detail_address);

        detail_name.setText(name);
        detail_address.setText(address);
        detail_link.setText(link);


}}


