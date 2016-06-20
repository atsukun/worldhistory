package com.example.atsuhiro.worldhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class QuestionActivity1 extends AppCompatActivity {

    ImageQuestion[] imageQuestions;//画像の問題
    int count = 0;
    TextView questionText;
    Button button6;
    Button button7;
    Button button8;
    Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


        questionText = (TextView)findViewById(R.id.questions);

        button6 = (Button)findViewById(R.id.button6);

        button7 = (Button)findViewById(R.id.button7);

        button8 = (Button)findViewById(R.id.button8);

        button9 = (Button)findViewById(R.id.button9);

        imageQuestions = ImageQuestion.values();
        showQuestion(imageQuestions[count]);
    }

    // 問題を表示するためのメソッド
    private void showQuestion(ImageQuestion imageQuestion) {

    }

    private boolean isAnswer(String text) {
        return true;
    }



    private void makeQuestion(){

    }

}


