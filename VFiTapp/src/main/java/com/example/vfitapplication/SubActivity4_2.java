package com.example.vfitapplication;

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
        setContentView(R.layout.activity_sub42);

        ImageView vfit_hair_result = findViewById(R.id.vfit_hair_result);
        TextView textNeutral = findViewById(R.id.textNeutral);
        TextView textTarget =  findViewById(R.id.textTarget);
        TextView textMani = findViewById(R.id.textMani);
        ImageButton btn2first = findViewById(R.id.btn2first);
        Intent intent = getIntent();

        vfit_hair_result.setImageResource(R.drawable.iu_hair);
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