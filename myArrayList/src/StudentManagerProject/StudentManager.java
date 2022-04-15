package StudentManagerProject;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            int choice = enterSystem();
            if (choice == 1){
                addStudent(students);
            }else if (choice == 2){
                deletStudent(students);
            }else if (choice == 3){
                updateStudent(students);
            }else if (choice == 4){
                findAllStudent(students);
            }else if (choice == 5){
                System.out.println("系統關閉中....  謝謝您的使用");
                break;
            }else{
                System.out.println("輸入錯誤  請再確認後重新輸入");
                continue;
            }
        }
    }

    // 定義系統訪問目錄
    public static int enterSystem(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----歡迎來到學生管理系統-----");
        System.out.print("1. 添加學生\n" +
                "2. 刪除學生\n" +
                "3. 修改學生\n" +
                "4. 查看所有學生\n" +
                "5. 退出系統\n" +
                "請輸入操作：");
        int choice = scanner.nextInt();
        System.out.println("");
        return choice;
    }
    // 定義方法用於添加學生訊息
    public static void addStudent(ArrayList<Student> students){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入學號 : ");
        String sid = scanner.nextLine();
        student.setSid(sid);


        System.out.print("請輸入姓名 : ");
        String name = scanner.nextLine();
        student.setName(name);


        System.out.print("請輸入年齡 : ");
        String age = scanner.nextLine();
        student.setAge(age);


        System.out.print("請輸入住址 : ");
        String address = scanner.nextLine();
        student.setAddress(address);

        System.out.println("匯入成功");
        System.out.println("");
        students.add(student);
    }
    // 定義方法用於查看學生訊息
    public static void findAllStudent(ArrayList<Student> students){
        if (students.size() > 0){
            System.out.println("所有學生資料如下：");
            System.out.println("學號\t\t姓名\t\t年齡\t\t住址");
            for (int i = 0; i < students.size(); i++){
                System.out.println(
                        students.get(i).getSid() + "\t\t"
                                + students.get(i).getName() + "\t\t"
                                +students.get(i).getAge() + "\t\t"
                                +students.get(i).getAddress());
            }
        }else {
            System.out.println("尚未有學生訊息  請先添加訊息");
        }

        System.out.println("");
    }
    // 定義方法用於刪除學生訊息
    public static void deletStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要刪除學生的學號 : ");
        String sid = scanner.nextLine();
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);
            if (student.getSid().equals(sid)){
                students.remove(i);
                System.out.println("刪除成功");
            }
        }
    }
    // 定義方法用於修改學生訊息
    public static void updateStudent(ArrayList<Student> students){
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要修改學生學號 : ");
        String sid = scanner.nextLine();
        for (int i = 0; i < students.size(); i++){
            Student student = students.get(i);

            if (student.getSid().equals(sid)){
                System.out.print("請輸入新學號 : ");
                String sidnumber = scanner.nextLine();
                student.setSid(sidnumber);


                System.out.print("請輸入新姓名 : ");
                String name = scanner.nextLine();
                student.setName(name);


                System.out.print("請輸入新年齡 : ");
                String age = scanner.nextLine();
                student.setAge(age);


                System.out.print("請輸入新住址 : ");
                String address = scanner.nextLine();
                student.setAddress(address);
            }

        }
        System.out.println("修改完成");
        System.out.println("");

    }
}
