package com.example.UsingIntents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        Button btn2 = findViewById(R.id.second_button);

        btn2.setOnClickListener(View -> {
            Intent yourInt = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(yourInt);
        });

//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity2.this, "Going back to first activity", Toast.LENGTH_LONG).show();
//            }
//        });
    }
}