package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView quranDoya;
    private View doyaIntro;
    private View doyaIns;
    private View doyaTime;
    private View doyaSoto;
    private View doyaAll;
    private View doyapray;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        quranDoya = findViewById(R.id.quranDoyaId);
        doyaIntro = findViewById(R.id.introDoyaId);
        doyaIns = findViewById(R.id.insDoyaId);
        doyaTime =findViewById(R.id.doyaTimeId);
        doyaSoto = findViewById(R.id.sotoDoyaId);
        doyaAll = findViewById(R.id.allDoyaId);
        doyapray = findViewById(R.id.monajatId);

        quranDoya.setOnClickListener(this);
        doyaIntro.setOnClickListener(this);
        doyaIns.setOnClickListener(this);
        doyaTime.setOnClickListener(this);
        doyaSoto.setOnClickListener(this);
        doyaAll.setOnClickListener(this);
        doyapray.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.quranDoyaId){
            intent = new Intent(HomeActivity.this,QuranDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.introDoyaId){
           intent = new Intent(HomeActivity.this,IntroActivity.class);
           startActivity(intent);
        }else if(view.getId()==R.id.insDoyaId){
            intent = new Intent(HomeActivity.this,InstActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.doyaTimeId){
            intent = new Intent(HomeActivity.this,TimeofDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.sotoDoyaId){
            intent = new Intent(HomeActivity.this,SotoDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.allDoyaId){
            intent = new Intent(HomeActivity.this,SokolDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.monajatId){
            intent = new Intent(HomeActivity.this,MonajatActivity.class);
            startActivity(intent);
        }

    }
}