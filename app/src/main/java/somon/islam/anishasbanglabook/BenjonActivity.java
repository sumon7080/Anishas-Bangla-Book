package somon.islam.anishasbanglabook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anishasbanglabook.R;

public class BenjonActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView ko,kho,gho,ghoho,ummo,cho,cha;
    private ImageView borghiyo,jhoho, niyo, to, tho, doo;
    private ImageView doho, muddorno,tto, ttho, ddo, ddhoho, dhointonno, po, fo, bo, bhoho,mo, ontostiyoujo, bosinaro, lo,sho, pet, so, ho, dasinaro, dhosinaro, ontosthiyo;
    private ImageView khondotto, onoskar, bisodghor, chad;
    private ImageView imageView;
    private MediaPlayer sound;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benjon);

        imageView = findViewById(R.id.rebal);


                ko=findViewById(R.id.benOne);
                kho=findViewById(R.id.benTwo);
                gho=findViewById(R.id.benThree);
                ghoho=findViewById(R.id.benFour);
                ummo=findViewById(R.id.benFive);

        cho=findViewById(R.id.benSix);
        cha=findViewById(R.id.benSeven);
        borghiyo=findViewById(R.id.benEight);
        jhoho=findViewById(R.id.benNine);
        niyo=findViewById(R.id.benTen);



        to=findViewById(R.id.benEle);
        tho=findViewById(R.id.benTweleve);
        doo =findViewById(R.id.benThir);
        doho=findViewById(R.id.benFou);
        muddorno=findViewById(R.id.benFif);

        tto=findViewById(R.id.benSi);
        ttho=findViewById(R.id.benSe);
        ddo=findViewById(R.id.benEig);
        ddhoho=findViewById(R.id.benNin);
        dhointonno=findViewById(R.id.benTwe);


        po =findViewById(R.id.benTone);
        fo =findViewById(R.id.benTtwo);
        bo=findViewById(R.id.benTthree);
        bhoho=findViewById(R.id.benTfour);
        mo=findViewById(R.id.benTfiv);

        ontostiyoujo=findViewById(R.id.benTsix);
        bosinaro=findViewById(R.id.benTsev);
        lo=findViewById(R.id.benTeigh);
        sho=findViewById(R.id.benTnine);
        pet=findViewById(R.id.benThirty);



        so=findViewById(R.id.benthirtyOne);
        ho=findViewById(R.id.benthirtyTwo);
        dasinaro =findViewById(R.id.benthirtyThree);
        dhosinaro=findViewById(R.id.benthirtyFour);
        ontosthiyo=findViewById(R.id.benThirtyFive);

        khondotto=findViewById(R.id.benThirtysix);
        onoskar=findViewById(R.id.benThirtysev);
        bisodghor=findViewById(R.id.benThirtyeigh);
        chad=findViewById(R.id.benThirtynine);




        ko.setOnClickListener(this);
        kho.setOnClickListener(this);
        gho.setOnClickListener(this);
        ghoho.setOnClickListener(this);
        ummo.setOnClickListener(this);
        cho.setOnClickListener(this);cha.setOnClickListener(this);
        borghiyo.setOnClickListener(this);jhoho.setOnClickListener(this); niyo.setOnClickListener(this); to.setOnClickListener(this);tho.setOnClickListener(this); doo.setOnClickListener(this);
        doho.setOnClickListener(this); muddorno.setOnClickListener(this);tto.setOnClickListener(this); ttho.setOnClickListener(this);ddo.setOnClickListener(this); ddhoho.setOnClickListener(this);dhointonno.setOnClickListener(this);
        po.setOnClickListener(this); fo.setOnClickListener(this); bo.setOnClickListener(this); bhoho.setOnClickListener(this);mo.setOnClickListener(this); ontostiyoujo.setOnClickListener(this); bosinaro.setOnClickListener(this); lo.setOnClickListener(this);sho.setOnClickListener(this);
        pet.setOnClickListener(this); so.setOnClickListener(this); ho.setOnClickListener(this); dasinaro.setOnClickListener(this);
        dhosinaro.setOnClickListener(this); ontosthiyo.setOnClickListener(this);khondotto.setOnClickListener(this); onoskar.setOnClickListener(this); bisodghor.setOnClickListener(this); chad.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.benOne:
                imageView.setImageResource(R.drawable.ek);
                sound= MediaPlayer.create(this, R.raw.ba);
                sound.start();

                break;

            case R.id.benTwo:
                imageView.setImageResource(R.drawable.dui);
                sound= MediaPlayer.create(this, R.raw.bb);
                sound.start();
                break;
            case R.id.benThree:
                imageView.setImageResource(R.drawable.tin);
                sound= MediaPlayer.create(this, R.raw.bc);
                sound.start();
                break;

            case R.id.benFour:
                imageView.setImageResource(R.drawable.chaar);
                sound= MediaPlayer.create(this, R.raw.bd);
                sound.start();
                break;


            case R.id.benFive:
                imageView.setImageResource(R.drawable.pach);
                sound= MediaPlayer.create(this, R.raw.be);
                sound.start();
                break;

            case R.id.benSix:
                imageView.setImageResource(R.drawable.soy);
                sound= MediaPlayer.create(this, R.raw.bf);
                sound.start();
                break;

            case R.id.benSeven:
                imageView.setImageResource(R.drawable.sat);
                sound= MediaPlayer.create(this, R.raw.bg);
                sound.start();
                break;
            case R.id.benEight:
                imageView.setImageResource(R.drawable.at);
                sound= MediaPlayer.create(this, R.raw.bh);
                sound.start();
                break;

            case R.id.benNine:
                imageView.setImageResource(R.drawable.noy);
                sound= MediaPlayer.create(this, R.raw.bi);
                sound.start();
                break;


            case R.id.benTen:
                imageView.setImageResource(R.drawable.dos);
                sound= MediaPlayer.create(this, R.raw.bj);
                sound.start();
                break;





            case R.id.benEle:
                imageView.setImageResource(R.drawable.egharo);
                sound= MediaPlayer.create(this, R.raw.bk);
                sound.start();
                break;

            case R.id.benTweleve:
                imageView.setImageResource(R.drawable.baro);
                sound= MediaPlayer.create(this, R.raw.bl);
                sound.start();
                break;
            case R.id.benThir:
                imageView.setImageResource(R.drawable.tero);
                sound= MediaPlayer.create(this, R.raw.bm);
                sound.start();
                break;

            case R.id.benFou:
                imageView.setImageResource(R.drawable.choddo);
                sound= MediaPlayer.create(this, R.raw.bn);
                sound.start();
                break;


            case R.id.benFif:
                imageView.setImageResource(R.drawable.ponero);
                sound= MediaPlayer.create(this, R.raw.bo);
                sound.start();
                break;

            case R.id.benSi:
                imageView.setImageResource(R.drawable.solo);
                sound= MediaPlayer.create(this, R.raw.bp);
                sound.start();
                break;

            case R.id.benSe:
                imageView.setImageResource(R.drawable.sotero);
                sound= MediaPlayer.create(this, R.raw.bq);
                sound.start();
                break;
            case R.id.benEig:
                imageView.setImageResource(R.drawable.atharo);
                sound= MediaPlayer.create(this, R.raw.br);
                sound.start();
                break;

            case R.id.benNin:
                imageView.setImageResource(R.drawable.unish);
                sound= MediaPlayer.create(this, R.raw.bs);
                sound.start();
                break;


            case R.id.benTwe:
                imageView.setImageResource(R.drawable.bis);
                sound= MediaPlayer.create(this, R.raw.bt);
                sound.start();
                break;



            case R.id.benTone:
                imageView.setImageResource(R.drawable.ekush);
                sound= MediaPlayer.create(this, R.raw.bu);
                sound.start();
                break;

            case R.id.benTtwo:
                imageView.setImageResource(R.drawable.bais);
                sound= MediaPlayer.create(this, R.raw.bv);
                sound.start();
                break;
            case R.id.benTthree:
                imageView.setImageResource(R.drawable.teis);
                sound= MediaPlayer.create(this, R.raw.bw);
                sound.start();
                break;

            case R.id.benTfour:
                imageView.setImageResource(R.drawable.chobbis);
                sound= MediaPlayer.create(this, R.raw.bx);
                sound.start();
                break;


            case R.id.benTfiv:
                imageView.setImageResource(R.drawable.pochis);
                sound= MediaPlayer.create(this, R.raw.by);
                sound.start();
                break;

            case R.id.benTsix:
                imageView.setImageResource(R.drawable.chabbis);
                sound= MediaPlayer.create(this, R.raw.bz);
                sound.start();
                break;

            case R.id.benTsev:
                imageView.setImageResource(R.drawable.sataish);
                sound= MediaPlayer.create(this, R.raw.ca);
                sound.start();
                break;
            case R.id.benTeigh:
                imageView.setImageResource(R.drawable.atash);
                sound= MediaPlayer.create(this, R.raw.cb);
                sound.start();
                break;

            case R.id.benTnine:
                imageView.setImageResource(R.drawable.untrish);
                sound= MediaPlayer.create(this, R.raw.cc);
                sound.start();
                break;


            case R.id.benThirty:
                imageView.setImageResource(R.drawable.trish);
                sound= MediaPlayer.create(this, R.raw.cd);
                sound.start();
                break;



            case R.id.benthirtyOne:
                imageView.setImageResource(R.drawable.ektrish);
                sound= MediaPlayer.create(this, R.raw.ce);
                sound.start();
                break;

            case R.id.benthirtyTwo:
                imageView.setImageResource(R.drawable.botrish);
                sound= MediaPlayer.create(this, R.raw.cf);
                sound.start();
                break;
            case R.id.benthirtyThree:
                imageView.setImageResource(R.drawable.tetrish);
                sound= MediaPlayer.create(this, R.raw.cg);
                sound.start();
                break;

            case R.id.benthirtyFour:
                imageView.setImageResource(R.drawable.chowtrish);
                sound= MediaPlayer.create(this, R.raw.ch);
                sound.start();
                break;


            case R.id.benThirtyFive:
                imageView.setImageResource(R.drawable.poytrish);
                sound= MediaPlayer.create(this, R.raw.ci);
                sound.start();
                break;

            case R.id.benThirtysix:
                imageView.setImageResource(R.drawable.chottrish);
                sound= MediaPlayer.create(this, R.raw.cj);
                sound.start();
                break;

            case R.id.benThirtysev:
                imageView.setImageResource(R.drawable.saitrish);
                sound= MediaPlayer.create(this, R.raw.ck);
                sound.start();
                break;
            case R.id.benThirtyeigh:
                imageView.setImageResource(R.drawable.attrish);
                sound= MediaPlayer.create(this, R.raw.cl);
                sound.start();
                break;

            case R.id.benThirtynine:
                imageView.setImageResource(R.drawable.unchollish);
                sound= MediaPlayer.create(this, R.raw.cm);
                sound.start();
                break;








        }

    }
}
