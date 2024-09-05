package com.pack.myexample;

import com.pack.myexample.config.StudentConf;
import com.pack.myexample.model.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
     var conf = StudentConf.class;
     try(var context =new AnnotationConfigApplicationContext(conf)){
         var studentobj =context.getBean("GetStudents", Student.class);
         System.out.println(studentobj);

     }

    }
}