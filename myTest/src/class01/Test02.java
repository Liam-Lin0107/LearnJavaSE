package class01;

public class Test02 {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);
        set(i, 20);
        System.out.println(i);
        System.out.println("");
    }

    public static void set(int k, int j){
        k = j;
    }
}
