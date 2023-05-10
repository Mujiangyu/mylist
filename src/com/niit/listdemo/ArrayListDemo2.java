package com.niit.listdemo;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        //添加boolean add(E e)

        //修改boolean remove(E e)
        //E remove(int index)

        //修改 E set(int index, E e)

        //查询 E get(int index)
        //int size()


        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
//        System.out.println(list);

        //3.删除元素
//        boolean result = list.remove("aaa");
//        System.out.println(result);
//        System.out.println(list);
        //根据索引删除,remove(index)会返回删除的元素
//        String str = list.remove(1);
//        System.out.println(str);
//        System.out.println(list);

        //4.修改元素,返回旧的数据值，并用新的数据值覆盖原来的数据
//        String result = list.set(1,"xxx");
//        System.out.println(list);
//        System.out.println(result);

        //5.查询元素
//        String str = list.get(0);
//        System.out.println(str);

        //6.利用size()方法遍历集合的元素
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }



}
