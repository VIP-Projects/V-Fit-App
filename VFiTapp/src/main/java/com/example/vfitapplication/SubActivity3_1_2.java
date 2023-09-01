package com.example.vfitapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

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

import android.os.Handler;

public class SubActivity3_1_2 extends AppCompatActivity {

    private static final String url1 = "http://10.0.2.2:5000/hello";
    String userimage;
    String clothimage;
    Bitmap imgBitmap;
    String resultimage = "";

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
        userimage = intent.getStringExtra("UserImage").toString();

        recommend1.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth1);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);
            }
        });
        recommend2.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth2);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend3.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth3);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend4.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth4);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend5.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth5);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend6.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth6);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend7.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth7);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });
        recommend8.setOnClickListener(new View.OnClickListener() {    // 다음페이지로 넘어가는 버튼
            @Override
            public void onClick(View view) {
                // 추천 옷 3_1로 넘김
                imgBitmap = BitmapFactory.decodeResource(getApplicationContext().getResources(), R.drawable.cloth8);
                ByteArrayOutputStream stream = new ByteArrayOutputStream();
                imgBitmap.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                byte[] byteArray = stream.toByteArray();
                clothimage = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                Log.v("hello", "hello : " + 1);
                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 유저 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
//                intent.putExtra("resultImage", resultimage);  // 유저 이미지
//                startActivity(intent);

            }
        });

    }

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
                    OkHttpClient client = new OkHttpClient.Builder()
                            .connectTimeout(100, TimeUnit.SECONDS)
                            .writeTimeout(100, TimeUnit.SECONDS)
                            .readTimeout(100, TimeUnit.SECONDS)
                            .callTimeout(100, TimeUnit.SECONDS)
                            .build();
                    JSONObject jsonInput = new JSONObject();
                    jsonInput.put("image1",  userimage);
                    jsonInput.put("image2",  clothimage);

                    RequestBody reqBody = RequestBody.create(
                            MediaType.parse("application/json; charset=utf-8"),
                            jsonInput.toString()
                    );

                    Request request = new Request.Builder()
                            .post(reqBody)
                            .url(url1)
                            .build();

                    Response responses = null;
                    responses = client.newCall(request).execute();
                    String final_result = "";
                    final_result = responses.body().string();
                    JSONObject results = new JSONObject(final_result);
                    //Log.v("hello", "hello : " + results.getString("data"));
//                    byte[] encodeByte = android.util.Base64.decode(results.getString("data"), android.util.Base64.DEFAULT);
//                    Bitmap result_bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
//                    runOnUiThread(new Runnable(){
//                        @Override
//                        public void run(){
//                            imView.setImageBitmap(result_bitmap);
//                        }
//                    });
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