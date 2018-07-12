package com.example.user.myspinnerdemoonitemselectlistner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    int[] flags;
    String[] country_name;
    Context context;
    String[] population;
    private LayoutInflater layoutInflater;

    CustomAdapter(Context context,int[] flags, String[]country_name, String[] population )
    {
        this.context=context;
        this.country_name=country_name;
        this.flags=flags;
    }


    @Override
    public int getCount() {
        return country_name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null)
        {
            layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=    layoutInflater.inflate(R.layout.sample_view,parent,false);

        }

        ImageView imageView=  convertView.findViewById(R.id.imageview);
        imageView.setImageResource(flags[position]);

        TextView textView= convertView.findViewById(R.id.textview);
        textView.setText(country_name[position]);

        TextView populationNumber= convertView.findViewById(R.id.population);
        textView.setText(country_name[position]);






        return null;
    }
}
