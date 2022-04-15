package class02;

import java.util.Scanner;

public class StringTest01 {
    public static void main(String[] args) {
        String username = "itheima";
        String password = "czbk";

        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入用戶名稱：");
        String name = scanner.nextLine();

        System.out.print("請輸入密碼名稱：");
        String psw = scanner.nextLine();

        if (name.equals(username) && psw.equals(password)){
            System.out.println("登入成功");
        }else {
            System.out.println("登入失敗");
        }
    }
}
