package com.example.basicintroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private static String Tag = "Activity-LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i(Tag, "On Create - Second Activity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "On Resume - Second Activity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "On Stop - Second Activity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "On Pause - Second Activity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "On Destroy - Second Activity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "On Restart - Second Activity");
    }
}
