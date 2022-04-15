package class01;
/*String vs. StringBuilder的差異
* String 是不可變的如果做字串拼接 每次拼接都要耗費堆內存導致內存浪費
* String 是可變容器 做字串拼接時不會浪費內存也比較有效率*/
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        // 創建一個可變的空白字符串
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("StringBuilder : " + stringBuilder);
        System.out.println("length : " + stringBuilder.length());
        // 創建一個可變的有內容的字符串
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        System.out.println("StringBuilder1 : " + stringBuilder1);
        System.out.println("length : " + stringBuilder1.length());
        // 添加字符串
        stringBuilder1.append(" world").append(" java");
        System.out.println("StringBuilder1 : " + stringBuilder1);
        System.out.println("length : " + stringBuilder1.length());
        // 反轉字串
        stringBuilder1.reverse();
        System.out.println("Stringbuilder1 : " + stringBuilder1);
        // 轉換成String
        String s = stringBuilder1.toString();
        System.out.println("String : "+ s);
    }
}
