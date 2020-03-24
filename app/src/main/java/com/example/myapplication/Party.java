package com.example.myapplication;

public class Party {
     public String name,location,date,time,distance,description,pictureName,fullpartyurl;

    public Party(String name, String location, String date, String time, String distance,String description,String pictureName,String fullpartyurl) {
        this.name = name;
        this.location = location;
        this.date = date;
        this.time = time;
        this.distance = distance;
        this.description = description;
        this.pictureName=pictureName;
        this.fullpartyurl=fullpartyurl;
    }
}