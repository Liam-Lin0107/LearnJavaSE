package class01;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個字串：");

        // 可以使用option + enter * 3 就可以自動生成左邊
        // windows : ctrl + alt + v
        String line = scanner.nextLine();


        System.out.println("你輸入的是：" + line);
    }
}
