package com.example.user.myspinnerdemoonitemselectlistner;

import android.media.session.PlaybackState;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private String[] country_name;
    private String[] population;
    private int[] flags = {R.drawable.abkhazia, R.drawable.afghanistan, R.drawable.aland_islands, R.drawable.albania,
            R.drawable.algeria, R.drawable.albania, R.drawable.american_samoa, R.drawable.andorra, R.drawable.algeria};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner=findViewById(R.id.spinner);

        country_name=getResources().getStringArray(R.array.country_name);
        population=getResources().getStringArray(R.array.population);


        CustomAdapter adapter=new CustomAdapter(this,flags,country_name,population);
        spinner.setAdapter(adapter);



    }
}
