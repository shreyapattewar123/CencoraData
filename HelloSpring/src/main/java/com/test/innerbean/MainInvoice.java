package com.test.innerbean;

import com.pack.hello.Hellogreet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainInvoice {
    public static void main(String[] args) {
        ApplicationContext context =new ClassPathXmlApplicationContext("invoice.xml");
       // context.getBean("invoice");
        InvoiceGenerator obj = (InvoiceGenerator)context.getBean("invoice");
        obj.generateInvoice();
    }
}
