package com.example.basicintroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static String Tag = "Activity-LifeCycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button _gotoSecondPage = findViewById(R.id.button);
        final Intent secondScreenIntent = new Intent(this, SecondActivity.class);

        Log.i(Tag, "On Create");

        _gotoSecondPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(secondScreenIntent);

            }
        });

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Tag, "On start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Tag, "On Resume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Tag, "On Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Tag, "On Pause");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Tag, "On Destroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(Tag, "On Restart");
    }

}
