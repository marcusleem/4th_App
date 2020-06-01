package com.marcus.a4th_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private Button logout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();

        logout = (Button)findViewById(R.id.btnLogout);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Logout();
            }
        });

        ImageButton onClickHome = (ImageButton) findViewById(R.id.home);
        ImageButton onClickExercise = (ImageButton) findViewById(R.id.exercise);
        ImageButton onClickBMI = (ImageButton) findViewById(R.id.bmi);
        ImageButton onClickBMIRecord = (ImageButton) findViewById(R.id.bmirecord);



        onClickHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        onClickExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExerciseActivity.class);
                startActivity(intent);
            }
        });

        onClickBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BMIActivity.class);
                startActivity(intent);
            }
        });

        onClickBMIRecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BMIRecord.class);
                startActivity(intent);
            }
        });
    }

    public void start(View view) {
        Intent intent = new Intent(this,DiffActivity.class);
        startActivity(intent);
    }
    private void Logout(){
        firebaseAuth.signOut();
        finish();
        startActivity(new Intent(MainActivity.this, FirstActivity.class));
    }


    public void logout(View view) {
        Intent intent = new Intent(this, FirstActivity.class);
        startActivity(intent);
    }
}
