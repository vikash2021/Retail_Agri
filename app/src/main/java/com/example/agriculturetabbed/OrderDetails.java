package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class OrderDetails extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_details);
        final RadioButton creditcard=findViewById(R.id.credit_debi);
        final RadioButton paytm=findViewById(R.id.payt);
        final RadioButton netbanking=findViewById(R.id.netbanking);
        final RadioButton cod=findViewById(R.id.cod);
        Button confirmorder = findViewById(R.id.buttton2);


        confirmorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(getApplicationContext(), order_confirmation.class));

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getApplicationContext(),PlacedOrder.class));

                    }
                }, 4000);


            }
        });
        creditcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                creditcard.setChecked(true);
                paytm.setChecked(false);
                netbanking.setChecked(false);
                cod.setChecked(false);
            }
        });
        paytm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                creditcard.setChecked(false);
                paytm.setChecked(true);
                netbanking.setChecked(false);
                cod.setChecked(false);
            }
        });
        netbanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                creditcard.setChecked(false);
                paytm.setChecked(false);
                netbanking.setChecked(true);
                cod.setChecked(false);
            }
        });
        cod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                creditcard.setChecked(false);
                paytm.setChecked(false);
                netbanking.setChecked(false);
                cod.setChecked(true);
            }
        });





    }
}
