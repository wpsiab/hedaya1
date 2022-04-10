package com.example.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SotoDoyaActivity extends AppCompatActivity {

    private ListView listView;
    private String[] sotoDoya;
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soto_doya);

        listView = findViewById(R.id.listViewId);
        sotoDoya = getResources().getStringArray(R.array.sotodoya);
        adapter = new ArrayAdapter<String>(SotoDoyaActivity.this,R.layout.sotodoya_sample_view,R.id.textViewId,sotoDoya);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = sotoDoya[i].toString();

                    intent = new Intent(SotoDoyaActivity.this,SotoDoyaDetailsActivity.class);
                    intent.putExtra("SotoDoyaTitle",value);
                    startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}