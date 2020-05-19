package somon.islam.anishasbanglabook;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.anishasbanglabook.R;

public class FruitActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageView fOne, fTwo, fThree, fFour, fFive, fSix, fSeven, fEight, fNine, fTen;
    private MediaPlayer sound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);




                fOne = findViewById(R.id.fruOne);
                fTwo =findViewById(R.id.fruTwo);
                fThree = findViewById(R.id.fruThree);
                fFour =findViewById(R.id.fruFour);
                fFive = findViewById(R.id.fruFive);
                fSix= findViewById(R.id.fruSix);
                fSeven= findViewById(R.id.fruSeven);
                fEight= findViewById(R.id.fruEight);
                fNine = findViewById(R.id.fruNine);
                fTen= findViewById(R.id.fruTen);

         fOne.setOnClickListener(this);
        fTwo.setOnClickListener(this);
        fThree.setOnClickListener(this);
        fFour.setOnClickListener(this);
        fFive.setOnClickListener(this);
        fSix.setOnClickListener(this);
        fSeven.setOnClickListener(this);
        fEight.setOnClickListener(this);
        fNine.setOnClickListener(this);
        fTen.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.fruOne:
                sound=MediaPlayer.create(this, R.raw.fam);
                sound.start();
                break;

            case R.id.fruTwo:
                sound=MediaPlayer.create(this, R.raw.fjam);
                sound.start();
                break;


            case R.id.fruThree:
                sound=MediaPlayer.create(this, R.raw.fkathal);
                sound.start();
                break;
            case R.id.fruFour:
                sound=MediaPlayer.create(this, R.raw.flichu);
                sound.start();
                break;


            case R.id.fruFive:
                sound=MediaPlayer.create(this, R.raw.fapple);
                sound.start();
                break;


            case R.id.fruSix:
                sound=MediaPlayer.create(this, R.raw.fkomola);
                sound.start();
                break;

            case R.id.fruSeven:
                sound=MediaPlayer.create(this, R.raw.fanghur);
                sound.start();
                break;

            case R.id.fruEight:
                sound=MediaPlayer.create(this, R.raw.ftormuj);
                sound.start();
                break;
            case R.id.fruNine:
                sound=MediaPlayer.create(this, R.raw.fpepe);
                sound.start();
                break;
            case R.id.fruTen:
                sound=MediaPlayer.create(this, R.raw.fanaros);
                sound.start();
                break;




        }


    }
}
