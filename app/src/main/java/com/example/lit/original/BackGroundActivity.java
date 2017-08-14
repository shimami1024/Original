package com.example.lit.original;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.HashMap;
import java.util.HashSet;

public class BackGroundActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<Drawable> adapter;

    HashSet<Drawable> hashSet;
    HashMap<Drawable, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_ground);

        ListView listView = (ListView)findViewById(R.id.listView);
        adapter = new ArrayAdapter<Drawable>(this, android.R.layout.simple_expandable_list_item_1);
        this.hashSet = new HashSet<>();
        this.hashMap = new HashMap<>();

        hashSet.add();
        hashMap.put(R.drawable.background1, "背景１");

    }
}
