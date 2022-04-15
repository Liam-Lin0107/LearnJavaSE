package class01;
/*
* 類的定義步驟
*   定義類
*   編寫類的成員變量
*   編寫類的成員方法*/
public class Phone {
    // 成員變量
    public String brand;
    public int price;

    // 成員方法
    public void call(){
        System.out.println("打電話");
    }

    public void sendMassage(){
        System.out.println("發短信");
    }
}
