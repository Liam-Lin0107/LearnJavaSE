package com.class04;
/*匿名內部類 <-- 為一種內部類
* 條件
* 1. 存在一個類或一個接口*/
public class Outer {
    public void method(){
        new Inter(){
            @Override
            public void show() {
                System.out.println("匿名內部類");
            }
        }.show(); // <-- 這是一個對象 因為 new Inter() 所以後面假.show()就可以調用



        // 實現多次使用
        Inter i = new Inter(){
            @Override
            public void show() {
                System.out.println("匿明內部類");
            }
        };

        i.show();
        i.show();


    }


}
