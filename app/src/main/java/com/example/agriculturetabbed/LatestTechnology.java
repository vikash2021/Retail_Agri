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

import java.util.zip.Inflater;

public class LatestTechnology extends Fragment {
    ListView ls;
    String[] Title={"Fertilizer Spreankler",
            "Potato Spreader",
            "Soil Quality Detector",
            "Modern Harvest Machine",
            "Farming Robot",
            "Water Sprinkler"};
    Integer[] govtSch={R.drawable.fertilizersprinkler,
            R.drawable.potatospreader,
            R.drawable.soilqualitydetector,
            R.drawable.modernharvestmachinee,
            R.drawable.farmingrobot,
            R.drawable.watersprinkler};
    Youtubelink ytb=new Youtubelink();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_latest_technolog,container,false);
        ls=view.findViewById(R.id.ltechnology);
        CustomListView customListView=new CustomListView(getActivity(),govtSch,Title);
        ls.setAdapter(customListView);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent yt=new Intent(getContext(),Youtubelink.class);
                switch (i){
                    case 0:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=P2YPG8PO9JU");
                        break;
                    case 1:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=eGBvrDY-4Xo");
                        break;
                    case 2:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=vw7-1D4Y_Pw");
                        break;
                    case 3:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=WNAXiH-AL54");
                        break;
                    case 4:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=Xr4aBFUzLmw");
                        break;
                    case 5:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=qW19T_t5Hi4");
                        break;
                }

                startActivity(yt);
            }
        });
        return view;

    }
}
