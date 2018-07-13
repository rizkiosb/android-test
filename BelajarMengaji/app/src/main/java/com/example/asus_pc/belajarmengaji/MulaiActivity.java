package com.example.asus_pc.belajarmengaji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class MulaiActivity extends AppCompatActivity {
    ImageButton hijaiyah,harokat,tanwin,pindah,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mulai);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        final MediaPlayer suaraButton = MediaPlayer.create(this, R.raw.button);

        hijaiyah =findViewById(R.id.buttonHijaiyah);
        hijaiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, HijaiyahActivity.class);
                startActivity(intent);
                finish();
            }
        });
        harokat =findViewById(R.id.buttonHarokat);
        harokat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, HarokatActivity.class);
                startActivity(intent);
                finish();
            }
        });
        tanwin =findViewById(R.id.buttonTanwin);
        tanwin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, TanwinActivity.class);
                startActivity(intent);
                finish();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(MulaiActivity.this, MainActivity.class);
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
