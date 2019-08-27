package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class milk_order extends AppCompatActivity {
    public CardView search,order;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_order);

        search=(CardView) findViewById(R.id.searchOutlet);
        order=(CardView) findViewById(R.id.finalOrder);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplication(), map.class);
               startActivity(i);
            }
        });
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplication(), final_order.class);
               startActivity(i);
            }
        });
    }



}
