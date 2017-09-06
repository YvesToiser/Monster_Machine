package com.example.wilder.monstermachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private String[] monstres = new String[]{
          "aezrt", "dsfsf"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
        android.R.layout.simple_list_item_1, monstres);
        mListView.setAdapter(adapter);
    }
}
