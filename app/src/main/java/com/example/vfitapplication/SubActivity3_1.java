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

// 통신 파트
import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import android.graphics.Bitmap;
import android.widget.ImageView;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.core.content.res.ResourcesCompat;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;

public class SubActivity3_1 extends AppCompatActivity {

    private static final String url1 = "http://10.0.2.2:5000/cloth_fit";
    String userimage;  // 갤러리에 있는 유저 저장 변수
    String clothimage;  // 갤러리에 있는 옷 저장 변수
    Bitmap imgBitmap; // 이미지 비트맵화 저장 변수
    String resultimage = ""; // 이미지 텍스트화 저장 변수

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub31);

        Button clothrecommend = findViewById(R.id.recommend);   // 의상 이미지 업로드 버튼
        Button clothuploadbtn = findViewById(R.id.clothupload);   // 의상 이미지 업로드 버튼
        ImageButton nextbtn2 = findViewById(R.id.nextbtn2); // 피팅 수행 후 다음 페이지 이동 버튼

        // SubActivity3의 유저 이미지 불러와서 넘김
        Intent intent = getIntent();
        userimage = intent.getStringExtra("UserImage").toString();

         // 의상 이미지 업로드 클릭 시 갤러리 이동
        clothuploadbtn.setOnClickListener(new View.OnClickListener() {  
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent, 1);
            }
        });
        ProgressDialog customProgressDialog;

        //로딩창 객체 생성
        customProgressDialog = new ProgressDialog(this);
        //로딩창을 투명하게
        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


        nextbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // 로딩창 보여주기
                customProgressDialog.show();
                // 옷 이미지 텍스트화
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);    // 의상 피팅 결과 출력 위해 결과 페이지 불러옴
                // 서버로 데이터 전달 후 결과 이미지 리턴 후 결과 페이지 이동
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 의상 피팅 결과 이미지
                        startActivity(intent);
                    }
                }, 10000);

            }
        });

        clothrecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_2.class);
                intent.putExtra("UserImage", userimage);  // 유저 이미지
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
                    imgBitmap = BitmapFactory.decodeStream(instream);
                    instream.close();   // 스트림 닫아주기
                    clothpath.setText("Successful Upload of File");    // 현재 페이지에 갤러리 업로드 상태 메시지 출력
                } catch (Exception e){
                    clothpath.setText("Failed to Upload file");    // 현재 페이지에 갤러리 업로드 상태 메시지 출력
                }
            }

        }
    }

    // 서버로 사용자 이미지 및 옷 이미지 전달하여 의상 피팅 결과 받아오기
    public void sendServer(){
        class sendData extends AsyncTask<Void, Void, String> {

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }

            @Override
            protected void onProgressUpdate(Void... values) {
                super.onProgressUpdate(values);
            }

            @Override
            protected void onCancelled(String s) {
                super.onCancelled(s);
            }

            @Override
            protected void onCancelled() {
                super.onCancelled();
            }

            @Override
            protected String doInBackground(Void... voids) {

                try {
                    // 통신 객체
                    OkHttpClient client = new OkHttpClient.Builder()
                            .connectTimeout(100, TimeUnit.SECONDS)
                            .writeTimeout(100, TimeUnit.SECONDS)
                            .readTimeout(100, TimeUnit.SECONDS)
                            .callTimeout(100, TimeUnit.SECONDS)
                            .build();
                    // 데이터 json 화
                    JSONObject jsonInput = new JSONObject();
                    jsonInput.put("image1",  userimage);
                    jsonInput.put("image2",  clothimage);
                    // RequestBody에 json 입력
                    RequestBody reqBody = RequestBody.create(
                            MediaType.parse("application/json; charset=utf-8"),
                            jsonInput.toString()
                    );
                    // request 생성
                    Request request = new Request.Builder()
                            .post(reqBody)
                            .url(url1)
                            .build();
                    // 통신 수행 후 결과 리턴
                    Response responses = null;
                    responses = client.newCall(request).execute();
                    String final_result = "";
                    final_result = responses.body().string();
                    JSONObject results = new JSONObject(final_result);
                    resultimage = results.getString("data");
                } catch (JSONException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                return null;
            }
        }
        sendData sendData = new sendData();
        sendData.execute();
    }

}
