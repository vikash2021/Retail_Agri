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
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class fodders extends Fragment {
    ListView ls;
    String[] Title={"hydroponic"};
    Integer[] fodlist={R.drawable.lassiapp};
    Youtubelink ytb=new Youtubelink();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_fodders,container,false);
        ls=view.findViewById(R.id.fodderslist);
        CustomListView customListView=new CustomListView(getActivity(),fodlist,Title);
        ls.setAdapter(customListView);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;

    }
}
