package com.example.finalprojectapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FutureEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_events);

        CardView certiCard = findViewById(R.id.certification);
        CardView exhibitCard = findViewById(R.id.exhibit);
        CardView DatabaseCard = findViewById(R.id.database);
        CardView CyberSecurityCard = findViewById(R.id.cybersecurity);
        CardView htmlcssCard = findViewById(R.id.html);
        CardView portfolioCard = findViewById(R.id.portfolio);
        CardView recognitionCard = findViewById(R.id.recognition);

        certiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opencerti();
            }
        });

        exhibitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openexhibitCard();
            }
        });

        DatabaseCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDatabaseCard();
            }
        });

        CyberSecurityCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCyberSecurityCard();
            }
        });

        htmlcssCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhtmlcssCard();
            }
        });

        portfolioCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openportfolioCard();
            }
        });

        recognitionCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openrecognitionCard();
            }
        });


    }

    public void opencerti() {
        Intent intent = new Intent(this, Certification.class);
        startActivity(intent);
    }

    public void openexhibitCard() {
        Intent intent = new Intent(this, Certification.class);
        startActivity(intent);
    }

    public void openDatabaseCard() {
        Intent intent = new Intent(this, Database.class);
        startActivity(intent);
    }

    public void openCyberSecurityCard() {
        Intent intent = new Intent(this, CyberSecurity.class);
        startActivity(intent);
    }

    public void openhtmlcssCard() {
        Intent intent = new Intent(this, HtmlCss.class);
        startActivity(intent);
    }

    public void openportfolioCard() {
        Intent intent = new Intent(this, Portfolio.class);
        startActivity(intent);
    }

    public void openrecognitionCard() {
        Intent intent = new Intent(this, Recognition.class);
        startActivity(intent);
    }

}
