package com.pack.myexample;

import com.pack.myexample.impl.Jvm;
import com.pack.myexample.model.Dev;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev dvob =(Dev) context.getBean("dev");
        dvob.build();


    }
}