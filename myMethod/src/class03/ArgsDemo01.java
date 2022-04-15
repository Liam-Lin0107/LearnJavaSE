package class03;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int num = 100;
        System.out.println("調用change方法前：" + num);
        change(num);
        System.out.println("調用change方法後：" + num);

    }

    public static void change(int num){
        num = 200;
    }
}
