package com.example.mytest;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SecondPage extends AppCompatActivity {

    static ListView listView2;
    static ListViewAdapter2 adapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_page);

        listView2 = findViewById(R.id.listview2);

        ArrayList<String> ar1 = getIntent().getExtras().getStringArrayList("list");
        adapter2 = new ListViewAdapter2(getApplicationContext(), ar1);
        listView2.setAdapter(adapter2);

        
    }

}
