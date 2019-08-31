package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        Button confirmorder=findViewById(R.id.confirmOrder);
        TextView nm=findViewById(R.id.name);
        TextView addres=findViewById(R.id.Address);
        TextView phone=findViewById(R.id.Phone);
        TextView amount=findViewById(R.id.AmmountofMilk);
        Intent i=getIntent();
        final String name=i.getExtras().getString("name");
        final String amountofm=i.getExtras().getString("amountOfMilk")+"Ltr";
        final String phoneN=i.getExtras().getString("phone");
        final String addd=i.getExtras().getString("Address");


        nm.setText(name);
        addres.setText(addd);
        amount.setText(amountofm);
        phone.setText(phoneN);
        confirmorder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplication(),PlacedOrder.class);
                j.putExtra("name",name);
                j.putExtra("Address",addd);
                j.putExtra("phone",phoneN);
                j.putExtra("amount",amountofm);
                startActivity(j);
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
