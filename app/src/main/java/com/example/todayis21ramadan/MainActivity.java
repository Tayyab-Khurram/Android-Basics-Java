package com.example.todayis21ramadan;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button purple = findViewById(R.id.btnSelect);
        purple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Hello World!", Toast.LENGTH_SHORT).show();
            }
        });

        Log.i("Hello", "onCreate Executed!");
    }

    protected void onStart() {
        super.onStart();
        Log.i("Hello", "onStart Executed!");
    }

    protected void onResume() {
        super.onResume();
        Log.i("Hello", "onResume Executed!");
    }

    protected void onPause() {
        super.onPause();
        Log.i("Hello", "onPause Executed!");
    }

    protected void onStop() {
        super.onStop();
        Log.i("Hello", "onStop Executed!");
    }

    protected void onRestart() {
        super.onRestart();
        Log.i("Hello", "onRestart Executed!");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i("Hello", "onDestroy Executed!");
    }
}