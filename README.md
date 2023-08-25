# V-Fit-App



## File Path

- <b>javafile</b> : VFiTapp/src/main/java/com/example/vfitapplication
- <b>layout</b> : VFiTapp/src/main/res/layout
- <b>img 저장 경로</b> : VFiTapp/src/main/res/drawable <br>

※ 가상피팅 결과물은 ./res/drawble 디렉토리에 저장해야 함.
※ 옷 결과물은 ./res/drawble 디렉토리에 저장해야 함.
  
<br>

## File 설명

### 1) 사용자 이미지 업로드
> <b>javafile - layout</b> <br>
> SubActivity3 - activity_sub3.xml <br>
> SubActivity3_1 - activity_sub31.xml <br>
> SubActivity4 - activity_sub4.xml

<br>

- <b>userimagePatch</b> : string으로 디바이스 내 이미지 절대 경로 저장. <br>
- <b>userpath</b> : 화면에 경로 나타내기 위해 사용되는 변수. <br>

```
# .java file

// 갤러리에서 이미지 경로 받아오는 함수
  @Override
  protected void onActivityResult(int requestCode, int resultCode, Intent data) {
      super.onActivityResult(requestCode, resultCode, data);
      TextView userpath = findViewById(R.id.userpath);
      switch(requestCode) {
          case 1:
              if (resultCode == RESULT_OK) {
                  Uri uri = data.getData();
                  String userimagePath = getRealPathFromURI(uri);     // imagePath에 string으로 경로 저장
                  userpath.setText(userimagePath);              // textview에 경로 나타냄
              }
              break;
      }
  }
```

### 2) 가상 피팅 결과 제시
> <b>javafile - layout</b> <br>
> SubActivity3_1_1 - activity_sub311.xml <br>
> SubActivity4_2 - activity_sub42.xml

<br>

- <b>vfit_result</b> : 화면에 결과 띄우기 위해 사용되는 변수. <br>
- <b>R.drawable.iu_result</b> : 저장된 가상피팅 이미지를 가져오는 변수로, ./res/drawble 에 저장된 이미지 이름을 가져오면 된다. <br>

※ 가상피팅 결과물은 ./res/drawble 디렉토리에 저장해야 함.


```
# .java file

// 이미지 경로 이용해 이미지 가져오는 코드 참고 : https://sharp57dev.tistory.com/22
ImageView vfit_result = findViewById(R.id.vfit_result);
vfit_result.setImageResource(R.drawable.iu_result);    # (ex. R.drawable.cloth_result, R.drawable.hair_result..) 
```

### 3) 옷 추천
> <b>javafile - layout</b> <br>
> SubActivity3_1_2 - activity_sub312.xml <br>

<br>

- <b>recommend~</b> : 화면에 결과 띄우기 위해 사용되는 변수로, 클릭 시 결과 화면으로 이동. <br>
- <b>R.drawable.cloth</b> : 저장된 옷 추천 이미지를 가져오는 변수로, ./res/drawble 에 저장된 이미지 이름을 가져오면 된다. <br>

※ 옷 결과물은 ./res/drawble 디렉토리에 저장해야 함.


```
# .java file

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
recommend6.setImageResource(R.drawable.cloth2);
recommend7.setImageResource(R.drawable.cloth3);
recommend8.setImageResource(R.drawable.cloth4);
```


<br>

## Layout
MainActivity → SubActivity2 → … → SubActivity3_1 → SubActivity3_1_1  → …

<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/3c10f207-6c12-44fe-98e3-224c8dd3461a" style="width:600px">

<br>


