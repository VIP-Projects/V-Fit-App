# V-Fit-App

#### 2023년 공개SW 개발자대회 - [V FiT] 김준용, 길다영, 황현빈

<br><br>

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

#### 헤어 피팅 방법 : 
-
- 종류
  
  Types of hair fitting | hairs
  -- | --
  헤어스타일 | fringle hair(앞머리), short hair(짧은 머리), lonb hair(긴 머리), straignt hair(생머리), culry hairstyle(곱슬머리) <br> afri hairstyle(크고 둥글게 만든 곱슬머리), hi-top fade hair(정수리의 머리카락을 길게 기르고 옆머리를 매우 짧게 이발), mohawk hairstyle(정수리를 중심으로 정가운데만 곧게 뻗치게 하고 양옆은 삭발), bald(대머리)
  헤어 컬러 | blond, red, blue, white, black, grey
