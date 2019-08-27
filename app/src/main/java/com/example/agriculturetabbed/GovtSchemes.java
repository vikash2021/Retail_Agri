package com.example.agriculturetabbed;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GovtSchemes extends Fragment {

    ListView ls;
    String[] Title={"Bhawantar Bhuktan Yojna",
            "Fasal Bima",
            "Minimum Support Price",
            "Stree Sakti Tractor Loan",
            "Bengal Kisan Shasakat",
            "Kisan samman Yojna"};
    Integer[] govtSch={R.drawable.yb,
            R.drawable.fb,
            R.drawable.mspf,
            R.drawable.sstl,
            R.drawable.bengalscheme,
            R.drawable.samman};
    Youtubelink ytb=new Youtubelink();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view=inflater.inflate(R.layout.activity_govt_schemes,container,false);
       ls=view.findViewById(R.id.govtSchemesList);
       CustomListView customListView=new CustomListView(getActivity(),govtSch,Title);
       ls.setAdapter(customListView);
       ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
           @Override
           public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               Intent yt=new Intent(getContext(),Youtubelink.class);
               switch (i){
                   case 0:
                       yt.putExtra("Link","https://www.youtube.com/watch?v=i_-nXtP7njg");
                       break;
                   case 1:
                       yt.putExtra("Link","https://www.youtube.com/watch?v=pABkTHb39eA");
                       break;
                   case 2:
                       yt.putExtra("Link","https://www.youtube.com/watch?v=pABkTHb39eA");
                       break;
                   case 3:
                       yt.putExtra("Link","https://www.youtube.com/watch?v=nrw1umc_fB4");
                       break;
                   case 4:
                       yt.putExtra("Link","");
                       break;
                   case 5:
                       yt.putExtra("Link","https://www.youtube.com/watch?v=8VooU9N5PbM");
                       break;
               }

               startActivity(yt);
           }
       });
        return view;

    }


}
