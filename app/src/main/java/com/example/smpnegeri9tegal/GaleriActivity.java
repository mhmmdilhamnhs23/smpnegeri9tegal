package com.example.smpnegeri9tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GaleriActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeri);
    }

    public void greenschool(View view){
        Intent intent=new Intent(GaleriActivity.this, GreenschoolActivity.class);
        startActivity(intent);

    }
    public void senam(View view){
        Intent intent=new Intent(GaleriActivity.this, SenamActivity.class);
        startActivity(intent);

    }
    public void hydroponic(View view){
        Intent intent=new Intent(GaleriActivity.this, HydroponicActivity.class);
        startActivity(intent);

    }

    public void upacara(View view){
        Intent intent=new Intent(GaleriActivity.this, UpacaraActivity.class);
        startActivity(intent);

    }

    public void kesenian(View view){
        Intent intent=new Intent(GaleriActivity.this, KesenianActivity.class);
        startActivity(intent);

    }

    public void galerilainlain(View view){
        Intent intent=new Intent(GaleriActivity.this, LainlainActivity.class);
        startActivity(intent);

    }


}