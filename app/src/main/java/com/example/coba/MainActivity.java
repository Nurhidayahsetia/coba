package com.example.coba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.coba.Activity2;
import com.example.coba.Activity3;
import com.example.coba.Activity4;
import com.example.coba.Activity5;
import com.example.coba.Activity6;
import com.example.coba.Activity7;

public class MainActivity extends AppCompatActivity {

    ImageView ivsains, ivmatematika, ivbiologi, ivkimia, ivsenibudaya, ivfisika;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivsains = findViewById(R.id.iv_sains);
        ivsains.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity2.class);
                startActivity(intent);
            }
        });

        ivmatematika = findViewById(R.id.iv_matematika);
        ivmatematika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity3.class);
                startActivity(intent);
            }
        });

        ivbiologi = findViewById(R.id.iv_biologi);
        ivbiologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity4.class);
                startActivity(intent);
            }
        });

        ivkimia = findViewById(R.id.iv_kimia);
        ivkimia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity5.class);
                startActivity(intent);
            }
        });

        ivsenibudaya = findViewById(R.id.iv_senibudaya);
        ivsenibudaya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity6.class);
                startActivity(intent);
            }
        });

        ivfisika = findViewById(R.id.iv_fisika);
        ivfisika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Activity7.class);
                startActivity(intent);
            }
        });

    }
}