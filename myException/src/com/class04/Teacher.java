package com.class04;

public class Teacher {
    public void checkScore(int score) throws ScoreExpection{
        if (score < 0 || score > 100){
            throw new ScoreExpection();
        }else{
            System.out.println("分數正常");
        }
    }
}
