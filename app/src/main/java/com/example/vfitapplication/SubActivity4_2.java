package com.example.vfitapplication;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity4_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub42);

        ImageView vfit_hair_result = findViewById(R.id.vfit_hair_result);    // 헤어 피팅 결과 출력
        ImageButton btn2first = findViewById(R.id.btn2first);                // 화면 전체가 다음 페이지로 이동할 수 있는 이미지 버튼
        Intent intent = getIntent();

        vfit_hair_result.setImageResource(R.drawable.iu_hair);

        String resultimage = intent.getStringExtra("resultImage").toString();
        byte[] encodeByte = android.util.Base64.decode(resultimage, android.util.Base64.DEFAULT);
        Bitmap result_bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
        vfit_hair_result.setImageBitmap(result_bitmap);

        // 화면 어느 곳이든, 클릭 시 다음 페이지로 이동
        btn2first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}
