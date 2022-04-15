package class02;

public class NewPhone extends Phone{

    @Override // 用於檢查重寫方法有沒有出錯的註解 不打也沒關係但容易出錯
    public void call(String name){
        System.out.println("點亮螢幕");
        super.call(name);
    }
}
