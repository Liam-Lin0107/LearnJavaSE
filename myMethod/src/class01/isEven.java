package class01;

public class isEven {
    public static void main(String[] args) {
        boolean ans = isEvenNumber(20);
        System.out.println(ans);
    }

    public static boolean isEvenNumber(int num){
        if (num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
