package com.example.sumokwon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class searchActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search1);


        Button Button = (Button) findViewById(R.id.day);
        Button.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), calender.class);
                startActivity(intent);
            }


        });


    }
}
