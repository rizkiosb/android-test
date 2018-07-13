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

public class TanwinKasrohActivity extends AppCompatActivity {
    ImageView TampilGambar;
    ImageButton show,hide,pindah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tanwin_kasroh);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        TampilGambar = (ImageView) findViewById(R.id.popupTanwinKasroh);
        show = (ImageButton)findViewById(R.id.in);
        hide = (ImageButton)findViewById(R.id.bin);

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
        final MediaPlayer suaraAlif = MediaPlayer.create(this, R.raw.alif_in);
        final MediaPlayer suaraBa = MediaPlayer.create(this, R.raw.ba_bin);
        final MediaPlayer suaraTa = MediaPlayer.create(this, R.raw.ta_tin);
        final MediaPlayer suaraTsa = MediaPlayer.create(this, R.raw.tsa_tsin);
        final MediaPlayer suaraJim = MediaPlayer.create(this, R.raw.jim_jin);
        final MediaPlayer suaraha = MediaPlayer.create(this, R.raw.ha_khin);
        final MediaPlayer suaraKho = MediaPlayer.create(this, R.raw.kho_khin);
        final MediaPlayer suaraDal = MediaPlayer.create(this, R.raw.dal_din);
        final MediaPlayer suaraDzal = MediaPlayer.create(this, R.raw.dzal_dzin);
        final MediaPlayer suaraRa = MediaPlayer.create(this, R.raw.ra_rin);
        final MediaPlayer suaraZai = MediaPlayer.create(this, R.raw.zai_zin);
        final MediaPlayer suaraSin = MediaPlayer.create(this, R.raw.sin_sin);
        final MediaPlayer suaraSyin = MediaPlayer.create(this, R.raw.syin_syin);
        final MediaPlayer suaraShod = MediaPlayer.create(this, R.raw.shod_shin);
        final MediaPlayer suaraDhot = MediaPlayer.create(this, R.raw.dhot_dhin);
        final MediaPlayer suaraTho = MediaPlayer.create(this, R.raw.tho_thin);
        final MediaPlayer suaraDzo = MediaPlayer.create(this, R.raw.dzo_dzin);
        final MediaPlayer suaraAin = MediaPlayer.create(this, R.raw.ain_in);
        final MediaPlayer suaraGhin = MediaPlayer.create(this, R.raw.ghin_ghin);
        final MediaPlayer suaraFa = MediaPlayer.create(this, R.raw.fa_fin);
        final MediaPlayer suaraQaf = MediaPlayer.create(this, R.raw.qof_qin);
        final MediaPlayer suaraKaf = MediaPlayer.create(this,R.raw.kaf_kin);
        final MediaPlayer suaraLam = MediaPlayer.create(this, R.raw.lam_lin);
        final MediaPlayer suaraMim = MediaPlayer.create(this, R.raw.mim_min);
        final MediaPlayer suaraNun = MediaPlayer.create(this, R.raw.nun_nin);
        final MediaPlayer suaraWawu = MediaPlayer.create(this, R.raw.wawu_win);
        final MediaPlayer suaraHa = MediaPlayer.create(this,R.raw.ha_hin);
        final MediaPlayer suaraYa = MediaPlayer.create(this, R.raw.ya_yin);
        final MediaPlayer suaraButton = MediaPlayer.create(this,R.raw.button);
        //variabel Button
        ImageButton butonSuara1 = (ImageButton)this.findViewById(R.id.in);
        ImageButton butonSuara2 = (ImageButton)this.findViewById(R.id.bin);
        ImageButton butonSuara3 = (ImageButton)this.findViewById(R.id.tin);
        ImageButton butonSuara4 = (ImageButton)this.findViewById(R.id.tsin);
        ImageButton butonSuara5 = (ImageButton)this.findViewById(R.id.jin);
        ImageButton butonSuara6 = (ImageButton)this.findViewById(R.id.ha_khin);
        ImageButton butonSuara7= (ImageButton)this.findViewById(R.id.kho_khin);
        ImageButton butonSuara8 = (ImageButton)this.findViewById(R.id.din);
        ImageButton butonSuara9 = (ImageButton)this.findViewById(R.id.dzal_dzin);
        ImageButton butonSuara10 = (ImageButton)this.findViewById(R.id.rin);
        ImageButton butonSuara11= (ImageButton)this.findViewById(R.id.zal_zin);
        ImageButton butonSuara12 = (ImageButton)this.findViewById(R.id.sin_sin);
        ImageButton butonSuara13 = (ImageButton)this.findViewById(R.id.syin_syin);
        ImageButton butonSuara14 = (ImageButton)this.findViewById(R.id.shod_shin);
        ImageButton butonSuara15 = (ImageButton)this.findViewById(R.id.dhod_din);
        ImageButton butonSuara16 = (ImageButton)this.findViewById(R.id.tho_thin);
        ImageButton butonSuara17 = (ImageButton)this.findViewById(R.id.dzo_dzin);
        ImageButton butonSuara18 = (ImageButton)this.findViewById(R.id.ain_in);
        ImageButton butonSuara19 = (ImageButton)this.findViewById(R.id.gho_ghin);
        ImageButton butonSuara20 = (ImageButton)this.findViewById(R.id.fin);
        ImageButton butonSuara21 = (ImageButton)this.findViewById(R.id.qin);
        ImageButton butonSuara22 = (ImageButton)this.findViewById(R.id.kin);
        ImageButton butonSuara23 = (ImageButton)this.findViewById(R.id.lin);
        ImageButton butonSuara24 = (ImageButton)this.findViewById(R.id.min);
        ImageButton butonSuara25 = (ImageButton)this.findViewById(R.id.nun_nin);
        ImageButton butonSuara26 = (ImageButton)this.findViewById(R.id.win);
        ImageButton butonSuara27 = (ImageButton)this.findViewById(R.id.hin);
        ImageButton butonSuara30 = (ImageButton)this.findViewById(R.id.yin);

        //menghidupkkan suara

        butonSuara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAlif.start();
                TampilGambar.setImageResource(R.drawable.alif_in_kasroh_tanwin_1);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ba_bin_kashroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraBa.start();
            }
        });
        butonSuara3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ta_tin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraTa.start();
            }
        });
        butonSuara4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.tsa_tsin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraTsa.start();
            }
        });
        butonSuara5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.jim_jin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraJim.start();
            }
        });
        butonSuara6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_khin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraha.start();
            }
        });
        butonSuara7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.kho_khin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraKho.start();
            }
        });
        butonSuara8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dal_din_kashroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraDal.start();
            }
        });
        butonSuara9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.dzin);
                TampilGambar.startAnimation(animScale);
                suaraDzal.start();
            }
        });
        butonSuara10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ro_rin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraRa.start();
            }
        });
        butonSuara11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.zai_zin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraZai.start();
            }
        });
        butonSuara12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.sin_sin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSin.start();
            }
        });
        butonSuara13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.syin_syin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraSyin.start();
            }
        });
        butonSuara14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraShod.start();
                TampilGambar.setImageResource(R.drawable.shod_shin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDhot.start();
                TampilGambar.setImageResource(R.drawable.dhod_dhin_kashroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraTho.start();
                TampilGambar.setImageResource(R.drawable.tho_thin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraDzo.start();
                TampilGambar.setImageResource(R.drawable.dzo_dzin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraAin.start();
                TampilGambar.setImageResource(R.drawable.ain_in_kashroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraGhin.start();
                TampilGambar.setImageResource(R.drawable.gho_ghin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraFa.start();
                TampilGambar.setImageResource(R.drawable.fa_fin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });

        butonSuara21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraQaf.start();
                TampilGambar.setImageResource(R.drawable.qof_qin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraKaf.start();
                TampilGambar.setImageResource(R.drawable.kaf_kin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);

            }
        });
        butonSuara23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraLam.start();
                TampilGambar.setImageResource(R.drawable.lam_lin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraMim.start();
                TampilGambar.setImageResource(R.drawable.mim_min_fathah_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraNun.start();
                TampilGambar.setImageResource(R.drawable.nun_nin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraWawu.start();
                TampilGambar.setImageResource(R.drawable.wa_win_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
            }
        });
        butonSuara27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ha_hin_kashroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraHa.start();
            }
        });

        butonSuara30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TampilGambar.setImageResource(R.drawable.ya_yin_kasroh_tanwin);
                TampilGambar.startAnimation(animScale);
                suaraYa.start();
            }
        });
        pindah = (ImageButton) findViewById(R.id.buttonBack);
        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                suaraButton.start();
                Intent intent = new Intent(TanwinKasrohActivity.this, TanwinActivity.class);
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
