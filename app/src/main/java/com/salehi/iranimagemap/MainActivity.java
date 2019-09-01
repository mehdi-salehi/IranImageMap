package com.salehi.iranimagemap;

import android.os.Bundle;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.salehi.iranimagemap.lib.IranImageMap;
import com.salehi.iranimagemap.lib.ProvinceList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        IranImageMap imageMap = findViewById(R.id.map);
        imageMap.clearAllProvince();
        imageMap.setActiveProvince(ProvinceList.Tehran);
    }

}
