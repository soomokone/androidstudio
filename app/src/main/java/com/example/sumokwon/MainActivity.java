package com.example.sumokwon;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import com.android.volley.VolleyError;

import me.relex.circleindicator.CircleIndicator3;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 mPager;
    private FragmentStateAdapter pagerAdapter;
    private int num_page = 4;
    private CircleIndicator3 mIndicator;
    Button seoul,incheon,gangwon,daejon,gyeongnam,jeju,jeolla,location2;
    String city,url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seoul=(Button)findViewById(R.id.seoul);
        incheon=(Button)findViewById(R.id.incheon);
        gangwon=(Button)findViewById(R.id.gangwon);
        daejon=(Button)findViewById(R.id.daejon);
        gyeongnam=(Button)findViewById(R.id.gyeongnam);
        jeju=(Button)findViewById(R.id.jeju);
        jeolla=(Button)findViewById(R.id.jeolla);
        location2=(Button)findViewById(R.id.location2);

        seoul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="서울";
                url = "http://soomokone.dothome.co.kr/seoul.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        incheon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="경기/인천";
                url = "http://soomokone.dothome.co.kr/incheon.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        gangwon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="강원";
                url = "http://soomokone.dothome.co.kr/gangwon.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        daejon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="충청/대전";
                url = "http://soomokone.dothome.co.kr/daejeon.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        gyeongnam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="경상";
                url = "http://soomokone.dothome.co.kr/gyeongsang.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        jeju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="제주";
                url = "http://soomokone.dothome.co.kr/jeju.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });

        jeolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ListViewActivity.class );
                city="전라";
                url = "http://soomokone.dothome.co.kr/jeonra.php";
                intent.putExtra("city",city);
                intent.putExtra("url",url);
                startActivity(intent);//activity 실행
            }
        });


        Button Button = (Button) findViewById(R.id.navi);
        Button.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),mapActivity.class);
                startActivity(intent);
            }


        });


    Button = (Button) findViewById(R.id.search);
        Button.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), searchActivity.class);
                startActivity(intent);
            }


        });


        Button = (Button) findViewById(R.id.weather);
        Button.setOnClickListener(new View.OnClickListener() {

            //@Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), weatheractivity.class);
                startActivity(intent);
            }


        });
/**
 * 가로 슬라이드 뷰 Fragment
 */

        //ViewPager2
        mPager = findViewById(R.id.viewpager);
        //Adapter
        pagerAdapter = new MyAdapter(this, num_page);
        mPager.setAdapter(pagerAdapter);
        //Indicator
        mIndicator = findViewById(R.id.indicator);
        mIndicator.setViewPager(mPager);
        mIndicator.createIndicators(num_page,0);
        //ViewPager Setting
        mPager.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        /**
         * 이 부분 조정하여 처음 시작하는 이미지 설정.
         * 2000장 생성하였으니 현재위치 1002로 설정하여
         * 좌 우로 슬라이딩 할 수 있게 함. 거의 무한대로
         */

        mPager.setCurrentItem(1000); //시작 지점
        mPager.setOffscreenPageLimit(4); //최대 이미지 수

        mPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                super.onPageScrolled(position, positionOffset, positionOffsetPixels);
                if (positionOffsetPixels == 0) {
                    mPager.setCurrentItem(position);
                }
            }

            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                mIndicator.animatePageSelected(position%num_page);
            }
        });
    }
}



