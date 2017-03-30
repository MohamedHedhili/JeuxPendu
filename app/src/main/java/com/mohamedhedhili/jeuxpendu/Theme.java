package com.mohamedhedhili.jeuxpendu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;

import com.github.anastr.spongeboblistview.SpongebobList;

import java.util.ArrayList;
import java.util.List;

public class Theme extends AppCompatActivity {
    SpongebobList  spongeList ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);
        spongeList = (SpongebobList) findViewById(R.id.spongebob_list);
        spongeList.getRecyclerView().setHasFixedSize(true);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        spongeList.getRecyclerView().setLayoutManager(llm);
        List<MyObject> list = new ArrayList<>();
        list.add(new MyObject("Cartoon",R.drawable.spongebob, 92));
        list.add(new MyObject("Ecole", R.drawable.ecole, 80));
        list.add(new MyObject("Sport", R.drawable.sport, 40));
        list.add(new MyObject("Histoire", R.drawable.histoire, 70));
        list.add(new MyObject("Géographic", R.drawable.geographic, 20));
        list.add(new MyObject("Pays et  Capitales", R.drawable.pays, 75));
        list.add(new MyObject("Animaux", R.drawable.animaux, 15));
        list.add(new MyObject("Métiers", R.drawable.metiers, 10));
        list.add(new MyObject("Maison", R.drawable.maison, 35));

        RVAdapter adapter = new RVAdapter(list);
        spongeList.getRecyclerView().setAdapter(adapter);



    }



}
