package com.example.duyaehedaya;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class QuranDoyaActivity extends AppCompatActivity {

    private ListView listView;
    private String[] quranDoya;
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_doya);

      listView = findViewById(R.id.quranDoyaListViewId);
      quranDoya = getResources().getStringArray(R.array.doya_prekapot);

      adapter = new ArrayAdapter<String>(QuranDoyaActivity.this,R.layout.quran_sample_view,R.id.textViewId,quranDoya);
      listView.setAdapter(adapter);
      listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
          @Override
          public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

              String value = quranDoya[i].toString();

              intent = new Intent(QuranDoyaActivity.this,QuranDoyaDetailsActivity.class);
              intent.putExtra("quranDoya",value);
              startActivity(intent);
          }
      });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
