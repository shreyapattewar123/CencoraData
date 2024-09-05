package com.pack.Collection;

import java.util.ArrayList;
import java.util.*;

class Student{
    int id ;
    String name;
    String course;
    public Student(int id,String name,String course){
        this.id=id;
        this.name=name;
        this.course=course;


    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
public class StudentArrayList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Shreya","java"));
        System.out.println(list);
        ArrayList<Integer> l = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        l.add(1);
        l.add(1);
        l.add(2);
        System.out.println(l);
       Set<Integer> s = new HashSet<>(l);
        System.out.println(s);

    }
}
