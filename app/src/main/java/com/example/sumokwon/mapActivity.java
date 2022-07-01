package com.example.sumokwon;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.location.Location;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.naver.maps.map.LocationTrackingMode;
import com.naver.maps.map.MapView;
import com.naver.maps.map.NaverMap;
import com.naver.maps.map.OnMapReadyCallback;
import com.naver.maps.map.UiSettings;
import com.naver.maps.map.util.FusedLocationSource;

public class mapActivity extends AppCompatActivity implements OnMapReadyCallback {
    private MapView mapView;
    private NaverMap naverMap;
    private Double lat,lon;
    private FusedLocationSource locationSource;
    private static final int LOCATION_PERMISSION_REQUEST_CODE =1000;
    private static final String[] PERMESSIONS= {
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);

        naverMapBasicSettings();

        locationSource=
                new FusedLocationSource(this, LOCATION_PERMISSION_REQUEST_CODE);
    }

    public void naverMapBasicSettings() {
        mapView.getMapAsync(this);
    }
    @Override
    public void onRequestPermissionsResult(int requestCode,@NonNull String[] permissions, @NonNull int[] grantResults){
        if(locationSource.onRequestPermissionsResult(requestCode,permissions,grantResults)) {
            if (!locationSource.isActivated()) {
                naverMap.setLocationTrackingMode(LocationTrackingMode.None);
                return;
            } else {
                naverMap.setLocationTrackingMode(LocationTrackingMode.Follow);
            }
        }
        super.onRequestPermissionsResult(requestCode,permissions,grantResults);
    }


    @Override
    public void onMapReady(@NonNull final NaverMap naverMap) {

        this.naverMap=naverMap;
        naverMap.setLocationSource(locationSource); //현재위치
        ActivityCompat.requestPermissions(this,PERMESSIONS,LOCATION_PERMISSION_REQUEST_CODE);




            }
}