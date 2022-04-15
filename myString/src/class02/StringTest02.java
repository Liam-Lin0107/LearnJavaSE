package class02;

import java.util.Scanner;

/*需求：
*   鍵盤輸入一段字符串，統計字符串中的大寫、小寫、數字分別的個數*/
public class StringTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入字符串：");
        String line = scanner.nextLine();

        int uppercase = 0, lowercase = 0, number = 0;

        for (int i = 0; i < line.length(); i++){
            int ch = line.charAt(i);
            if (ch >= 'A' && ch <= 'Z'){
                uppercase++;
            }else if (ch >= 'a' && ch <= 'z'){
                lowercase++;
            }else if (ch >= '0' && ch <= '9'){
                number++;
            }else{
                System.out.println("內容格式不正確");
            }

        }
        System.out.println("uppercase: " + uppercase);
        System.out.println("lowercase: " + lowercase);
        System.out.println("numbercase: " + number);


    }
}
