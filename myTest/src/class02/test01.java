package class02;

import java.util.ArrayList;
import java.util.Random;

public class test01 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            int x = (int)(Math.random()*10) + 1;
            arrayList.add(x);
        }
        for (int i = 0; i <arrayList.size(); i++){
            if(arrayList.get(i) == 0){
                System.out.println("裡面有0");
            }
        }
    }
}