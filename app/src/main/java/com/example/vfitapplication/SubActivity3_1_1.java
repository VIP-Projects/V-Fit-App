package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class SubActivity3_1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub311);

        Intent intent = getIntent();

        // 이미지 경로 이용해 이미지 가져오는 코드 (참고: https://sharp57dev.tistory.com/22)
        ImageView vfit_result = findViewById(R.id.vfit_result);
        vfit_result.setImageResource(R.drawable.iu_result);

        String resultimage = intent.getStringExtra("resultImage").toString();
        byte[] encodeByte = android.util.Base64.decode(resultimage, android.util.Base64.DEFAULT);
        Bitmap result_bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
        vfit_result.setImageBitmap(result_bitmap);    // 결과 이미지 출력

        // 화면 전체가 다음 페이지로 이동할 수 있는 이미지 버튼
        ImageButton imgbtn = findViewById(R.id.imagebtn2);
        // 화면 어느 곳이든, 클릭 시 다음 페이지로 이동
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}
