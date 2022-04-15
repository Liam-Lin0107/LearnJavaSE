package StudentManagerProject;

public class Student {
    private String sid;
    private String name;
    private String age;
    private String address;

    public Student(){};

    public Student(String sid, String name, String age, String address){
        this.sid = sid;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // sid 操作
    public void setSid(String sid){ this.sid = sid;}
    public String getSid(){ return sid;}

    // name 操作
    public void setName(String name){ this.name = name;}
    public String getName(){ return name;}

    // age 操作
    public void setAge(String age){ this.age = age;}
    public String getAge(){ return age;}

    // address 操作
    public void setAddress(String address){ this.address = address;}
    public String getAddress(){ return address;}
}
