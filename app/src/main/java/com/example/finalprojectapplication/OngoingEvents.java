package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OngoingEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_events);

        CardView certiCard = findViewById(R.id.certification);

        certiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencerti();
            }
        });


    }

    public void opencerti() {
        Intent intent = new Intent(this, Certification.class);
        startActivity(intent);
    }

}
