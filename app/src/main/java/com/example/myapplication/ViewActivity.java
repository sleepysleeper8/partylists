package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {
    TextView viewActivityPartyName;
    TextView viewActivityPartyDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
          viewActivityPartyDescription=findViewById(R.id.viewActivityPartyDescription);
          viewActivityPartyName=findViewById(R.id.viewActivityPartyName);
          Intent intent = getIntent();
          String partyName=intent.getStringExtra("partyname");
        String partyDescription=intent.getStringExtra("partydescription");
        viewActivityPartyName.setText(partyName);
        viewActivityPartyDescription.setText(partyDescription);
    }
}
