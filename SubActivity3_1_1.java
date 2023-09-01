package com.example.vfit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SubActivity3_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub311);


        // 이미지 경로 이용해 이미지 가져오는 코드 참고 : https://sharp57dev.tistory.com/22
        ImageView vfit_result = findViewById(R.id.vfit_result);
        vfit_result.setImageResource(R.drawable.iu_result);

        ImageButton imgbtn = findViewById(R.id.imagebtn2);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}