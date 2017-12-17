package com.example.render.audiobiblearmenian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Player extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        Bundle bundle = getIntent().getExtras();
        String glux =  bundle.getString("glux");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(glux);
    }
}
