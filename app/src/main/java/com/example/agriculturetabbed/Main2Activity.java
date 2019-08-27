package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ImageView agri=findViewById(R.id.agri);
        ImageView retail=findViewById(R.id.retail);
        agri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplication(),MainActivity.class);
                startActivity(i);
            }
        });
        retail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplication(),Milk_milkproducts_fodder.class);
                startActivity(i);
            }
        });

    }

}
