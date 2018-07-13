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

public class HijaiyahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hijaiyah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.popup);
        show = (ImageButton)findViewById(R.id.alif);
        hide = (ImageButton)findViewById(R.id.ba);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.allif);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_kha);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha);
        final MediaPlayer suaraLam_alif = MediaPlayer.create(this, R.raw.lam_alif);
        final MediaPlayer suaraHamzah = MediaPlayer.create(this, R.raw.hamzah);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.alif);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.ba);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.ta);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsa);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.jim);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.kha);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.kho);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.dal);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzal);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.ra);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zai);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.sin);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syin);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shod);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhod);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.tho);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzo);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ain);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.ghoin);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fa);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qof);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.kaf);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.lam);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.mim);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.nun);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wawu);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.ha);
        ImageButton butonSuara28 = (ImageButton)this.findViewById(R.id.lam_alif);
        ImageButton butonSuara29 = (ImageButton)this.findViewById(R.id.hamzah);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.ya);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.alif_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ba_2);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ta_2);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsa_2);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.jim_2);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kha_2);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kho_2);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dal_2);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzal_2);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ra_2);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zai_2);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sin_2);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syin_2);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shod_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhod_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ain_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.ghoin_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa_hijaiyah);
                TampilGambar.startAnimation(animScale);
            }
        });

        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qof_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.kaf_2);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.lam_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mim_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.nun_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wawu_2);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setImageResource(R.drawable.ha_2);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });
        butonSuara28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.lam_alif);
                TampilGambar.startAnimation(animScale);
                suaraLam_alif.start();
            }
        });
        butonSuara29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.hamzah_2);
                TampilGambar.startAnimation(animScale);
                suaraHamzah.start();
            }
        });
        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya_2);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HijaiyahActivity.this, MulaiActivity.class);
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
