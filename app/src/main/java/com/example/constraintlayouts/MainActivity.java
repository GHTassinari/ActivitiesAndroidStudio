package com.example.constraintlayouts;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Button buttonBlog = findViewById(R.id.buttonBlog);
        Button buttonSeries = findViewById(R.id.buttonSeries);
        Button buttonTextContest = findViewById(R.id.buttonTextContest);

        buttonBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, BlogActivity.class);
                startActivity(intent);
            }
        });

        buttonSeries.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, SeriesActivity.class);
                startActivity(intent);
            }
        });

        buttonTextContest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, BestTextActivity.class);
                startActivity(intent);
            }
        });


    }
}