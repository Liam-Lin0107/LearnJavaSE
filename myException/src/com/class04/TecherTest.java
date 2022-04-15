package com.class04;

public class TecherTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();

        try{
        teacher.checkScore(101); // 因為是顯示型異常要使用try catch
        }catch (ScoreExpection e){
            e.printStackTrace();
        }
    }
}
