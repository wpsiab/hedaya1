package com.hedaya.duyaehedaya;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView quranDoya;
    private View doyaIntro;
    private View doyaIns;
    private View doyaTime;
    private View doyaSoto;
    private View doyaAll;
    private View doyapray;
    private Intent intent;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        quranDoya = findViewById(R.id.quranDoyaId);
        doyaIntro = findViewById(R.id.introDoyaId);
        doyaIns = findViewById(R.id.insDoyaId);
        doyaTime =findViewById(R.id.doyaTimeId);
        doyaSoto = findViewById(R.id.sotoDoyaId);
        doyaAll = findViewById(R.id.allDoyaId);
        doyapray = findViewById(R.id.monajatId);

        bottomNavigationView = findViewById(R.id.bottomNavigationId);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.aboutId:
                        intent = new Intent(MainActivity.this,AboutActivity.class);
                        startActivity(intent);
                        break;

                    case R.id.shareId:
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setType("text/plain");

                        String subject = "পবিত্র কোরআন মাজিদের দোয়া সমূহ";
                        String body = "পবিত্র কোরআন মাজিদ ও হাদীসের প্রায় তিন শতাধিক দোয়া এবং মোনাজাত";

                        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
                        intent.putExtra(Intent.EXTRA_TEXT,body);

                        startActivity(Intent.createChooser(intent,"Share with"));
                        break;

                    case R.id.messageId:
                        intent = new Intent(MainActivity.this,MessageActivity.class);
                        startActivity(intent);
                        break;

                }

                return false;
            }
        });

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
            intent = new Intent(MainActivity.this,QuranDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.introDoyaId){
            intent = new Intent(MainActivity.this,IntroActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.insDoyaId){
            intent = new Intent(MainActivity.this,InstActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.doyaTimeId){
            intent = new Intent(MainActivity.this,TimeofDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.sotoDoyaId){
            intent = new Intent(MainActivity.this,SotoDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.allDoyaId){
            intent = new Intent(MainActivity.this,SokolDoyaActivity.class);
            startActivity(intent);
        }else if(view.getId()==R.id.monajatId){
            intent = new Intent(MainActivity.this,MonajatActivity.class);
            startActivity(intent);
        }

    }
}