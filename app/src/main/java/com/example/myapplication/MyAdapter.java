package com.example.myapplication;

import android.content.Context;
import android.content.Intent;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Party> data;
    Context mycontext;

    MyAdapter(ArrayList<Party> data, Context context) {
        this.data = data;
        this.mycontext=context;
    }

    //Создается ViewHolder для каждого предмета в списке (только 1 раз)
    @NonNull
    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_party, parent, false);

        return new MyViewHolder(view);
    }

    //Соединяем данные с ViewHolder
    //Кладем данные во View
    @Override
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, final int position) {
        holder.bind(data.get(position));
        holder.firstLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(mycontext,ViewActivity.class);
                intent.putExtra("party_name",data.get(position).name);
                intent.putExtra("party_description",data.get(position).description);
                mycontext.startActivity(intent);

            }
        });
    }

    //Сколько предметов в списке
    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView partyNameTextView;
        TextView partyLocationTextView;
        TextView partyDateTextView;
        TextView partyTimeTextView;
        TextView partyDistanceTextView;
        ConstraintLayout firstLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            partyNameTextView = itemView.findViewById(R.id.textViewPartyName);
            partyLocationTextView = itemView.findViewById(R.id.textViewPartyLocation);
            partyDateTextView = itemView.findViewById(R.id.textViewPartyDate);
            partyTimeTextView = itemView.findViewById(R.id.textViewPartyTime);
            partyDistanceTextView = itemView.findViewById(R.id.textViewPartyDistance);
            firstLayout=itemView.findViewById(R.id.linearLayout);

        }

        public void bind(Party party) {
            partyNameTextView.setText(party.name);
            partyLocationTextView.setText(party.location);
            partyDateTextView.setText(party.date);
            partyTimeTextView.setText(party.time);
            partyDistanceTextView.setText(party.distance);

        }
    }
}