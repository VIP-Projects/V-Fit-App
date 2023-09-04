package com.example.vfitapplication;;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

// 가상 피팅 실행 과정 중 나타나는 로딩 창

public class ProgressDialog extends Dialog{
    public ProgressDialog(Context context){
        super(context);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_progress);
    }
}
