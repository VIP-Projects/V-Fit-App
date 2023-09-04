# V-Fit-App

#### 2023년 공개SW 개발자대회 - [V FiT] 김준용, 길다영, 황현빈

<br>

## 데모 영상

의상 피팅 | 추천 의상 피팅 | 헤어 피팅
--|--|--
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/389ba37d-7f37-467e-a35c-8bc055414f65" style="width:300px"> | <img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/bff31248-aef5-40a4-b8dc-050f5749702a" style="width:300px">|<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/9539fe8a-edfb-4984-9c73-a65ec43ef3d5" style="width:300px">

<br>

## 앱 구성

File Type | files
--|--
javafile.java | MainActivity → SubActivity2 → … → SubActivity3_1 → SubActivity3_1_1  → … 
layout.xml | activity_main → activity_sub2 → … → activity_sub31 → activity_sub311  → … 

<p align="center">
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/3c10f207-6c12-44fe-98e3-224c8dd3461a" style="width:600px"></p>


<br>

## 시스템 구성

<p align="center">
<img src="https://github.com/VIP-Projects/V-Fit-App/assets/53934639/7bccd6fc-4c68-42cf-97b4-bf53d83e476f" style="width:600px"></p>

### 의상 피팅 방법 : 옷 마스크 추출 → 모델 Pose, Segmentation → 추론

-	Virtual Fitting model : Pose Estimation(0pen Pose - pose_iter_440000.caffemodel)
-	Fashion Mask Extraction Model : U2Net Model
-	Human Segmentation Mask Model : ACGPN Model


### 헤어 피팅 방법 : 
