package com.example.sumokwon;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private Context mContext=ListViewActivity.this;
    private ListView listView;
    private listAdapter adapter;

    List<String> items = Arrays.asList(
            "히어로즈","24시","로스트","로스트룸","빅뱅이론","프렌즈","덱스터","글리","히어로즈","24시","로스트","로스트룸","빅뱅이론","프렌즈","덱스터","글리"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        adapter=new listAdapter();
        listView=findViewById(R.id.list_view);

        adapter.addItems(items);

        listView.setAdapter(adapter);



    }
}