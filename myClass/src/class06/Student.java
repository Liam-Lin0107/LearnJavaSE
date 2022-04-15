package class06;
/*構造方法
* 主要目的是用於對成員變量進行初始化
格式：
public 類名(參數){
}
 */
public class Student {
    private String name;
    private int age;

    // 構造方法
    public Student(){
        System.out.println("無參數構造方法");
    }
    public void show(){
        System.out.println(name + " ," + age);
    }
}
