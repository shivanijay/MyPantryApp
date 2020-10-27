package com.example.mypantry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //call to the second activity
    public void takeToSecondScreen(View view) {
        Intent intent = new Intent(MainActivity.this, SecondScreen.class);
        startActivity(intent);
    }
}
