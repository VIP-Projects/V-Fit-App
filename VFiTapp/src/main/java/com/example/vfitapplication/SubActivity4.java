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

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;


public class SubActivity4 extends AppCompatActivity {
    String userimage;  // 유저 이미지 저장 변수
    Bitmap imgBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4);

        Button useruploadbtn = findViewById(R.id.userupload);   // 사용자 이미지 업로드 버튼
        ImageButton nextbtn3 = findViewById(R.id.nextbtn3);     // 다음페이지로 넘어가는 버튼


        useruploadbtn.setOnClickListener(new View.OnClickListener() {   // 사용자 이미지 업로드 클릭 시 갤러리 이동
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });

        nextbtn3.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                userimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity4_1.class);
                intent.putExtra("UserImage", userimage);
                startActivity(intent);

            }
        });
    }

    // 갤러리에서 이미지 경로 받아오는 함수
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
                    imgBitmap = BitmapFactory.decodeStream(instream);
                    instream.close();   // 스트림 닫아주기

                    //UserImagePath = getRealPathFromURI(uri);     // imagePath에 string으로 경로 저장

                    userpath.setText("Successful Upload of File");
                } catch (Exception e){
                    userpath.setText("Failed to Upload file");
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