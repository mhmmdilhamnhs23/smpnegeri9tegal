package com.example.smpnegeri9tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewFlipper;
    Animation fadein, fadeout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper= (ViewFlipper) findViewById(R.id.viewFlipper);



        fadein= AnimationUtils.loadAnimation(this,R.anim.fade_in);

        fadeout= AnimationUtils.loadAnimation(this,R.anim.fade_out);

        viewFlipper.setInAnimation(fadein);

        viewFlipper.setOutAnimation(fadein);

        viewFlipper.setAutoStart(true);

        viewFlipper.setFlipInterval(5000);

        viewFlipper.startFlipping();
    }
    public void profil(View view){
        Intent intent=new Intent(MainActivity.this, ProfilActivity.class);
        startActivity(intent);

    }
    public void galeri(View view){
        Intent intent=new Intent(MainActivity.this, GaleriActivity.class);
        startActivity(intent);

    }
    public void guru(View view){
        Intent intent=new Intent(MainActivity.this, GuruActivity.class);
        startActivity(intent);

    }
    public void ekstrakulikuler(View view){
        Intent intent=new Intent(MainActivity.this, EkstrakulikulerActivity.class);
        startActivity(intent);

    }
    public void prestasi(View view){
        Intent intent=new Intent(MainActivity.this, PrestasiActivity.class);
        startActivity(intent);

    }
    public void fasilitas(View view){
        Intent intent=new Intent(MainActivity.this, FasilitasActivity.class);
        startActivity(intent);

    }



}