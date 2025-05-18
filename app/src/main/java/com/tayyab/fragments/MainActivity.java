package com.tayyab.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();

        // Code to switch to News Fragment
        Button btnews = findViewById(R.id.newsBTN);
        btnews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerView1, NewsFragment.class, null, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // when the user presses the Back button, it will return to the previous fragment instead of exiting the app.
                        .commit(); // execute the transaction
            }
        });


        // Code to switch to News Fragment
        Button btnpolitics = findViewById(R.id.politicsBTN);
        btnpolitics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerView1, PoliticsFragment.class, null, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });


        // Code to switch to Sports Fragment
        Button btnsports = findViewById(R.id.sportsBTN);
        btnsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerView1, SportsFragment.class, null, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("name") // Name can be null
                        .commit();
            }
        });
    }
}