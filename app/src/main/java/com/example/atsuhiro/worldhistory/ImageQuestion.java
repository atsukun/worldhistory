package com.example.atsuhiro.worldhistory;

import android.widget.Button;

/**
 * 画像のクイズ
 */
public enum ImageQuestion {
    Question1(R.mipmap.ic_launcher, "問題１", new String[]{"", "", ""})
    // Question1(R.mipmap.問題画像, "問題の答え", new String[]{"選択し１", "選択し２", "選択し３"}
    ;
    public int questionImage;
    public String answer;
    public String[] choices;
    public Button button6;
    public Button button7;
    public Button button8;
    public Button button9;

    ImageQuestion(int questionImage, String answer, String[] choices) {
        this.questionImage = questionImage;
        this.answer = answer;
        this.choices = choices;



    }
}


