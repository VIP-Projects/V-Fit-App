package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity4_1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub4_1);

        // HairStyle button
        Button fringebtn = (Button) findViewById(R.id.fringebtn);
        Button shortbtn = (Button) findViewById(R.id.shortbtn);
        Button longbtn = (Button) findViewById(R.id.longbtn);
        Button straightbtn = (Button) findViewById(R.id.straightbtn);
        Button curlybtn = (Button) findViewById(R.id.curlybtn);
        Button afrobtn = (Button) findViewById(R.id.afrobtn);
        Button hitopbtn = (Button) findViewById(R.id.hitopbtn);
        Button mohawkbtn = (Button) findViewById(R.id.mohawkbtn);
        Button baldbtn = (Button) findViewById(R.id.baldbtn);

        // HairColor button
        Button blondbtn = (Button) findViewById(R.id.blondbtn);
        Button redbtn = (Button) findViewById(R.id.redbtn);
        Button bluebtn = (Button) findViewById(R.id.bluebtn);
        Button whitebtn = (Button) findViewById(R.id.whitebtn);
        Button blackbtn = (Button) findViewById(R.id.blackbtn);
        Button greybtn = (Button) findViewById(R.id.greybtn);

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
