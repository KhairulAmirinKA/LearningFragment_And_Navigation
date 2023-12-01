package com.techwizards.learningfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

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

        FragmentManager fragmentManager =getSupportFragmentManager();

        //onclick the news btn
        BtnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, NewsFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("any Name")
                        .commit();
                

            }
        });

        //onclick sports
        BtnSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, SportsFragment.class, null)
                        .addToBackStack("name")
                        .setReorderingAllowed(true)
                        .commit();

            }
        });

        //onclick the Science btn
        BtnScience.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView, ScienceFragment.class, null)
                        .addToBackStack("name")
                        .setReorderingAllowed(true)
                        .commit();
            }
        });
       
    }
}