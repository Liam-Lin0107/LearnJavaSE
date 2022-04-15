public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("林大中");
        s.setAge(24);
        System.out.println(s); // 因為重寫了toString方法所以print的結果看得懂了
    }
}
