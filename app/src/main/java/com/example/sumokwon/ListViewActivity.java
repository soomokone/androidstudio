package com.example.sumokwon;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.opengl.EGLExt;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListViewActivity extends AppCompatActivity {
    private Button btnAdd3,btnAdd4,btnAdd5,btnMinus3,btnMinus4,btnMinus5;

    private TextView tvcount3,tvcount4,tvcount5;
    private int count3 = 0;
    private int count4=0;
    private int count5=0;
    private static final String TAG = "Main_Activity";

    private static final String TAG_JSON="list";
    private static final String TAG_region = "region";
    private static final String TAG_city = "city";
    private static final String TAG_name = "name";
    private static final String TAG_address = "address";
    private static final String TAG_link = "link";
    private static final String TAG_number="number";
    private static final String TAG_plant_secies = "plant_species";
    private static final String TAG_lon = "lon";
    private static final String TAG_lat="lat";
    private static final String TAG_holiday = "holiday";
    private static final String TAG_adult = "adult";
    private static final String TAG_teenager="teenager";
    private static final String TAG_army = "army";
    private static final String TAG_child = "child";
    private static final String TAG_elderly="elderly";
    private static final String TAG_idx = "idx";
    private static final String TAG_parking = "parking";
    private static final String TAG_comforts="comforts";
    private static final String TAG_summer = "summer";
    private static final String TAG_winter = "winter";
    private static final String TAG_deadline="deadline";


    public ListView listView;
    //list item
    ArrayList<SampleData> mItemList;
    //ListView adapter
    public ListViewAdapter mlistviewAdatper;
    //private ListViewAdapter adapter = new ListViewAdapter();
    public String mJsonString;

    String city,a_url;
    String name1, city1, address, link;
    // private Context mContext=ListViewActivity.this;
    private String str=null;
    public static final int REQUEST_CODE_MENU = 101;
    public static final int  REQUEST_CODE_MAIN = 202;
    public static final int  REQUEST_CODE_LIST = 303;
    private Context mContext=ListViewActivity.this;

    private Button btn_back,btn_map,txt_btn_cal,txt_btn_man;
    private TextView list_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        Intent i=getIntent();
        city=i.getStringExtra("city");
        a_url=i.getStringExtra("url");
        str=i.getStringExtra("str");

        txt_btn_cal=(Button)findViewById(R.id.calenderout1);//????????????
        list_text=(TextView)findViewById(R.id.list_text);
        list_text.setText(city);
        txt_btn_cal.setText(str);



        //Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
        //listview
        ListViewActivity.GetData task = new ListViewActivity.GetData();
        task.execute(a_url);


        txt_btn_cal=(Button)findViewById(R.id.calenderout1);//????????????
        txt_btn_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //list_calender??? ?????????
                Intent intent = new Intent(getApplicationContext(), List_calender.class);
                startActivityForResult(intent,REQUEST_CODE_LIST);

            }
        });

//
//        txt_btn_man=(Button)findViewById(R.id.txt_btn_man);//?????? ?????? textview
//        txt_btn_man.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //?????? ?????? ??? ????????????
//            }
//        });


        btn_back=(Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                System.out.println("intentintentintetnitnteitneientienteitn"+str);
                intent.putExtra("strr",str);
                //startActivity(intent);
                onBackPressed();

            }
        });


        btn_map=(Button)findViewById(R.id.btn_map);//???????????? ??????
        btn_map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //????????? ????????????
            }
        });

        tvcount3 = findViewById(R.id.tv_count3);
        tvcount3.setText(count3+"");
        btnAdd3 = findViewById(R.id.btn_add3);
        btnMinus3 = findViewById(R.id.btn_minus3);

        btnAdd4=findViewById(R.id.btn_add4);
        btnMinus4= findViewById(R.id.btn_minus4);
        tvcount4 = findViewById(R.id.tv_count4);
        tvcount4.setText(count4+"");

        btnAdd5=findViewById(R.id.btn_add5);
        btnMinus5= findViewById(R.id.btn_minus5);
        tvcount5 = findViewById(R.id.tv_count5);
        tvcount5.setText(count5+"");

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3++;
                tvcount3.setText(count3+"");
            }
        });

        btnMinus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count3--;
                tvcount3.setText(count3+"");
            }
        });

        btnAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4++;
                tvcount4.setText(count4+"");
            }
        });

        btnMinus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count4--;
                tvcount4.setText(count4+"");
            }
        });

        btnAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5++;
                tvcount5.setText(count5+"");
            }
        });

        btnMinus5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count5--;
                tvcount5.setText(count5+"");
            }
        });

        Button Button = (Button) findViewById(R.id.btn_map);
        Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mapActivity.class);
                startActivity(intent);
            }
        });
    }



    //????????? ?????????
    private class GetData extends AsyncTask<String, Void, String> {
        ProgressDialog progressDialog;
        String errorString = null;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            progressDialog = ProgressDialog.show(ListViewActivity.this,
                    "Please Wait", null, true, true);
        }


        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);

            progressDialog.dismiss();
            //m TextViewResult.setText(result);
            Log.d(TAG, "response  - " + result);

            if (result == null) {

                //mTextViewResult.setText(errorString);
            } else {
                //php?????? ?????? json ???
                mJsonString = result;
                //list??? ?????????
                Result();

            }
        }


        @Override
        protected String doInBackground(String... params) {

            String serverURL = params[0];

            try {

                URL url = new URL(serverURL);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.connect();

                int responseStatusCode = httpURLConnection.getResponseCode();
                Log.d(TAG, "response code - " + responseStatusCode);

                InputStream inputStream;
                if (responseStatusCode == HttpURLConnection.HTTP_OK) {
                    inputStream = httpURLConnection.getInputStream();
                } else {
                    inputStream = httpURLConnection.getErrorStream();
                }


                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                StringBuilder sb = new StringBuilder();
                String line;

                while ((line = bufferedReader.readLine()) != null) {
                    sb.append(line);
                }

                bufferedReader.close();
                return sb.toString().trim();

            } catch (Exception e) {

                Log.d(TAG, "InsertData: Error ", e);
                errorString = e.toString();
                return null;
            }

        }
    }


    private void Result() {
        try {
            JSONObject jsonObject = new JSONObject(mJsonString);
            JSONArray jsonArray = jsonObject.getJSONArray(TAG_JSON);
            Log.d(TAG, "response1  - " + jsonArray);

            mItemList = new ArrayList<>();
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject item = jsonArray.getJSONObject(i);

                String name1 = item.getString(TAG_name);
                String city1 = item.getString(TAG_city);

                String strAdult = item.getString(TAG_adult); // 123 ????????? db?????? ??? ????????? ??????
                String strTeen = item.getString(TAG_teenager);
                String strArmy = item.getString(TAG_army);
                String strChild = item.getString(TAG_child);
                String strElder = item.getString(TAG_elderly);

                String address = item.getString(TAG_address);
                String link = item.getString(TAG_link);

                String price1 = String.valueOf(Calc(strAdult,strTeen,strArmy,strChild,strElder));

                Log.d(TAG, "name  - " + name1);
                Log.d(TAG, "city  - " + city1);
                Log.d(TAG, "city  - " + price1);
                Log.d(TAG, "address  - " + address);
                Log.d(TAG, "link  - " + link);

                mItemList.add(new SampleData(name1,city1,price1,address,link));

            }

            Log.d(TAG, "response2  - " + mItemList);

        } catch (JSONException e) {

            Log.d(TAG, "showResult : ", e);
        }
        mlistviewAdatper = new ListViewAdapter(this,mItemList);

        listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(mlistviewAdatper);
        listView.setOnItemClickListener((new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View a_view, int position, long l) {
                final SampleData item = (SampleData) mlistviewAdatper.getItem(position);


                //Toast.makeText(PhMainActivity.this, item.getCountry() + " Click event", Toast.LENGTH_SHORT).show();

                Intent intent=new Intent(getApplicationContext(),detailActivity.class );
                intent.putExtra("name",item.getName());
                intent.putExtra("address",item.getAddress());
                intent.putExtra("link",item.getLink());

                Log.d(TAG, "address  - " + address);
                Log.d(TAG, "link  - " + link);

                startActivity(intent);//activity ??????

            }
        }));
    }

    public static Integer Calc(String strAdult,String strTeen,String strArmy,String strChild,String strElder) {
        // TODO Auto-generated method stub

        int adult = Integer.parseInt(strAdult); // string -> int ??????
        int teenager = Integer.parseInt(strTeen);
        int army = Integer.parseInt(strArmy);
        int child = Integer.parseInt(strChild);
        int elderly = Integer.parseInt(strElder);

        // 0 ????????? ??? ????????????
        int numAdult = 1; // ?????? ???
        int numTeen = 0; // ????????? ???
        int numArmy = 0; // ?????? ???
        int numChild = 0; // ????????? ???
        int numElder = 0; // ?????? ???

        Integer calc = adult*numAdult + teenager*numTeen + army*numArmy + child*numChild + elderly*numElder;
        return calc;
    };
//
//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if(requestCode==REQUEST_CODE_MENU){
//            if(resultCode==RESULT_OK){
//                str=data.getStringExtra("str");
//                txt_btn_cal.setText(str);
//            }
//
//        }
//    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==REQUEST_CODE_LIST) {
            if (resultCode == RESULT_OK) {
                str = data.getStringExtra("str");
                txt_btn_cal.setText(str);
                System.out.println("listview_________" + str);

            }
        }
    }


}