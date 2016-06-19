package com.example.atsuhiro.worldhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class QuestionActivity1 extends AppCompatActivity {

    ImageQuestion[] imageQuestions;//画像の問題
    int count = 0;
    TextView textView2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

        textView2 = (TextView) findViewById(R.id.question1);

        imageQuestions = ImageQuestion.values();
        showQuestion(imageQuestions[count]);
    }

    // 問題を表示するためのメソッド
    private void showQuestion(ImageQuestion imageQuestion) {

    }

    private boolean isAnswer(String text) {
        return true;
    }

}
