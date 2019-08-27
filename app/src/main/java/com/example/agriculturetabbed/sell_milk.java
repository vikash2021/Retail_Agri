package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class sell_milk extends AppCompatActivity {
    EditText Amount,Name,Number,address1,address2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_milk);
        Amount=(EditText)findViewById(R.id.am1);
        Name=(EditText)findViewById(R.id.am2);
        Number=(EditText)findViewById(R.id.am3);
        address1=(EditText)findViewById(R.id.am4);
        address2=(EditText)findViewById(R.id.am5);
        button=(Button) findViewById(R.id.btn2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(), sell_confirmation.class));
                Amount.setText("");
                Name.setText("");
                Number.setText("");
                address1.setText("");
                address2.setText("");

                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startActivity(new Intent(getApplicationContext(),milk_sell_purchase.class));

                    }
                }, 4000);


            }
        });

    }

}
