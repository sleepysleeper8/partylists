package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

import com.bumptech.glide.Glide;

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
        String partyPictureUrl=intent.getStringExtra("party_fullimageurl");
          viewActivityPartyName=findViewById(R.id.viewActivityPartyName);
        viewActivityPartyDescription=findViewById(R.id.viewActivityPartyDescription);

         viewActivityPartyDescription.setText(partyDescription);
         viewActivityPartyName.setText(partyName);
        ImageView img=findViewById(R.id.fullPartyPhoto);
        Glide.with(this).load(partyPictureUrl).into(img);

    }
}
