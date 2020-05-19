package somon.islam.anishasbanglabook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import com.example.anishasbanglabook.R;

public class MainActivity extends AppCompatActivity {


    private Button btnOne, btnTwo, btnThree, btnFour, btnFive;
    private InterstitialAd mInterstitialAd;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7461215501470288/8475414608");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

        mInterstitialAd.setAdListener(new AdListener()
                                      {

                                          @Override
                                          public void onAdClosed() {
                                              super.onAdClosed();

                                              Intent intent = new Intent(MainActivity.this, BenjonActivity.class);
                                              startActivity(intent);
                                              mInterstitialAd.loadAd(new AdRequest.Builder().build());


                                          }


                                      }



        );



        btnOne = findViewById(R.id.soroBorno);
        btnTwo = findViewById(R.id.benjonBorno);
        btnThree = findViewById(R.id.fruitsName);
        btnFour = findViewById(R.id.flowerName);
        btnFive = findViewById(R.id.banglaRhyme);



        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SorobornoActivity.class);
                startActivity(intent);

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                }
                else
                    {
                        Intent intent = new Intent(MainActivity.this, BenjonActivity.class);
                        startActivity(intent);
                     }




            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FruitActivity.class);
                startActivity(intent);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FlowerActivity.class);
                startActivity(intent);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RhymeActivity.class);
                startActivity(intent);
            }
        });




    }
}
