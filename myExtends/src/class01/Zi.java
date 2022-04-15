package class01;

public class Zi extends Fu{
    public int age = 20;

    public Zi(){}
    public Zi(int age){
        super(30);
        this.age = age;
    }
    public void show(){
        System.out.println(this.age);
        System.out.println(super.age);
    }
}
