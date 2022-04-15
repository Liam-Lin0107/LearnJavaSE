package class01;

public class MethodDemo {
    public static void main(String[] args) {
        /*為何在main方法中調用呢？
        * 因為main方法是程序的入口方法
        */
        isEvenNumber(20);
        isEvenNumber(15);
    }

    // 方法：一個判定是否為偶數
    public static void isEvenNumber(int number){
        if (number % 2 == 0){
            System.out.println("偶數");
        }
        else {
            System.out.println("基數");
        }
    }
}
