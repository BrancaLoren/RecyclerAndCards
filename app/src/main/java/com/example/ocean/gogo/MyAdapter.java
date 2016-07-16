package com.example.ocean.gogo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ocean.gogo.modelo.Evento;

import java.util.ArrayList;

/**
 * Created by aluno on 15/07/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<EventoViewHolder> {

    private final ArrayList<Evento> evento;
    private final Context context;

    public MyAdapter(Context context, ArrayList<Evento> evento) {
        this.context=context;
        this.evento = evento;
    }


    @Override
    public EventoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_view, parent, false);
        EventoViewHolder viewHolder= new EventoViewHolder(context, view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(EventoViewHolder viewHolder, int position) {
        Evento event = evento.get(position);

        viewHolder.title.setText(event.getTitle());
        viewHolder.subtitle.setText(event.getSubtitle());

    }

    @Override
    public int getItemCount() {
        return evento.size();
    }
}
