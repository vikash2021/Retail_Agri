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

public class LatestTechnique extends Fragment {
    ListView ls;
    String[] Title={"Terrace Farming",
            "Zero Budget Farming",
            "Vertical Farming",
            "No-Till Farming",
            "Organic Farming",
            "Subsistence Farming"};
    Integer[] govtSch={R.drawable.terracefarming,
            R.drawable.zbf,
            R.drawable.vf,
            R.drawable.ntf,
            R.drawable.of,
            R.drawable.sf};
    Youtubelink ytb=new Youtubelink();
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_latest_techniques,container,false);
        ls=view.findViewById(R.id.ltechniques);
        CustomListView customListView=new CustomListView(getActivity(),govtSch,Title);
        ls.setAdapter(customListView);
        ls.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent yt=new Intent(getContext(),Youtubelink.class);
                switch (i){
                    case 0:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=V-SDjdTB1nw");
                          break;
                    case 1:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=1lV4HHwkeKw");
                        break;
                    case 2:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=QT4TWbPLrN8");
                        break;
                    case 3:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=5h9TknoaVsk");
                        break;
                    case 4:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=2qiNKen-rm0");
                        break;
                    case 5:
                        yt.putExtra("Link","https://www.youtube.com/watch?v=jlBu-qaNMMg");
                        break;

                }

                startActivity(yt);
            }
        });
        return view;
    }
}
