package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class final_order extends AppCompatActivity {
    EditText milkAmount,mobileNumber,Add1,Add2;
    CheckBox checkBox; Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_order);
        milkAmount=(EditText)findViewById(R.id.am1);
        mobileNumber=(EditText)findViewById(R.id.am2);
        Add1=(EditText)findViewById(R.id.am3);
        Add2=(EditText)findViewById(R.id.am4);
        checkBox=(CheckBox)findViewById(R.id.cb1);
        button=(Button)findViewById(R.id.btn2);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent i=new Intent(getApplicationContext(),OrderDetails.class);
                    i.putExtra("amountOfMilk",milkAmount.getText().toString());
                    i.putExtra("Address",Add1.getText().toString());
                    i.putExtra("phone",mobileNumber.getText().toString());
                    i.putExtra("name","chandra shekhar");
                    startActivity(i);





            }
        });
    }
}
