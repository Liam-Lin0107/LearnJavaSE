package class02;
// 多個棧內存指向相同堆內存
public class ArrayTest01 {
 public static void main(String[] args) {
  int[] arr = new int[3];
  arr[0] = 100;
  arr[1] = 200;
  arr[2] = 300;
  for (int i =0; i < arr.length; i++){
   System.out.println(arr[i]);
  }

  // 定一個個新的棧內存指向相同堆內存空間
  int[] arr2 = arr;
  arr2[0] = 111;
  arr2[1] = 222;
  arr2[2] = 333;
  for (int i =0; i < arr.length; i++){
   System.out.printf("arr[%d] : %d\n", i, arr[i]);
   System.out.printf("arr2[%d] : %d\n", i, arr[i]);
  }
 }
}
