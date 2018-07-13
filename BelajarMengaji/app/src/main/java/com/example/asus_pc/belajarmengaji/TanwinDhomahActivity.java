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

public class TanwinDhomahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_dhomah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popupTanwinDhomah);
        show = (ImageButton)findViewById(R.id.un);
        hide = (ImageButton)findViewById(R.id.bun);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_un);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_bun);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_tun);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsun);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_jun);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_khun);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_khun);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_dun);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dzun);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_run);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_zun);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_sun);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_syun);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_shun);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_dhun);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_thun);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzun);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_un);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_ghun);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fun);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qun);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_kun);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam_lun);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_mun);
        final MediaPlayer suaraN = MediaPlayer.create(this, R.raw.nun_nun);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_wun);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha_hun);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_yun);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.un);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.bun);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.tun);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsun);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.jun);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.ha_khun);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.kho_khun);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.dun);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzun);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.run);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zun);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.sun);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syun);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shun);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhun);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.thun);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzo_dzun);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ain_un);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.gho_ghun);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fun);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qun);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.kun);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.lun);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.mun);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.nun_nun);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wun);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.hun);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.yun);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.alif_un_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                TampilGambar.setImageResource(R.drawable.ba_bun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View c) {
                TampilGambar.setImageResource(R.drawable.ta_tun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View d) {
                TampilGambar.setImageResource(R.drawable.tsa_tsun_dommah_tanwin_1);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View e) {
                TampilGambar.setImageResource(R.drawable.jim_jun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View f) {
                TampilGambar.setImageResource(R.drawable.ha_khun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View g) {
                TampilGambar.setImageResource(R.drawable.kho_khun_dommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View h) {
                TampilGambar.setImageResource(R.drawable.dal_dun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzal_dzun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ro_run_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zai_zun_dommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sin_sun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syin_syun_dommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shod_shun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhod_dhun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_thun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo_dzun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ain_un_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.gho_ghun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa_fun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });

        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qof_qun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.kaf_kun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.lam_lun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mim_mun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraN.start();
                TampilGambar.setImageResource(R.drawable.nun_nun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wa_wun_dommah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_hun_dhommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya_yun_dommah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();


            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(TanwinDhomahActivity.this, TanwinActivity.class);
                startActivity(intent);
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
