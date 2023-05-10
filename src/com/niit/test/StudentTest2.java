package com.niit.test;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("输入学生姓名");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入学生id");
            int id = sc.nextInt();
            s.setId(id);
            System.out.println("请输入学生性别");
            String gender = sc.next();
            s.setGender(gender);

            list.add(s);

        }
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int id = list.get(i).getId();
            String gender = list.get(i).getGender();
            System.out.println(name+", "+id+", "+gender);
        }


    }
}
