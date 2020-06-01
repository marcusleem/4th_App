package com.marcus.a4th_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class HowToCrunch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_crunch);

    }

    public void back(View view) {
        Intent intent = new Intent(this,ExerciseActivity.class);
        startActivity(intent);
    }
}