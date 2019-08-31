package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlacedOrder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_placed_order);
        Intent i=getIntent();
        TextView name=findViewById(R.id.name);
        TextView address=findViewById(R.id.addresss);
        TextView amnt=findViewById(R.id.amou);
        TextView phone=findViewById(R.id.phoneNumber);
        Button done=findViewById(R.id.Done);
        name.setText(i.getExtras().getString("name"));
        address.setText(i.getExtras().getString("Address"));
        phone.setText(i.getExtras().getString("phone"));
        amnt.setText(i.getExtras().getString("amount"));
        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(getApplication(),Milk_milkproducts_fodder.class);
                startActivity(j);
            }
        });
    }
}
