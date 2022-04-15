package class02;

public class Demo {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call("林大中");
        System.out.println("---------");
        NewPhone newPhone = new NewPhone();
        newPhone.call("林大中");
    }
}
