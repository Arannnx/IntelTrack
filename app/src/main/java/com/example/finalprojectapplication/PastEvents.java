package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class PastEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_events);

        // Find the CardView with the correct ID
        CardView certificationCard = findViewById(R.id.certi);

        // Set a click listener for the CardView
        certificationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Open the FragmentCertifications activity
                openCertificationActivity();
            }
        });
    }

    // Method to open the FragmentCertifications activity
    private void openCertificationActivity() {
        Intent intent = new Intent(this, PastEvents.class);
        startActivity(intent);
    }
}
