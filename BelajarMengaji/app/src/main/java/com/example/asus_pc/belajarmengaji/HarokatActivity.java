package com.example.asus_pc.belajarmengaji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class HarokatActivity extends AppCompatActivity {
    ImageButton pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);

        pindah = (ImageButton) findViewById(R.id.Harokat_fathah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this, HarokatFathahActivity.class);
                startActivity(intent);
                finish();
            }
        });
        pindah = (ImageButton) findViewById(R.id.Harokat_kasroh);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this, HarokatKasrohActivity.class);
                startActivity(intent);
                finish();
            }
        });
        pindah = (ImageButton) findViewById(R.id.Harokat_dhomah);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this, HarokatDhomahActivity.class);
                startActivity(intent);
                finish();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatActivity.this, MulaiActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event){
        if (keyCode == KeyEvent.KEYCODE_BACK){
            return true;
        }
        return super.onKeyDown(keyCode,event);
    }
}
