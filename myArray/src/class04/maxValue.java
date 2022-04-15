package class04;

public class maxValue {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        // 將數組第一個數當作初始值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
