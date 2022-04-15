package class01;

import java.util.ArrayList;

/*ArrayList 為一個可變數組(集合)
* 長度可變但內容須為單一類型
* 其中ArrayList中的<>指的是一種泛型用於指定存儲內容類型*/
public class ArrayListDemo01 {

    public static void main(String[] args) {
        // 創建一個空的ArrayList
        ArrayList<String> array = new ArrayList<>(); //new後面的<> 可寫可不寫內容

        // 末端添加元素
        array.add("Hello");
        array.add("World");

        // 指定位置增加元素
        array.add(1, "JavaSE");

        // 輸出集合
        System.out.println("Array : " + array);


    }
}
