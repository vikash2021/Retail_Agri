package com.example.agriculturetabbed;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.example.agriculturetabbed.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {

    Boolean searchbarIsVisible=false;
     EditText ed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        final FloatingActionButton ft=findViewById(R.id.floatingbt);
        ed=findViewById(R.id.searchbox);
        ft.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("RestrictedApi")
            @Override
            public void onClick(View view) {
               if (searchbarIsVisible){

                 ed.setVisibility(View.INVISIBLE);
                 searchbarIsVisible=false;
               }else {
                   ed.setVisibility(View.VISIBLE);
                   searchbarIsVisible=true;
               }
            }
        });

    }

    //override to get three dotes


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return true;
    }
}
