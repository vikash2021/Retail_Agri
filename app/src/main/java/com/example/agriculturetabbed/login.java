package com.example.agriculturetabbed;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    Button btn;
    Button btn1;
    EditText login_username, login_password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btn=(Button)findViewById(R.id.b2);
        btn1=(Button)findViewById(R.id.b1);
        login_username=(EditText)findViewById(R.id.t1);
        login_password= (EditText)findViewById(R.id.t2);

        String userName = login_username.getText().toString();
        String password = login_password.getText().toString();

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(getApplicationContext(),milk_order.class));


            }
        });

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), sign_up.class));
            }
        });
    }
}
