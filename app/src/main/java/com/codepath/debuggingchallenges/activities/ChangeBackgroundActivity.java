package com.codepath.debuggingchallenges.activities;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.codepath.debuggingchallenges.R;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private int oldColor = Color.BLUE;
    Button btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);
        btnGo = findViewById(R.id.btnGo);

        btnGo.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("LongLogTag")
            @Override
            public void onClick(View view) {
                String tag = "ChangeBackgroundActivity";
                Toast.makeText(getApplicationContext(), "Go button clicked", Toast.LENGTH_SHORT).show();
                View mainView = findViewById(android.R.id.content);
                mainView.setBackgroundColor(getNextColor());
            }
        });

    }

    private int getNextColor() {
        int newColor = (oldColor == Color.BLUE) ? Color.RED : Color.BLUE;
        oldColor = newColor;
        return newColor;
    }
}
