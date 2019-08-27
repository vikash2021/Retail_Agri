package com.example.agriculturetabbed;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class medicines extends Fragment {
    ListView ls;
    String[] Title={"pedds"};
    Integer[] medicine={R.drawable.milkpeddapp};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_medicines,container,false);
        ls=view.findViewById(R.id.medicinelist);
        CustomListView customListView=new CustomListView(getActivity(),medicine,Title);
        ls.setAdapter(customListView);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;

    }
}
