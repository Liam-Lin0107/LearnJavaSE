package class01;
import java.util.Scanner;

public class DebugTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入第一個整數：");
        int a = scanner.nextInt();
        System.out.println("請輸入第二個整數：");
        int b = scanner.nextInt();

        int max = getMax(a, b);
        System.out.println("最大值為 ： " + max);
    }

    public static int getMax(int a, int b){
        if (a >= b){
            return a;
        }else{
            return b;
        }
    }
}
