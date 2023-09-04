package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SubActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        
        Button clothbtn = findViewById(R.id.clothbtn);    // 의상 피팅 버튼
        Button hairbtn = findViewById(R.id.hairbtn);      // 헤어 피팅 버튼

        // 의상 피팅 버튼 클릭 시 이동
        clothbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3.class);
                startActivity(intent);
            }
        });

        // 헤어 피팅 버튼 클릭 시 이동
        hairbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity4.class);
                startActivity(intent);
            }
        });
    }
}
