package com.example.ocean.gogo;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import com.example.ocean.gogo.modelo.Evento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main_Activity extends Activity{

    private RecyclerView recycler;
    private ArrayList<Evento> evento;
    private MyAdapter myAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_);

        creatCard();

        myAdapter = new MyAdapter(this, evento);

        recycler= (RecyclerView) findViewById(R.id.main_activity);
        recycler.setAdapter(myAdapter);
        recycler.setLayoutManager(new LinearLayoutManager(this));

//        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
//        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//
//        mRecyclerView.setHasFixedSize(true);
//
//        mLayoutManager = new LinearLayoutManager(this);
//        mRecyclerView.setLayoutManager(mLayoutManager);


    }

    private void creatCard() {
        evento = new ArrayList<Evento>();

        evento.add(new Evento(123, "Valos Lá","Nice?"));
    }


}
