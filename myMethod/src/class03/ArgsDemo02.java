package class03;

public class ArgsDemo02 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("調用方法前： " + arr[1]);
        change(arr, 1);
        System.out.println("調用方法後: " + arr[1]);
        /*在執行中所有行都進入棧內存所以一行執行完之後就會消失
         * 但數組資料會進入堆內存
         * 故會長期保存所以在方法裡面改動是會改變數組內容的
         * */
    }

    public static void change(int[] arr, int i){
        arr[i] = 200;
    }
}
