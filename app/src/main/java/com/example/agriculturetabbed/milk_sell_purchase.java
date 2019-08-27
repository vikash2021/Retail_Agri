package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class milk_sell_purchase extends AppCompatActivity {
    public CardView purMilk,sellMilk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_sell_purchase);
        purMilk=(CardView) findViewById(R.id.purchase_milk);
        sellMilk=(CardView) findViewById(R.id.sell_milk);

        purMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplication(), login.class);
               startActivity(i);
            }
        });
        sellMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent  i = new Intent(getApplication(), sell_milk.class);
              startActivity(i);
            }
        });
    }


}
