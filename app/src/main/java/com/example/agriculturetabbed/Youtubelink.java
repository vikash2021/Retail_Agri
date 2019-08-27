package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Youtubelink extends AppCompatActivity {
    TextView yTbLink;
    String a;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtubelink);
        yTbLink=findViewById(R.id.ytblink);
        a=getIntent().getExtras().getString("Link");
        yTbLink.setText(a);
    }

}
