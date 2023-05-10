package com.niit.test;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("norman", 101, "男");
        Student s2 = new Student("mei", 101, "女");
        Student s3 = new Student("qian", 101, "女");

        list.add(s1);
        list.add(s2);
        list.add(s3);

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i).getName();
            int id = list.get(i).getId();
            String gender = list.get(i).getGender();
            System.out.println(name+", "+id+", "+gender);
        }

    }
}
