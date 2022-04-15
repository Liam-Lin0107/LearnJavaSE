package class04;

public class Student {
    String name;
    private int age;

    public void setAge(int age){
        this.age = age;
    }

    public void getAge(){
        System.out.println(age);
    }

    public void show(){
        System.out.println(name + " ," + age);
    }
}
