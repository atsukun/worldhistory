package com.example.atsuhiro.worldhistory;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class QuestionActivity1 extends AppCompatActivity {

    ImageQuestion[] imageQuestions;//画像の問題
    int count = 0;
    TextView questionText;
    String questionTexts;
    Random random = new Random();
    int number = random.nextInt(4);
    ImageView questionImageView;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    String tu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);


        questionText = (TextView)findViewById(R.id.questionText);

        questionImageView = (ImageView)findViewById(R.id.questionImageView);

        button6 = (Button)findViewById(R.id.button6);

        button7 = (Button)findViewById(R.id.button7);

        button8 = (Button)findViewById(R.id.button8);

        button9 = (Button)findViewById(R.id.button9);

        imageQuestions = ImageQuestion.values();
        showQuestion(imageQuestions[count]);


    }

    public void questionText(View v){





    }

    public void choices(View v){
        number= random.nextInt(4);
        questionText.setText(String.valueOf(questionTexts));

        if (number==0){

            questionText.setText("aiueo");
            button6.setText("tu");
            button7.setText("we");
            button8.setText("qi");
            button9.setText("su");

           boolean answer = true;

        }




    }




    // 問題を表示するためのメソッド
    private void showQuestion(ImageQuestion imageQuestion) {

    }

    private boolean isAnswer(String text) {
        return true;
    }




}


