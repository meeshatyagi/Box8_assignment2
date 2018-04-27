package com.example.user.box8;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

public class ImageActivity extends Activity {
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    RecyclerView.Adapter adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_two);

        Intent i = getIntent();

        recyclerView = (RecyclerView) findViewById(R.id.recycle_view);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        int position = i.getExtras().getInt("id");
        MainActivity Adapter = new MainActivity(this);
        Toast.makeText(this, "Selected "+Adapter.mThumbNames[position], Toast.LENGTH_SHORT).show();

        adapter = new Recycle(Adapter.mThumbNames[position]);
        recyclerView.setAdapter(adapter);


    }

}
