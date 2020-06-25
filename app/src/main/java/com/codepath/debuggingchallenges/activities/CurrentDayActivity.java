package com.codepath.debuggingchallenges.activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.codepath.debuggingchallenges.R;

import java.util.Calendar;

public class CurrentDayActivity extends AppCompatActivity {

    TextView tvDay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_day);
        tvDay = findViewById(R.id.tvDay);
        tvDay.setText(getDayOfMonth());
    }

    private String getDayOfMonth() {
        Calendar cal = Calendar.getInstance();
        String day = String.valueOf(cal.get(Calendar.DAY_OF_MONTH));
        return day;
    }
}
