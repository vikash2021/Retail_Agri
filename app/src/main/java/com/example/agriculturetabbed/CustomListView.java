package com.example.agriculturetabbed;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomListView extends ArrayAdapter<Integer> {

    private Integer[] img;
    private String[] Title;
    private Activity context;
    public CustomListView(Activity context, Integer[] img,String[] Title) {
        super(context, R.layout.customlayout,img);
        this.context=context;
        this.img=img;
        this.Title=Title;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View r=convertView;
        viewHolder v=null;
        if (r==null){
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.customlayout,null,true);
            v=new viewHolder(r);
            r.setTag(v);
        }else {
            v= (viewHolder) r.getTag();
        }
        v.ivm.setImageResource(img[position]);
        v.tv.setText(Title[position]);
        return r;
    }
    class viewHolder{
        ImageView ivm;
        TextView tv;
        viewHolder(View v){
         ivm=v.findViewById(R.id.imageView);
         tv=v.findViewById(R.id.textView3);
        }
    }
}
