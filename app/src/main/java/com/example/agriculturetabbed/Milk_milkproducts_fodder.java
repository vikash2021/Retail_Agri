package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Milk_milkproducts_fodder extends AppCompatActivity {
    public CardView Milk,products,Medicines,fodder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_milk_milkproducts_fodder);
        Milk=(CardView) findViewById(R.id.milk);
        products=(CardView) findViewById(R.id.milk_products);
        Medicines=(CardView) findViewById(R.id.medicines);
        fodder=(CardView)findViewById(R.id.fodders);

        Milk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent  i = new Intent(getApplication(), milk_sell_purchase.class);
              startActivity(i);
            }
        });
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent  i = new Intent(getApplication(), milkproducts.class);
                startActivity(i);
            }
        });
        Medicines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplication(), medicines.class);
                startActivity(i);
            }
        });
        fodder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(getApplication(), fodders.class);
               startActivity(i);
            }
        });

    }

}
