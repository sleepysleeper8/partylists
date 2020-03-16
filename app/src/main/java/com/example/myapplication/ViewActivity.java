package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

public class ViewActivity extends AppCompatActivity {
    TextView viewActivityPartyName;
    TextView viewActivityPartyDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent = getIntent();
        String partyName = intent.getStringExtra("party_name");
        String partyDescription = intent.getStringExtra("party_description");
          viewActivityPartyName=findViewById(R.id.viewActivityPartyName);
        viewActivityPartyDescription=findViewById(R.id.viewActivityPartyDescription);

         viewActivityPartyDescription.setText(partyDescription);
         viewActivityPartyName.setText(partyName);
    }
}
