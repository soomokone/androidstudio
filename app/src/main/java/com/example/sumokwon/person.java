package com.example.sumokwon;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class person  extends AppCompatActivity {


    private Button btnAdd, btnMinus,btnAdd1,btnMinus1,btnAdd2,btnMinus2;
    private TextView tvcount,tvcount1,tvcount2;
    private int count = 0;
    private int count1=0;
    private int count2=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person);
        tvcount = findViewById(R.id.tv_count);
        tvcount.setText(count+"");
        btnAdd = findViewById(R.id.btn_add);
        btnMinus = findViewById(R.id.btn_minus);

        btnAdd1=findViewById(R.id.btn_add1);
        btnMinus1= findViewById(R.id.btn_minus1);
        tvcount1 = findViewById(R.id.tv_count1);
        tvcount1.setText(count1+"");

        btnAdd2=findViewById(R.id.btn_add2);
        btnMinus2= findViewById(R.id.btn_minus2);
        tvcount2 = findViewById(R.id.tv_count2);
        tvcount2.setText(count2+"");


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                tvcount.setText(count+"");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                tvcount.setText(count+"");
            }
        });

        btnAdd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1++;
                tvcount1.setText(count1+"");
            }
        });

        btnMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count1--;
                tvcount1.setText(count1+"");
            }
        });

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2++;
                tvcount2.setText(count2+"");
            }
        });

        btnMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count2--;
                tvcount2.setText(count2+"");
            }
        });
    }
}