package com.tayyab.paktour;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity_CityName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_name);

        ImageView imgKarachi = findViewById(R.id.khi_image);
        ImageView imgLahore = findViewById(R.id.lhr_image);
        ImageView imgMultan = findViewById(R.id.mul_image);
        ImageView imgIslamabad = findViewById(R.id.isb_image);

        imgKarachi.setOnClickListener(view -> openCityDetail("Karachi"));
        imgLahore.setOnClickListener(viwe -> openCityDetail("Lahore"));
        imgMultan.setOnClickListener(view -> openCityDetail("Multan"));
        imgIslamabad.setOnClickListener(view -> openCityDetail("Islamabad"));

    }

    private void openCityDetail(String cityName) {
        Intent intent = new Intent(this, CityDetailActivity.class);
        intent.putExtra("city", cityName);
        startActivity(intent);
    }
}