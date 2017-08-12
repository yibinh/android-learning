package com.example.client.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Activity Lifecycle";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "========This is onCreate=========");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "========This is onStart=========");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "========This is onRestart=========");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "========This is onResume=========");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "========This is onPause=========");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "========This is onStop=========");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "========This is onDestroy=========");
    }
}
