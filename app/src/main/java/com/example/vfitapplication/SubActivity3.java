package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.ContentResolver;
import android.database.Cursor;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.provider.MediaStore;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class SubActivity3 extends AppCompatActivity {

    Bitmap imgBitmap;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub3);

        Button useruploadbtn = findViewById(R.id.userupload);   // 사용자 이미지 업로드 버튼
        ImageButton nextbtn1 = findViewById(R.id.nextbtn1);     // 다음 페이지로 넘어가는 버튼

         // 사용자 이미지 업로드 클릭 시 갤러리 이동
        useruploadbtn.setOnClickListener(new View.OnClickListener() {  
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });


        // 다음페이지로 넘어가는 버튼
        nextbtn1.setOnClickListener(new View.OnClickListener() {    
            @Override
            public void onClick(View view) {

                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                String userimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1.class);
                intent.putExtra("UserImage", userimage);

                startActivity(intent);

            }
        });
    }

    // 갤러리에서 이미지 경로 받아오는 함수 (참고: https://o-s-z.tistory.com/60)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView userpath = findViewById(R.id.userpath);
        if (requestCode==1) {
                if (resultCode == RESULT_OK) {
                    Uri uri = data.getData();
                    try{
                        ContentResolver resolver = getContentResolver();
                        InputStream instream = resolver.openInputStream(uri);
                        imgBitmap = BitmapFactory.decodeStream(instream);    // 갤러리에서 받아온 이미지 비트맵으로 변환
                        instream.close();   // 스트림 닫아주기
                        userpath.setText("Successful Upload of File");     // 현재 페이지에 갤러리 업로드 상태 메시지 출력
                    } catch (Exception e){
                        userpath.setText("Failed to Upload File");
                    }
                }

        }
    }

}

