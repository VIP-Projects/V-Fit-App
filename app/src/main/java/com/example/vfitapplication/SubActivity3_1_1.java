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
//        TextView textUserImage = findViewById(R.id.textUserImage);  // 유저 이미지
//        TextView textCloth =  findViewById(R.id.textCloth);  // 옷 이미지
        Intent intent = getIntent();

        // 이미지 경로 이용해 이미지 가져오는 코드 참고 : https://sharp57dev.tistory.com/22
        ImageView vfit_result = findViewById(R.id.vfit_result);
        vfit_result.setImageResource(R.drawable.iu_result);

        //textUserImage.setText(intent.getStringExtra("UserImage").toString());
        //textCloth.setText(intent.getStringExtra("ClothImage").toString());
        String resultimage = intent.getStringExtra("resultImage").toString();
        byte[] encodeByte = android.util.Base64.decode(resultimage, android.util.Base64.DEFAULT);
        Bitmap result_bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
        vfit_result.setImageBitmap(result_bitmap);

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