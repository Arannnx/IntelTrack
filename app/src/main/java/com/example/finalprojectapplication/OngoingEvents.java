package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OngoingEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_events);

        CardView certificationCard = findViewById(R.id.certi);

        certificationCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencertificationCard();
            }
        });

    }

    public void opencertificationCard() {
        Intent intent = new Intent(this, FragCertis.class);
        startActivity(intent);
    }

}
