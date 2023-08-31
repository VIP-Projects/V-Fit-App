package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.ContentResolver;
import android.database.Cursor;
import android.content.Intent;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.provider.MediaStore;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class SubActivity3_1 extends AppCompatActivity {

    String clothimagePath;  // 갤러리에 있는 옷 저장 변수
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub31);

        Button clothrecommend = findViewById(R.id.recommend);   // 의상 이미지 업로드 버튼
        Button clothuploadbtn = findViewById(R.id.clothupload);   // 의상 이미지 업로드 버튼
        ImageButton nextbtn2 = findViewById(R.id.nextbtn2);

        // SubActivity3의 유저 이미지 불러와서 넘김
        Intent intent = getIntent();
        String UserImagePath = intent.getStringExtra("UserImage").toString();

        clothuploadbtn.setOnClickListener(new View.OnClickListener() {   // 의상 이미지 업로드 클릭 시 갤러리 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });

        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
                intent.putExtra("ClothImage", clothimagePath);  // 갤러리의 옷 이미지
                startActivity(intent);
            }
        });

        clothrecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_2.class);
                intent.putExtra("UserImage", UserImagePath);  // 유저 이미지
                startActivity(intent);
            }
        });
    }
    // 갤러리에서 이미지 경로 받아오는 함수
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView clothpath = findViewById(R.id.clothpath);

        if (requestCode==1) {
            if (resultCode == RESULT_OK) {
                Uri uri = data.getData();
                try{
                    ContentResolver resolver = getContentResolver();
                    InputStream instream = resolver.openInputStream(uri);
                    Bitmap imgBitmap = BitmapFactory.decodeStream(instream);
                    instream.close();   // 스트림 닫아주기

                    // imagePath에 string으로 경로 저장(확인용)
                    clothimagePath = getRealPathFromURI(uri);

                    // 현재 페이지에 갤러리 업로드 상태 메시지 출력
                    clothpath.setText("Successful Upload of File");
                } catch (Exception e){
                    clothpath.setText("Failed to Upload file");
                }
            }

        }
    }

//    갤러리 사진 참고: https://machine-woong.tistory.com/91 / https://jeongchul.tistory.com/287
//    사진 url 띄우기 참고 : https://jjyloves.tistory.com/13 / https://wikidocs.net/99371


    // 이미지의 절대 경로를 구해주는 함수 (참고: https://hhhhhhhong.tistory.com/28)
    private String getRealPathFromURI(Uri contentURI) {
        String result;
        Cursor cursor = getContentResolver().query(contentURI, null, null, null, null);

        if (cursor == null) { // Source is Dropbox or other similar local file path
            result = contentURI.getPath();
        }
        else {
            cursor.moveToFirst();
            int idx = cursor.getColumnIndex(MediaStore.Images.ImageColumns.DATA);
            result = cursor.getString(idx);
            cursor.close();
        }
        return result;
    }
}