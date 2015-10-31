package io.petchat.example.androidlibrarydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.petchat.example.mylibrary.MyMath;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(this.getClass().toString(), "==>" + MyMath.add(1, 1));

    }
}
