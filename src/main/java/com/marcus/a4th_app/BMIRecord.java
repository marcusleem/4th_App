package com.marcus.a4th_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class BMIRecord extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        ImageButton onClickHome = (ImageButton) findViewById(R.id.home);
        ImageButton onClickExercise = (ImageButton) findViewById(R.id.exercise);
        ImageButton onClickBMI = (ImageButton) findViewById(R.id.bmi);
        ImageButton onClickBMIRecord = (ImageButton) findViewById(R.id.bmirecord);



        onClickHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIRecord.this, MainActivity.class);
                startActivity(intent);
            }
        });

        onClickExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIRecord.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

        onClickBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIRecord.this, BMIActivity.class);
                startActivity(intent);
            }
        });

        onClickBMIRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIRecord.this, BMIRecord.class);
                startActivity(intent);
            }
        });
    }
}

