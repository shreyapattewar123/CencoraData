package com.test.setterbased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("student.xml");
        context.getBean("student");
        Student obj = (Student) context.getBean("student");
        obj.display();
    }
}
