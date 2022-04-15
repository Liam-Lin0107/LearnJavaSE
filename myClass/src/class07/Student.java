package class07;
/*標準類建構
* 成員變量
*   使用private修飾
* 構造方法
*   提供一個參數構造方法
*   提供個帶參數構造方法
* 成員方法
*   提供每一個成員變量set 與 get方法
*   提供呈現訊息的show方法
* */
public class Student {
    private String name;
    private int age;


    // 構造方法
    public Student(){
        this("林大中", 25);

    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + " ," + age);
    }

}
