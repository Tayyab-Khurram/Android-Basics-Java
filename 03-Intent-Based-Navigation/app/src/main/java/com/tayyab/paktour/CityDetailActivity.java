package com.tayyab.paktour;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class CityDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_city_detail);

        TextView cityInfo;

        cityInfo = findViewById(R.id.textCityInfo);
        String City = getIntent().getStringExtra("city");

        if (City != null) {
            switch (City) {
                case "Karachi":
                    cityInfo.setText("Karachi: As Pakistan's largest city and economic hub, Karachi is a sprawling metropolis located along the Arabian Sea. It plays a vital role in the country’s commerce, housing Pakistan’s busiest ports and a diverse industrial base. Karachi’s population reflects a melting pot of cultures, ethnicities, and languages, making it one of the most cosmopolitan cities in South Asia. Despite its rapid urban expansion and challenges, it boasts a dynamic energy, seen in its bustling bazaars, towering skyscrapers, and a growing tech and startup ecosystem. From Clifton Beach to Saddar’s colonial architecture, Karachi remains a city of contrasts and resilience.");
                    break;
                case "Lahore":
                    cityInfo.setText("Lahore: Known as the cultural heart of Pakistan, Lahore is a city that seamlessly blends history, art, and modernity. It is home to iconic landmarks such as the Badshahi Mosque, Lahore Fort, and the historic Walled City, reflecting its rich Mughal heritage. The city thrives on its vibrant food scene, with bustling markets like Anarkali and Liberty offering everything from street snacks to high-end dining. Lahore is also a major center for education and the arts, hosting prestigious institutions like the University of the Punjab and the National College of Arts. With its passionate residents and deep-rooted traditions, Lahore embodies the soul of Punjab.");
                    break;
                case "Multan":
                    cityInfo.setText("Multan: Known as the \"City of Saints,\" Multan is one of the oldest cities in South Asia, with a spiritual and historical legacy that dates back thousands of years. Nestled in southern Punjab, it is renowned for its Sufi shrines, most notably those of Bahauddin Zakariya and Shah Rukn-e-Alam, which attract devotees from across the country. The city also has a strong agricultural economy, especially in mango and cotton production. Its traditional handicrafts, such as blue pottery and camel-skin lamps, reflect its deep-rooted cultural heritage. Multan maintains a unique blend of ancient charm and a growing urban presence.");
                    break;
                case "Islamabad":
                    cityInfo.setText("Islamabad: As Pakistan’s purpose-built capital, Islamabad stands out for its modern architecture, clean layout, and serene natural surroundings. Located at the foothills of the Margalla Hills, the city offers a blend of urban living and nature, with green spaces like Daman-e-Koh and the Rawal Lake Park. It serves as the political and administrative center of the country, hosting the Parliament, Supreme Court, and foreign embassies. The city is known for its high standard of living, safety, and educational institutions like Quaid-i-Azam University. Islamabad’s planned infrastructure and tranquil ambiance offer a sharp contrast to the hustle of other major Pakistani cities.");
                    break;
            }
        }
    }
}