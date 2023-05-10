package com.niit.test;

import java.util.ArrayList;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            User user = new User();
            System.out.println("输入用户姓名");
            String name = sc.next();
            user.setUsername(name);
            System.out.println("请输入用户id");
            String id = sc.next();
            user.setId(id);
            System.out.println("请输入密码");
            String password = sc.next();
            user.setPassword(password);

            list.add(user);
        }

        getMessage(list,"101");
    }


    public static void getMessage(ArrayList<User> list,String id){
        for (int i = 0; i < list.size(); i++) {
            if(id.equals(list.get(i).getId())){
                System.out.println("该用户的基本信息为"+list.get(i).getId()+", "+list.get(i).getUsername()+", "+list.get(i).getPassword());
                break;
            }
        }
        System.out.println("该用户不存在");
    }
}
