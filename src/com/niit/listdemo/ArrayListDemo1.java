package com.niit.listdemo;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        //泛型<>,限定集合中存储数据的类型
        ArrayList<String> list = new ArrayList<String>();

        //此时我们创建的是arraylist对象，而arraylist是java写好的一个类
        //这个类在底层代码中做了一些处理
        //打印对象不是地址值，而是集合中存储的数据内容
        //展示的时侯，会使用方括号[]将所有数据进行包裹
        System.out.println(list);
    }
}
