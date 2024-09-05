package sample.autowireall;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sample.autowireall.model.Customer;
import sample.autowireall.model.Order;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Object bean= context.getBean("customer");
        context.close();
        System.out.println((Customer)bean);
         List<Order> list = new ArrayList<>();
         list.add(((Customer)bean).getOrders2());
        list.add(((Customer)bean).getOrders());
        System.out.println(list);
    }
}
