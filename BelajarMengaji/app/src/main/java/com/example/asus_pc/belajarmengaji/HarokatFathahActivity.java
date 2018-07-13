package com.example.asus_pc.belajarmengaji;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

public class HarokatFathahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.popupFathah);
        show = (ImageButton)findViewById(R.id.a);
        hide = (ImageButton)findViewById(R.id.ba1);

        final Animation animScale = AnimationUtils.loadAnimation(this,R.anim.anim_scale);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.VISIBLE);
            }
        });
        hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setVisibility(View.INVISIBLE);
            }
        });
        //menambahkan suara
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_a);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_ba);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_ta);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsa);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_ja);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_kha_kha);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_kho);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_da);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dza);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_ra);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_za);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_sa);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_sya);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_sho);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_do);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_tho);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzo);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_a);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_gho);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fa);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qo);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_ka);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_ma);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun_na);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_wa);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha_ha);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_ya);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.a);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.ba1);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.ta1);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsa1);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.ja);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.kha1);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.kho1);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.da);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dza);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.ra1);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.za);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.sa);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.sya);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.sho);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dho);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.tho1);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzo1);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ak);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.gho);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fa1);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qo);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.ka);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.la);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.ma);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.na);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wa);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.ha);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.ya1);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.a);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ba);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ta);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsa);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ja);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kha);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kho);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.da);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dza);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ra);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.za);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sa);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sya);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.sho);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dho);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_fathah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ak);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.gho);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qo);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.ka);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.la);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.ma);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.na);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wa);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setImageResource(R.drawable.ha);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatFathahActivity.this, HarokatActivity.class);
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
