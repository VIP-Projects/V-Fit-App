package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity4_2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4_2);

        ImageView imageView = (ImageView) findViewById(R.id.changeHair);
        TextView textNeutral = (TextView) findViewById(R.id.textNeutral);
        TextView textTarget = (TextView) findViewById(R.id.textTarget);
        TextView textMani = (TextView) findViewById(R.id.textMani);
        ImageButton btn2first = (ImageButton) findViewById(R.id.btn2first);
        Intent intent = getIntent();

        imageView.setImageResource(R.drawable.suzi);
        textNeutral.setText(intent.getStringExtra("Neutral").toString());
        textTarget.setText(intent.getStringExtra("Target").toString());
        textMani.setText(intent.getStringExtra("Manipulation").toString());

        btn2first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), SubActivity2.class);
                startActivity(intent);
            }
        });
    }
}