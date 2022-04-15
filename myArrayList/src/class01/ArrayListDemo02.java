package class01;

import java.util.ArrayList;

public class ArrayListDemo02 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("Hello");
        array.add("World");
        array.add("JavaSE");
        System.out.println("array : " + array);
        // 刪除指定元素
        array.remove("World");
        System.out.println("array : " + array);
        // 刪除指定位置元素
        array.remove(1);
        System.out.println("array : " + array);
        // 修改指定索引的元素
        array.set(0, "hello");
        System.out.println("array : " + array);
        // 查找指定索引的元素
        System.out.println("Sting : " + array.get(0));

        // 元素個數
        System.out.println("Size : " + array.size());
    }
}
