package com.example.githubtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Hello world", Toast.LENGTH_SHORT).show();

        Log.d("TAG", "Hello world log");
        Log.d("TAG", "Hello world log2");

    }
}