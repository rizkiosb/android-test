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

public class HarokatDhomahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_harokat_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.popupDhomah);
        show = (ImageButton)findViewById(R.id.u);
        hide = (ImageButton)findViewById(R.id.bu);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_u);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_bu);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_tu);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsu);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_ju);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_khu);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_khuu);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_du);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dzu);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_ru);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_zu);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_su);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_syu);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_shu);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_dhu);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_thu);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzu);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_u);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_ghu);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fu);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qu);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_ku);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam_lu);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_mu);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun_nu);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_wu);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.hu_hu);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_yuu);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.u);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.bu);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.tu);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsu);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.ju);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.ha_khu);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.kho_khu);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.du);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzu);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.ru);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zu);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.su);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syu);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shu);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhu);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.thu);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzo_dzu);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ain_u);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.gho_ghu);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fu);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qu);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.ku);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.lu);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.mu);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.nu);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wu);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.hu);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.yu);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.alif_u_dhommah_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ba_bu_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();

            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ta_tu_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsa_tsu_dommah_1);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();

            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.jim_ju_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_khu_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kho_khu_dommah);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dal_du_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzal_dzu_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ro_ru_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zai_zu_dommah);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sin_su_dhommah);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syin_syu_dommah);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shod_shu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhod_dhu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_thu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo_dzu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ain_u_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.gho_ghu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa_fu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });

        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qof_qu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.kaf_ku_dhommah);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.lam_lu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mim_mu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.nun_nu_dhommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wa_wu_dommah);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_hu_dhommah_1);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya_yu_dommah);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();


            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(HarokatDhomahActivity.this, HarokatActivity.class);
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
