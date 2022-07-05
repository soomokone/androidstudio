package com.example.sumokwon;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.opengl.EGLExt;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {

    private static final String TAG = "Main_Activity";
    private Context mContext=ListViewActivity.this;
    private ListView listView;
    private listAdapter adapter;
    String city;
    String str;
    private Button btn_back,btn_map,txt_btn_cal,txt_btn_man;
    private TextView list_text;
    public static final int REQUEST_CODE_MENU = 101;

    List<String> items = Arrays.asList(
            "히어로즈","24시","로스트","로스트룸","빅뱅이론","프렌즈","덱스터","글리","히어로즈","24시","로스트","로스트룸","빅뱅이론","프렌즈","덱스터","글리"
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);
        Intent i=getIntent();
        adapter=new listAdapter();
        listView=findViewById(R.id.list_view);
        adapter.addItems(items);
        listView.setAdapter(adapter);
        city=i.getStringExtra("city");

        list_text=(TextView)findViewById(R.id.list_text);
        list_text.setText(city);

        txt_btn_cal=(Button)findViewById(R.id.txt_btn_cal);//날짜선택 textview
        txt_btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //list_calender로 넘기기
                Intent intent = new Intent(getApplicationContext(), List_calender.class);
                startActivityForResult(intent,REQUEST_CODE_MENU);
            }
        });

        txt_btn_man=(Button)findViewById(R.id.txt_btn_man);//인원 선택 textview
        txt_btn_man.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //인원 선택 창 넘어가기
            }
        });

        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { onBackPressed();}
        });

        btn_map=(Button)findViewById(R.id.btn_map);//지도보기 버튼
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //지도로 넘어가기
            }
        });
    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RESULT_OK){
            Intent i=getIntent();
            str=i.getStringExtra(str);
            txt_btn_cal.setText(str);
        }

    }
}