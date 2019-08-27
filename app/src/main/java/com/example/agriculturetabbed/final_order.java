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

                final int str1=Integer.parseInt(milkAmount.getText().toString());
                final String str2 = mobileNumber.getText().toString();
                final String str3 = Add1.getText().toString();
                final String str4 = Add2.getText().toString();



                if (str1<=2)

                {

                    Toast.makeText(final_order.this, "Please visit our nearby outlets", Toast.LENGTH_SHORT).show();
                    milkAmount.setText("");
                    mobileNumber.setText("");
                    Add1.setText("");
                    Add2.setText("");
                    startActivity(new Intent(getApplicationContext(), milk_order.class));


                }
                else
                {
                    milkAmount.setText("");
                    mobileNumber.setText("");
                    Add1.setText("");
                    Add2.setText("");
                    startActivity(new Intent(getApplicationContext(),order_confirmation.class));
                    final Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            startActivity(new Intent(getApplicationContext(), milk_order.class));

                        }
                    }, 4000);

                }


            }
        });
    }
}
