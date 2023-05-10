package com.niit.test;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        //添加数字元素，由于arraylist不能直接添加基本数据类型，必须将基本数据类型装换成其对应的包装类
        //int -->Integger
        //char -->Character
        //其余的基本数字类型只需将其开头的字母大写即可
        ArrayList<Integer> list = new ArrayList<>();
        list.add(123);
        list.add(456);
        list.add(789);
        list.add(000);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if(i == list.size() - 1){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i)+", ");
            }
        }
        System.out.println("]");

    }
}
