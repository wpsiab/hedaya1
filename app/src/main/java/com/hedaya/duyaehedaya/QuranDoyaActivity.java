package com.hedaya.duyaehedaya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class QuranDoyaActivity extends AppCompatActivity {

    private ListView listView;
    private String[] quranDoya;
    private ArrayAdapter<String> adapter;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran_doya);

        getSupportActionBar().setTitle("বিভিন্ন দোয়া এবং তার প্রেক্ষাপট");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.search_menu,menu);

        MenuItem menuItem = menu.findItem(R.id.searchViewId);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);

                return false;

            }
        });

        return super.onCreateOptionsMenu(menu);
    }
}
