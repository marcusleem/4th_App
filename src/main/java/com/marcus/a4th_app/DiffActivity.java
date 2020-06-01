package com.marcus.a4th_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class DiffActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diff);
    }

        public void easy(View view){
            Intent intent = new Intent(this, Ex1.class);
            startActivity(intent);
        }

    public void medium(View view){
        Intent intent = new Intent(this, Ex1M.class);
        startActivity(intent);
    }

    public void hard(View view){
        Intent intent = new Intent(this, Ex1H.class);
        startActivity(intent);
    }


    }
