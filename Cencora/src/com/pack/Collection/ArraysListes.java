package com.pack.Collection;

import java.util.ArrayList;
import java.util.*;

public class ArraysListes {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("Shreya");
        list.add("Gaurav");
        System.out.println(list);
        System.out.println(list.get(0));
        list.add(1,"Riddhi");
        System.out.println(list);
        System.out.println(list.remove(0));
    }
}
