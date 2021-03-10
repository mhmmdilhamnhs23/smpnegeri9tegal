package com.example.smpnegeri9tegal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class GuruActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guru);
    }

    public void menuguru(View view){
        Intent intent=new Intent(GuruActivity.this, MenuguruActivity.class);
        startActivity(intent);

    }

    public void staff(View view){
        Intent intent=new Intent(GuruActivity.this, StaffActivity.class);
        startActivity(intent);

    }




}