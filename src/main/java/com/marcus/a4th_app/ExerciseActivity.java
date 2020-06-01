package com.marcus.a4th_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ExerciseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        ImageButton onClickHome = (ImageButton) findViewById(R.id.home);
        ImageButton onClickExercise = (ImageButton) findViewById(R.id.exercise);
        ImageButton onClickBMI = (ImageButton) findViewById(R.id.bmi);
        ImageButton onClickPush = (ImageButton) findViewById(R.id.pushup);
        ImageButton onClickPlank = (ImageButton) findViewById(R.id.plank);
        ImageButton onClickCrunch = (ImageButton) findViewById(R.id.crunch);
        ImageButton onClickCrunch2 = (ImageButton) findViewById(R.id.crunch2);
        ImageButton onClickSquat = (ImageButton) findViewById(R.id.squat);
        ImageButton onClickLunge = (ImageButton) findViewById(R.id.lunge);
        ImageButton onClickBMIRecord = (ImageButton) findViewById(R.id.bmirecord);

        onClickPush.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToPush.class);
                startActivity(intent);
            }
        });

        onClickPlank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToPlank.class);
                startActivity(intent);
            }
        });

        onClickCrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToCrunch.class);
                startActivity(intent);
            }
        });

        onClickCrunch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToCrunch2.class);
                startActivity(intent);
            }
        });

        onClickSquat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToSquat.class);
                startActivity(intent);
            }
        });

        onClickCrunch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToCrunch.class);
                startActivity(intent);
            }
        });

        onClickLunge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, HowToLunge.class);
                startActivity(intent);
            }
        });

        onClickExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

        onClickBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, BMIActivity.class);
                startActivity(intent);
            }
        });

        onClickHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        onClickBMIRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExerciseActivity.this, BMIRecord.class);
                startActivity(intent);
            }
        });
    }
}
