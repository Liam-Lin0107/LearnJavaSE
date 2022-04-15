package class01;

public class MaxInTwoNumber {
    public static void main(String[] args) {
        getMax(20, 20);

    }

    public static void getMax(int number1, int number2){
        if (number1 > number2){
            System.out.println(number1);
        }else if (number1 == number2){
            System.out.println("相等");
        }else{
            System.out.println(number2);
        }
    }
}
