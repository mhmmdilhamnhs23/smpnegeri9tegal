package com.example.smpnegeri9tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EkstrakulikulerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ekstrakulikuler);
    }

    public void hadroh(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, HadrohActivity.class);
        startActivity(intent);

    }

    public void sepakbola(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, SepakbolaActivity.class);
        startActivity(intent);

    }

    public void karate(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, KarateActivity.class);
        startActivity(intent);

    }

    public void silat(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, SilatActivity.class);
        startActivity(intent);

    }

    public void pmr(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, PmrActivity.class);
        startActivity(intent);

    }

    public void pramuka(View view){
        Intent intent=new Intent(EkstrakulikulerActivity.this, PramukaActivity.class);
        startActivity(intent);

    }



}