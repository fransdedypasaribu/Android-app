package com.dicoding.fransdedypasaribu.mysubmissionapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private RecyclerView rvAlat;
    private ArrayList<Alat> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvAlat = findViewById(R.id.rv_alat);
        rvAlat.setHasFixedSize(true);

        list.addAll(AlatData.getListData());
        showRecyclerList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profile,menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item){
        {
            Intent moveIntent = new Intent(MainActivity.this, Profile.class);
            startActivity(moveIntent);
        }
        return false;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity_main:
                Intent moveIntent = new Intent(MainActivity.this, Profile.class);
                startActivity(moveIntent);
                break;
        }
    }

    private void showRecyclerList(){
        rvAlat.setLayoutManager(new LinearLayoutManager(this));
        final ListAlatAdapter listAlatAdapter = new ListAlatAdapter(list);
        rvAlat.setAdapter(listAlatAdapter);
    }
}
