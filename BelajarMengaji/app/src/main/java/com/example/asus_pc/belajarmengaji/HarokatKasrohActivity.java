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

public class HarokatKasrohActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_kasroh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.popupKasroh);
        show = (ImageButton)findViewById(R.id.i);
        hide = (ImageButton)findViewById(R.id.bi);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_i);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_bi);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_ti);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsi);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_ji);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_khi);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_khi);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_di);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dzi);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_ri);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_zi);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_si);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_syi);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_shi);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_dhi);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_thi);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzi);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_i);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_ghi);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fi);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qi);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_ki);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam_li);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_mi);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun_ni);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_wi);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha_hi);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_yi);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.i);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.bi);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.ti);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsi);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.ji);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.khi);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.khik);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.di);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzi);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.ri);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zi);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.si);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syi);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shi);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhi);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.thi);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzik);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ik);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.ghi);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fi);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qi);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.ki);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.li);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.mi);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.ni);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wi);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.hi);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.yi);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.i_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.bi);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ti);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsi_1);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ji);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.khi);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.khik);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.di);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzi);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ri);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zi);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.si);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syi);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.thi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzik);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ik);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.ghi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fi);
                TampilGambar.startAnimation(animScale);
            }
        });

        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.ki);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.li);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.ni);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wi);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.hi);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.yi);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatKasrohActivity.this, HarokatActivity.class);
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
