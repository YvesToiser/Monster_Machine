package com.example.wilder.monstermachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity  {

    private ListView listView;

    private String[] monsters = new String[]{
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        monsters = getResources().getStringArray(R.array.monsters_array);
        listView = (ListView) findViewById(R.id.monsterList);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                R.layout.liste_monstres, monsters);
        listView.setAdapter(adapter);
    }

}
