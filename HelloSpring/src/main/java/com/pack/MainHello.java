package com.pack;

import com.pack.hello.Hellogreet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("hello.xml");
    context.getBean("ticket");
        Hellogreet obj = (Hellogreet)context.getBean("ticket");
        obj.display();

    }


}
