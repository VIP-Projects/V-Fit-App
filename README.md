![cloth_fit](https://github.com/VIP-Projects/V-Fit-App/assets/53934639/ddd90ea7-5d5a-4ca2-a68d-9fbbe044df28)![recommend_fit](https://github.com/VIP-Projects/V-Fit-App/assets/53934639/6028f8f4-7cc6-43ca-8c3d-a4b6f15f845d)![hair_fit-min](https://github.com/VIP-Projects/V-Fit-App/assets/53934639/7d4f2e18-c221-4dcc-ae30-5ff418971072)# V Fit : 멀티모달 생성형 AI 기반 가상 피팅 앱서비스
### 앱 서비스 관련 Repository

<br>

#### 2023년 공개SW 개발자대회 - [V FiT] 김준용, 길다영, 황현빈

본 프로젝트에서는 사용자가 비용을 지불하기 전에 스타일을 확인하여 소요 시간과 비용을 절약하고 만족도를 높일 수 있는 의상 및 헤어 가상 피팅 서비스를 제공한다.

<br>

## 데모 영상

의상 피팅 | 추천 의상 피팅 | 헤어 피팅
--|--|--
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/389ba37d-7f37-467e-a35c-8bc055414f65" style="width:300px"> | <img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/e1e87022-70ae-44ac-b135-1df309f41b91" style="width:300px">|<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/9539fe8a-edfb-4984-9c73-a65ec43ef3d5" style="width:300px">




<br><br>

## 어플리케이션 구현 방법

#### 구현 기능
- 사용자가 애플리케이션을 통해 가상 피팅 기능을 사용, 원하는 의상 및 헤어를 피팅하여 결과를 확인

#### 구현 내용 
-	의상 피팅 및 헤어 피팅 선택
-	카메라 촬영 및 사진 업로드 (옷, 모델)
-	피팅 할 옷 추천 페이지 
-	헤어 피팅 정보 선택(ex. 빨간 머리, 곱슬 머리 등)
-	사용자 가상 피팅 결과 출력


<br><br>



## 어플리케이션 구성

File Type | files
--|--
<b>javafile.java</b> | MainActivity → SubActivity2 → … → SubActivity3_1 → SubActivity3_1_1  → … 
<b>layout.xml</b> | activity_main → activity_sub2 → … → activity_sub31 → activity_sub311  → … 

<p align="center">
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/e75deef4-4193-44c0-bb22-4688aa068520" style="width:600px"></p>



-	<b> 모델 사진 업로드 페이지(옷 모델) :</b> 의상 피팅을 원하는 사용자의 사진을 업로드
-	<b> 옷 사진 업로드 페이지(갤러리 사용) :</b> 의상 피팅을 원하는 의상 사진을 업로드
-	<b> 옷 추천 페이지 :</b> 만약 원하는 의상이 모호하다면 자체적으로 추천해주는 사진을 선정
-	<b> 모델 사진 업로드 페이지(헤어 모델) :</b> 헤어 피팅을 원하는 사용자의 사진을 업로드
-	<b> 헤어 정보 선택 페이지 :</b> 원하는 헤어 스타일 (ex. 빨간 머리, 곱슬 머리 등)을 선택
-	<b> 결과 페이지 :</b> 의상 피팅 및 헤어 피팅 결과 정보를 사용자에게 전달





<br><br>

## 팀원 역할

팀원|역할
--|--
김준용|팀장, 의상 피팅 모델 구현 및 적용, 애플리케이션 UI제작
길다영|팀원, 헤어 피팅 모델 구현 및 적용, 애플리케이션 UI제작
황현빈|팀원, 크롤링 수행, 서버 구현, 애플리케이션 통신


