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

public class TanwinFathahActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_fathah);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        TampilGambar = (ImageView) findViewById(R.id.popupTanwinFathah);
        show = (ImageButton)findViewById(R.id.an);
        hide = (ImageButton)findViewById(R.id.ban);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_an);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_ban);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_tan);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsan);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_jan);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_khan);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_khon);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_dan);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dzan);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_ron);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_zan);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_san);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_syan);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_shon);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_dhon);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_thon);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzon);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_an);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_ghon);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fan);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qon);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_kan);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam_lan);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_man);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun_nan);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_wan);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha_han);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_yan);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.an);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.ban);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.tan);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsan);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.jan);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.khan);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.khon);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.dan);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzan);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.ran);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zan);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.san);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syan);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shon);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhon);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.thon);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzon);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ain_an);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.ghon);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fan);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qon);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.kan);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.lan);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.man);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.nan);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.wan);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.ha_han);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.yan);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.alif_an_fathah_tanwin_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ba_ban_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ta_tan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsa_tsan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.jim_jan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_khan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kho_khon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dal_dan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzal_dzan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ro_ran_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zai_zan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sin_san_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syin_syan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shod_shon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhod_dhon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_thon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo_dzon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ain_an_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.gho_ghon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa_fan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qof_qon_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.kaf_kan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.lam_lan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mim_man_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.nun_nan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wa_wan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TampilGambar.setImageResource(R.drawable.ha_han_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya_yan_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(TanwinFathahActivity.this, TanwinActivity.class);
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
