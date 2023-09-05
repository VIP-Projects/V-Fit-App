# V Fit : 멀티모달 생성형 AI 기반 가상 피팅 앱서비스
### 앱 서비스 관련 Repository

<br>

#### 2023년 공개SW 개발자대회 - [V FiT] 김준용, 길다영, 황현빈

본 프로젝트에서는 사용자가 비용을 지불하기 전에 스타일을 확인하여 소요 시간과 비용을 절약하고 만족도를 높일 수 있는 의상 및 헤어 가상 피팅 서비스를 제공한다.

<br>

## 데모 영상

의상 피팅 | 추천 의상 피팅 | 헤어 피팅
--|--|--
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/389ba37d-7f37-467e-a35c-8bc055414f65" style="width:300px"> | <img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/bff31248-aef5-40a4-b8dc-050f5749702a" style="width:300px">|<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/9539fe8a-edfb-4984-9c73-a65ec43ef3d5" style="width:300px">

<br><br>

## 앱 구성

File Type | files
--|--
<b>javafile.java</b> | MainActivity → SubActivity2 → … → SubActivity3_1 → SubActivity3_1_1  → … 
<b>layout.xml</b> | activity_main → activity_sub2 → … → activity_sub31 → activity_sub311  → … 

<p align="center">
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/3c10f207-6c12-44fe-98e3-224c8dd3461a" style="width:600px"></p>


-	<b> 모델 사진 업로드 페이지(옷 모델) :</b> 의상 피팅을 원하는 사용자의 사진을 업로드
-	<b> 옷 사진 업로드 페이지(갤러리 사용) :</b> 의상 피팅을 원하는 의상 사진을 업로드
-	<b> 옷 추천 페이지 :</b> 만약 원하는 의상이 모호하다면 자체적으로 추천해주는 사진을 선정
-	<b> 모델 사진 업로드 페이지(헤어 모델) :</b> 헤어 피팅을 원하는 사용자의 사진을 업로드
-	<b> 헤어 정보 선택 페이지 :</b> 원하는 헤어 스타일 (ex. 빨간 머리, 곱슬 머리 등)을 선택
-	<b> 결과 페이지 :</b> 의상 피팅 및 헤어 피팅 결과 정보를 사용자에게 전달



<!--
<br><br>

## 시스템 구성

<p align="center">
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/7bccd6fc-4c68-42cf-97b4-bf53d83e476f" style="width:600px"></p>

#### 의상 피팅 방법
- 옷 마스크 추출 → 모델 Pose, Segmentation → 추론
  -	Virtual Fitting model : Pose Estimation(Open Pose - pose_iter_440000.caffemodel)
  -	Fashion Mask Extraction Model : U2Net Model
  -	Human Segmentation Mask Model : ACGPN Model

<br>

#### 헤어 피팅 방법
- 이미지와 헤어 정보 텍스트를 입력 → 멀티모달 수행 → 헤어 합성 이미지 생성
  - cloud API를 통해 StyleCLIP 모델을 사용
  - 헤어스타일 관련 텍스트 정보를 입력으로 받아 사용자 이미지를 변경하는 멀티 모달 수행 
  - manipulation_strength 옵션을 사용하여 스타일 세기 조정
- 종류
  Types of hair fitting | hairs
  -- | --
  헤어스타일 | fringle hair(앞머리), short hair(짧은 머리), lonb hair(긴 머리), straignt hair(생머리),   <br> culry hairstyle(곱슬머리), afri hairstyle(크고 둥글게 만든 곱슬머리), hi-top fade hair(정수리의 머리카락을 길게 기르고 옆머리를 매우 짧게 이발),   <br> mohawk hairstyle(정수리를 중심으로 정가운데만 곧게 뻗치게 하고 양옆은 삭발), bald(대머리)
  헤어 컬러 | blond, red, blue, white, black, grey

<br>

#### 웹 크롤링 방법
- 이미지 데이터 및 상품 정보 데이터 크롤링, 성별 및 카테고리별 분류, 가상 피팅 방법과의 연동 및 추천 옷 이미지 제공
  -	(성별 – 카테고리) 별로 의상 이미지를 무신사 추천순으로 수집
  -	의상 피팅에 적합한 이미지를 선별
  -	사용자 추천 옷 이미지로 사용

-->

<br><br>

## 팀원 역할

팀원|역할
--|--
김준용|팀장, 의상 피팅 모델 구현 및 적용, 애플리케이션 UI제작
길다영|팀원, 헤어 피팅 모델 구현 및 적용, 애플리케이션 UI제작
황현빈|팀원, 크롤링 수행, 서버 구현, 애플리케이션 통신


