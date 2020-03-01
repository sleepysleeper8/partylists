package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity implements MyAdapter.OnPartyListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(getData());

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);

    }

    public ArrayList<Party>getData(){
        ArrayList<Party> data = new ArrayList<>();
        data.add(new Party("сходка любителей троицких басов","клуб приколов","66 янв.","18:00","0 m"," Чувак, ты думал что-то здесь будет?"));
        data.add(new Party("смотрим мемы про котов"," детский сад 78","30 фев.","9:00","1 km","Чувак, ты думал что-то здесь будет?"));
        data.add(new Party("вскрываемся из=за кр по матеше за 5класс","школа 22","хз","тоже хз","2 km","Чувак, ты думал что-то здесь будет?"));
        data.add(new Party("находим смысл жизни","нет такого места","никогда","см.дату","бесконечность","Чувак, ты думал что-то здесь будет?"));
        data.add(new Party("плачем","здесь","сегодня","сейчас","0","Чувак, ты думал что-то здесь будет?"));
      return data;
    }


    @Override
    public void OnPartyClick(int position) {
       Intent intent = new Intent(this, ViewActivity.class);
       intent.putExtra("",data.getData);
    }
}