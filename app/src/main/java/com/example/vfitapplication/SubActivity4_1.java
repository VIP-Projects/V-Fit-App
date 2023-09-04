package com.example.vfitapplication;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.graphics.drawable.ColorDrawable;
import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class SubActivity4_1 extends AppCompatActivity {

    private static final String url1 = "http://10.0.2.2:5000/use_hair_fit_model";
    String userimage;
    String neutral_fringe;
    String target_fringe;
    String mani_fringe;
    String resultimage = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub41);

        // HairStyle button
        Button fringebtn = findViewById(R.id.fringebtn);
        Button shortbtn = findViewById(R.id.shortbtn);
        Button longbtn =  findViewById(R.id.longbtn);
        Button straightbtn =  findViewById(R.id.straightbtn);
        Button curlybtn =  findViewById(R.id.curlybtn);
        Button afrobtn =  findViewById(R.id.afrobtn);
        Button hitopbtn =  findViewById(R.id.hitopbtn);
        Button mohawkbtn = findViewById(R.id.mohawkbtn);
        Button baldbtn =  findViewById(R.id.baldbtn);

        // HairColor button
        RadioButton blondbtn = findViewById(R.id.blondbtn);
        RadioButton redbtn =  findViewById(R.id.redbtn);
        RadioButton bluebtn = findViewById(R.id.bluebtn);
        RadioButton whitebtn = findViewById(R.id.whitebtn);
        RadioButton blackbtn = findViewById(R.id.blackbtn);
        RadioButton greybtn = findViewById(R.id.greybtn);

        // SubActivity4의 유저 이미지 불러와서 넘김
        Intent intent = getIntent();
        userimage = intent.getStringExtra("UserImage").toString();  // 유저 이미지

        ProgressDialog customProgressDialog;
        //로딩창 객체 생성
        customProgressDialog = new ProgressDialog(this);
        //로딩창을 투명하게
        customProgressDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


        // HairStyle text
        fringebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                
                neutral_fringe = "face with hair";           // 원래 이미지
                target_fringe = "face with fringe hair";    // 목표 이미지
                mani_fringe = "4.1";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);  // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        shortbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with short hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        longbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with long hair";    // 목표 이미지
                mani_fringe = "4.1";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        straightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with straight hair";// 목표 이미지
                mani_fringe = "7.5";                      // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        curlybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";              // 원래 이미지
                target_fringe = "face with curly hairstyle";    // 목표 이미지
                mani_fringe = "4.1";                            // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        afrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";            // 원래 이미지
                target_fringe = "face with afro hairstyle";    // 목표 이미지
                mani_fringe = "7.5";                            // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        hitopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";                // 원래 이미지
                target_fringe = "face with hi-top fade hair";    // 목표 이미지
                mani_fringe = "7.5";                                // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        mohawkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";                // 원래 이미지
                target_fringe = "face with mohawk hairstyle";    // 목표 이미지
                mani_fringe = "7.5";                            // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        baldbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with bald";        // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });

        // HairColor text
        blondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with blonde hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with red hair";    // 목표 이미지
                mani_fringe = "7.5";                    // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with blue hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        whitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with white hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with black hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
            }
        });
        greybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 로딩창 보여주기
                customProgressDialog.show();
                neutral_fringe = "face with hair";        // 원래 이미지
                target_fringe = "face with grey hair";    // 목표 이미지
                mani_fringe = "7.5";                        // 변환 강도
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);     // 헤어 피팅 결과 출력 위해 결과 페이지 불러옴 

                sendServer();
                new Handler().postDelayed(new Runnable(){
                    @Override
                    public void run(){
                        intent.putExtra("resultImage", resultimage);  // 헤어 피팅 결과 이미지
                        startActivity(intent);
                        Log.v("hello", "hello : " + 2);
                    }
                }, 10000);
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
                    jsonInput.put("neutral",  neutral_fringe);
                    jsonInput.put("target",  target_fringe);
                    jsonInput.put("mani",  mani_fringe);

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
