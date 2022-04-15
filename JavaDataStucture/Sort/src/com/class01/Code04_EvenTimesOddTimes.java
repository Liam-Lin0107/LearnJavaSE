package com.class01;

public class Code04_EvenTimesOddTimes {

    public static void printOddTimesNum1(int[] arr){
        int eor = 0;
        for (int i : arr){
            eor ^= i;
        }
        System.out.println("奇數為 : " + eor);
    }

    public static void printOddTimesNum2(int[] arr){
        int eor = 0;
        for (int i : arr) {
            eor ^= i; // 得到eor = a^b
        }


        // eor必不為零, 所以必存在1
        // 故提取eor最右邊的1, 將數組分兩類, 右邊或左邊單獨異或, 可得a or b
        int rightOne = eor & (~(eor + 1));

        int onlyOne = 0; // onlyOne是目標：a or b
        for (int i : arr){
            if ((i & rightOne) == 0){
                onlyOne ^= i;
            }
        }
        System.out.println("兩個數為 : " + onlyOne + " ," + (onlyOne^eor));
    }
}
