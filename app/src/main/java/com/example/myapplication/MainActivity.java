package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;



import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

import static android.view.View.*;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView view = findViewById(R.id.list);

        MyAdapter adapter = new MyAdapter(getData(),this);

        view.setAdapter(adapter);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);

        view.setHasFixedSize(true);
        view.setNestedScrollingEnabled(true);

        view.setLayoutManager(manager);

    }

    public ArrayList<Party>getData(){
        ArrayList<Party> data = new ArrayList<>();
        data.add(new Party("Сходка любителей чая(и тортиков с клубничкой)"," Энгельса пр. 128","02.04","17:00","1 km","Самое милое  и уютное мероприятие этой весны!Сидим, пьем чай с конфетами и другими сладостями и обсуждаем его. (:","https://i.imgur.com/c7xYSfa.jpg","https://i.pinimg.com/originals/02/a7/51/02a751d523fb3a9bd8edec05f81b0ffb.jpg"));
        data.add(new Party("Готовимся к контрольной по линейным уравнениям  за 5 кл.","Школа №22","09.04","11:00","2 km","Совместная подготовка  к контрольной  по математике (( ","https://st3.depositphotos.com/3535225/17521/i/1600/depositphotos_175211364-stock-photo-puzzled-sad-writing-pupil-sitting.jpg","https://sun9-22.userapi.com/c637418/v637418345/1d30c/AnuAvqKIjx8.jpg"));
        data.add(new Party("Смотрим Таксиста Скорсезе","Приморский пр.147","08.04","13:00","600m"," Тема одиночества в старых фильмах ","https://top100project.files.wordpress.com/2013/03/taxi-driver.jpg","https://pbs.twimg.com/media/C4Yqkt4UYAAAZgM?format=jpg&name=900x900"));
        data.add(new Party("Открытие клуба любителей собак","Лиговский пр.64","13.04","16:00","8km"," Зацените эту нереальную организацию","https://www.irishtimes.com/polopoly_fs/1.4104282.1575446932!/image/image.jpg_gen/derivatives/box_620_330/image.jpg","https://sun9-62.userapi.com/c853620/v853620393/cf1b6/dMN-uZ9zd-w.jpg"));
      return data;
    }

}