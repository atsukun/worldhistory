package com.example.atsuhiro.worldhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView result;
    int number;
    int number2;
    int number3;
    boolean check;
    ImageButton sketch1;
    ImageButton sketch2;
    ImageButton sketch3;
    ImageButton sketch4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView) findViewById(R.id.result);
        sketch1 = (ImageButton) findViewById(R.id.sketch1);
        sketch2 = (ImageButton) findViewById(R.id.sketch2);
        sketch3 = (ImageButton) findViewById(R.id.sketch3);
        sketch4 = (ImageButton) findViewById(R.id.sketch4);


    }

    public void questions(View v) {

    }
}
