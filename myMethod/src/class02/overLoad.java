package class02;

public class overLoad {
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2.2f, 4.5f));
        System.out.println(sum(3,4,5));
    }

    /*方法重載
    * -多個方法在同一個類當中
    * -多個方法有相同名稱
    * -多個方法參數不同,類型不同或數量不同
    * 注意：回傳值的格式不同不能判定為重載*/

    // 求兩個int的和
    public static int sum(int a, int b){
        return a + b;
    }
    // 求兩個float的和
    public static float sum(float a, float b){
        return a + b;
    }
    // 求三個int的和
    public static int sum(int a, int b, int c){
        return a + b + c;
    }

}
