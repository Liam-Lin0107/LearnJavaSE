package com.class06;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        // 遍歷
        ListIterator<String> lit = array.listIterator();
        while(lit.hasNext()){
            String s = lit.next();
            System.out.println(s);
        }
        System.out.println("---------------");

        for(int i = 0; i < array.size(); i++){
            System.out.println(array.get(i));
        }
        System.out.println("---------------");

        for(String s : array){
            System.out.println(s);
        }


    }

}
