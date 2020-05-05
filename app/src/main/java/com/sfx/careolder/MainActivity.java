package com.sfx.careolder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    private Button mBtnGps;
    private Button btnsetHome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnGps=findViewById(R.id.btnGps);
        btnsetHome = findViewById(R.id.setHome);
        mBtnGps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, Gps.class);
                startActivity(intent);
                //Toast.makeText(MainActivity.this,"进入回家页面",Toast.LENGTH_SHORT);
            }
        });
        btnsetHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, LocationManager.class);
                startActivity(intent);
            }
        });
    }
}

