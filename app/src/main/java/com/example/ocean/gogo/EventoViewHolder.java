package com.example.ocean.gogo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by aluno on 15/07/2016.
 */
public class EventoViewHolder extends RecyclerView.ViewHolder {

    private Context context;
    public TextView subtitle;
    public TextView title;

    public EventoViewHolder(Context context, View itemView) {
        super(itemView);
        this.context = context;

        title= (TextView) itemView.findViewById(R.id.card_title);
        subtitle = (TextView) itemView.findViewById(R.id.card_sub_title);
        
    }

    public void onClick(View v){
        Toast.makeText(context, title.getText().toString(), Toast.LENGTH_SHORT).show();
    }


}
