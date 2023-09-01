package com.example.vfit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

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

public class SubActivity3_1 extends AppCompatActivity {

    private static final String url1 = "http://10.0.2.2:5000/hello";
    ImageView imView;
    Bitmap bmImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub31);

        Button clothrecommend = findViewById(R.id.recommend);   // 의상 이미지 업로드 버튼
        Button clothuploadbtn = findViewById(R.id.clothupload);   // 의상 이미지 업로드 버튼
        ImageButton nextbtn2 = findViewById(R.id.nextbtn2);
        imView = (ImageView)findViewById(R.id.imageView);

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
                //Intent intent = new Intent(getApplicationContext(), SubActivity3_1_1.class);
                //startActivity(intent);
                sendServer();
            }
        });

        clothrecommend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity3_1_2.class);
                startActivity(intent);
            }
        });
    }
    // 갤러리에서 이미지 경로 받아오는 함수
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView clothpath = findViewById(R.id.clothpath);
        switch(requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    Uri uri = data.getData();
                    String clothimagePath = getRealPathFromURI(uri);     // imagePath에 string으로 경로 저장
                    clothpath.setText(clothimagePath);              // textview에 경로 나타냄
                }
                break;
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
                    Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.img6, null);
                    bmImg = ((BitmapDrawable)drawable).getBitmap();
                    ByteArrayOutputStream stream = new ByteArrayOutputStream();
                    bmImg.compress(Bitmap.CompressFormat.JPEG, 100, stream);
                    byte[] byteArray = stream.toByteArray();
                    String img1 = android.util.Base64.encodeToString(byteArray, android.util.Base64.DEFAULT);

                    Drawable drawable2 = ResourcesCompat.getDrawable(getResources(), R.drawable.iu, null);
                    bmImg = ((BitmapDrawable)drawable2).getBitmap();
                    ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
                    bmImg.compress(Bitmap.CompressFormat.JPEG, 100, stream2);
                    byte[] byteArray2 = stream2.toByteArray();
                    String img2 = android.util.Base64.encodeToString(byteArray2, android.util.Base64.DEFAULT);

                    OkHttpClient client = new OkHttpClient.Builder()
                            .connectTimeout(100, TimeUnit.SECONDS)
                            .writeTimeout(100, TimeUnit.SECONDS)
                            .readTimeout(100, TimeUnit.SECONDS)
                            .callTimeout(100, TimeUnit.SECONDS)
                            .build();
                    JSONObject jsonInput = new JSONObject();
                    jsonInput.put("image1",  img1);
                    jsonInput.put("image2",  img2);

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
                    byte[] encodeByte = android.util.Base64.decode(results.getString("data"), android.util.Base64.DEFAULT);
                    Bitmap result_bitmap = BitmapFactory.decodeByteArray(encodeByte, 0, encodeByte.length);
                    runOnUiThread(new Runnable(){
                        @Override
                        public void run(){
                            imView.setImageBitmap(result_bitmap);
                        }
                    });

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