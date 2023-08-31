package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SubActivity3_1_2 extends AppCompatActivity {

//    String RecommendClothImage;  // 추천 옷 저장 변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub312);

        ImageButton recommend1 = findViewById(R.id.recommend1);
        ImageButton recommend2 = findViewById(R.id.recommend2);
        ImageButton recommend3 = findViewById(R.id.recommend3);
        ImageButton recommend4 = findViewById(R.id.recommend4);
        ImageButton recommend5 = findViewById(R.id.recommend5);
        ImageButton recommend6 = findViewById(R.id.recommend6);
        ImageButton recommend7 = findViewById(R.id.recommend7);
        ImageButton recommend8 = findViewById(R.id.recommend8);

        recommend1.setImageResource(R.drawable.cloth1);
        recommend2.setImageResource(R.drawable.cloth2);
        recommend3.setImageResource(R.drawable.cloth3);
        recommend4.setImageResource(R.drawable.cloth4);
        recommend5.setImageResource(R.drawable.cloth5);
        recommend6.setImageResource(R.drawable.cloth6);
        recommend7.setImageResource(R.drawable.cloth7);
        recommend8.setImageResource(R.drawable.cloth8);

        // SubActivity3의 유저 이미지 불러와서 넘김
        Intent intent = getIntent();
        String UserImagePath = intent.getStringExtra("UserImage").toString();

        recommend1.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);

                startActivity(intent);

            }
        });
        recommend2.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend3.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend4.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend5.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend6.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend7.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });
        recommend8.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
//                // image를 string으로 변환
//                // 현빈 구현 part
//
                // 추천 옷 3_1로 넘김
                String RecommendClothImage = "Recommend Cloth Image";
                intent.putExtra("ClothImage", RecommendClothImage);
                startActivity(intent);

            }
        });

    }
}