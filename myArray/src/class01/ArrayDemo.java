package class01;

public class ArrayDemo {
    public static void main(String[] args) {
        // 動態初始化
        int[] arr = new int[3];
        // 輸出數組名稱
        System.out.println(arr); // [I@4617c264 : 為內存空間的位置名稱



        // 輸出數組中的元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // 數組賦值
        arr[0] = 100;
        arr[2] = 200;
        // 輸出數組名稱
        System.out.println(arr); // [I@4617c264 : 為內存空間的位置名稱
        // 輸出數組中的元素
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}