package somon.islam.anishasbanglabook;


import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anishasbanglabook.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;



public class SorobornoActivity extends AppCompatActivity implements View.OnClickListener{


    private ImageView sora, soraiya, rosi, derge, rosu, dirgo, rosili, eee, oi, ooo, oou;
    private ImageView imageView;

    private AdView mAdView;
    MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soroborno);


        MobileAds.initialize(this, "ca-app-pub-7461215501470288~8485091267");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);



        sora = findViewById(R.id.soro);
        soraiya = findViewById(R.id.soraiya);
        rosi = findViewById(R.id.rosi);
        derge = findViewById(R.id.dirghi);
        rosu = findViewById(R.id.rosu);
        dirgo = findViewById(R.id.dirgu);
        rosili = findViewById(R.id.rosuli);
        eee = findViewById(R.id.aaa);
        oi = findViewById(R.id.oi);
        ooo = findViewById(R.id.ooo);
        oou = findViewById(R.id.oou);

        imageView = findViewById(R.id.recicle);



        sora.setOnClickListener(this);
        soraiya.setOnClickListener(this);

        rosi.setOnClickListener(this);
        derge.setOnClickListener(this);
        rosu.setOnClickListener(this);
        dirgo.setOnClickListener(this);
        rosili.setOnClickListener(this);
        eee.setOnClickListener(this);
        oi.setOnClickListener(this);
        ooo.setOnClickListener(this);
        oou.setOnClickListener(this);







    }


    @Override
    public void onClick(View v) {


        switch (v.getId())
        {
            case R.id.soro:
                imageView.setImageResource(R.drawable.soroek);
                sound=MediaPlayer.create(this, R.raw.sk);
                sound.start();

                break;

            case R.id.soraiya:
                imageView.setImageResource(R.drawable.sorodui);
                sound=MediaPlayer.create(this, R.raw.sj);
                sound.start();


                break;

            case R.id.rosi:
                imageView.setImageResource(R.drawable.sorotin);
                sound=MediaPlayer.create(this, R.raw.si);
                sound.start();

                break;

            case R.id.dirghi:
                imageView.setImageResource(R.drawable.sorochar);
                sound=MediaPlayer.create(this, R.raw.sh);
                sound.start();


                break;

            case R.id.rosu:
                imageView.setImageResource(R.drawable.soropach);
                sound=MediaPlayer.create(this, R.raw.sg);
                sound.start();

                break;

            case R.id.dirgu:
                imageView.setImageResource(R.drawable.sorosoy);
                sound=MediaPlayer.create(this, R.raw.sf);
                sound.start();


                break;

            case R.id.rosuli:
                imageView.setImageResource(R.drawable.sorosat);
                sound=MediaPlayer.create(this, R.raw.se);
                sound.start();

                break;

            case R.id.aaa:
                imageView.setImageResource(R.drawable.soroat);
                sound=MediaPlayer.create(this, R.raw.sd);
                sound.start();


                break;
            case R.id.oi:
                imageView.setImageResource(R.drawable.soronoy);
                sound=MediaPlayer.create(this, R.raw.sc);
                sound.start();

                break;

            case R.id.ooo:
                imageView.setImageResource(R.drawable.sorodos);
                sound=MediaPlayer.create(this, R.raw.sb);
                sound.start();


                break;

            case R.id.oou:
                imageView.setImageResource(R.drawable.soroegharo);
                sound=MediaPlayer.create(this, R.raw.sa);
                sound.start();
                break;



        }

    }
}
