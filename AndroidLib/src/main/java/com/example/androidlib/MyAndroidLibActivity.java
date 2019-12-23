package com.example.androidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyAndroidLibActivity extends AppCompatActivity {
    public static final String JOKE_KEY = "Joke_Intent_Key";
    private TextView displayJoke;
    private String jokeString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_android_lib);
        //getting the intent and display the joke.
        if (getIntent().hasExtra(MyAndroidLibActivity.JOKE_KEY)) {
            jokeString = getIntent().getStringExtra(MyAndroidLibActivity.JOKE_KEY);
            displayJoke = findViewById(R.id.joke_text_view);
            displayJoke.setText(jokeString);
        }
    }
}
