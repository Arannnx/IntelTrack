package com.example.finalprojectapplication;

import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class HtmlCss extends AppCompatActivity {

    private static final String CHANNEL_ID = "NotificationChannel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_css);

        Button scheduleNotificationButton = findViewById(R.id.button_schedule_notification);
        scheduleNotificationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scheduleNotification();
            }
        });

        createNotificationChannel();
    }

    private void scheduleNotification() {
        // Set the specific date and time
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024); // Year
        calendar.set(Calendar.MONTH, Calendar.MAY); // Month (zero-based)
        calendar.set(Calendar.DAY_OF_MONTH, 28); // Day
        calendar.set(Calendar.HOUR_OF_DAY, 05); // Hour
        calendar.set(Calendar.MINUTE, 30); // Minute
        calendar.set(Calendar.SECOND, 0); // Second

        long notificationTime = calendar.getTimeInMillis();

        if (notificationTime < System.currentTimeMillis()) {
            showToast("This event is TBA");
            return;
        }

        Intent notificationIntent = new Intent(this, NotificationReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                this,
                0,
                notificationIntent,
                PendingIntent.FLAG_IMMUTABLE
        );

        AlarmManager alarmManager = (AlarmManager) getSystemService(Context.ALARM_SERVICE);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setExactAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, notificationTime, pendingIntent);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            alarmManager.setExact(AlarmManager.RTC_WAKEUP, notificationTime, pendingIntent);
        } else {
            alarmManager.set(AlarmManager.RTC_WAKEUP, notificationTime, pendingIntent);
        }

        showToast("Notification scheduled for " + calendar.getTime().toString());
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "Notification Channel";
            String description = "Channel for notification reminders";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, name, importance);
            channel.setDescription(description);

            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    private void showToast(String message) {
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toast, findViewById(R.id.toast_text));

        TextView text = layout.findViewById(R.id.toast_text);
        text.setText(message);

        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
