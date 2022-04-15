package class05;
/*this 關鍵字指向成員變量
* 用於區分當方法中引數與成員變量名稱相同時賦值失敗*/
public class Student {
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void show(){
        System.out.println(this.name + " , " + this.age);
    }
}
