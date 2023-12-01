package com.techwizards.learningfragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnNews, BtnSports, BtnScience;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        BtnNews= findViewById(R.id.BtnNews);
        BtnSports = findViewById(R.id.BtnSports);
        BtnScience= findViewById(R.id.BtnScience);

        //onclick
        BtnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        BtnSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
       
    }
}