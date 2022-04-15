package class01;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone phone = new Phone();

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.brand = "小米";
        phone.price = 2999;

        System.out.println(phone.brand);
        System.out.println(phone.price);

        phone.call();
        phone.sendMassage();
    }
}
