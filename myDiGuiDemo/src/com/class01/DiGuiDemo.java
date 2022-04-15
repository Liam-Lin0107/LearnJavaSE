package com.class01;

public class DiGuiDemo {
    // 不死神兔問題, 求地20個月有幾隻
    // 每個月有幾對: 1,1,2,3,5,8,.......
    public static void main(String[] args) {
        System.out.println(unDiedRabbit(50));
    }

    public static long unDiedRabbit(int month){
        if (month == 1){
            return 1;
        }
        if(month == 2){
            return 1;
        }
        return unDiedRabbit(month - 1) + unDiedRabbit(month - 2);
    }
}
