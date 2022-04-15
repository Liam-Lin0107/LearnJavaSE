package com.class05;

public class JumppingDemo {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Cat();
        jo.method(j);

        System.out.println("-----------------");
        // 採用匿名內部類
        // 好處是不用再寫一個類出來使用多態再帶入
        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("貓可以跳高了");
            }
        });

        jo.method(new Jumpping() {
            @Override
            public void jump() {
                System.out.println("狗可以跳高了");
            }
        });


    }

}
