package com.example.myapplication;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Party> data;

    MyAdapter(ArrayList<Party> data) {
        this.data = data;
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
    public void onBindViewHolder(@NonNull MyAdapter.MyViewHolder holder, int position) {
        holder.bind(data.get(position));
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
        Button buttonInfo;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            partyNameTextView = itemView.findViewById(R.id.textViewPartyName);
            partyLocationTextView = itemView.findViewById(R.id.textViewPartyLocation);
            partyDateTextView = itemView.findViewById(R.id.textViewPartyDate);
            partyTimeTextView = itemView.findViewById(R.id.textViewPartyTime);
            partyDistanceTextView = itemView.findViewById(R.id.textViewPartyDistance);
            buttonInfo = itemView.findViewById((R.id.buttonInfo));

        }

        public void bind(Party party) {
            partyNameTextView.setText(party.name);
            partyLocationTextView.setText(party.location);
            partyDateTextView.setText(party.date);
            partyTimeTextView.setText(party.time);
            partyDistanceTextView.setText(party.distance);

        }
    }
    public interface  OnPartyListener{
        void OnPartyClick(int position);
    }

}