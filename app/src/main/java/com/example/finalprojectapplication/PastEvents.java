package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PastEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_events);

        CardView certificationCard = findViewById(R.id.fragmentcertification);

        certificationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencertificationCard();
            }
        });
    }

    public void opencertificationCard() {
        Intent intent = new Intent(this, FragmentCertifications.class);
        startActivity(intent);
    }
}