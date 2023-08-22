package com.example.vfitapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity4_1 extends AppCompatActivity {
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


        // HairStyle text
        fringebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with fringe hair";
                String mani_fringe = "Manipulation_Strength: 4.1";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        shortbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with short hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        longbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with long hair";
                String mani_fringe = "Manipulation_Strength: 4.1";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        straightbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with straight hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        curlybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with curly hairstyle";
                String mani_fringe = "Manipulation_Strength: 4.1";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        afrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with afro hairstyle";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        hitopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with hi-top fade hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        mohawkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with mohawk hairstyle";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        baldbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with bald";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });

        // HairColor text
        blondbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with blonde hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        redbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with red hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        bluebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with blue hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        whitebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with white hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        blackbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with black hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
        greybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String neutral_fringe = "Neutral: face with hair";
                String target_fringe = "Target: face with grey hair";
                String mani_fringe = "Manipulation_Strength: 7.5";
                Intent intent = new Intent(getApplicationContext(), SubActivity4_2.class);
                intent.putExtra("Neutral", neutral_fringe);
                intent.putExtra("Target", target_fringe);
                intent.putExtra("Manipulation", mani_fringe);
                startActivity(intent);
            }
        });
    }
}
