package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SokolDoyaActivity extends AppCompatActivity {

    private ListView listView;
    private String[] sokolDoya;
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sokol_doya);

        listView = findViewById(R.id.sokolDoyaListViewId);
        sokolDoya = getResources().getStringArray(R.array.sokoldoya);

        adapter = new ArrayAdapter<String>(SokolDoyaActivity.this,R.layout.alldoya_simple_view,R.id.allDoyaSampleTextViewId,sokolDoya);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                String value = sokolDoya[i].toString();

                intent = new Intent(SokolDoyaActivity.this,SokolDoyaDetailsActivity.class);
                intent.putExtra("sokolDoyaTitle",value);
                startActivity(intent);


            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}