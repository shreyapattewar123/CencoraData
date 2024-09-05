package com.pack.myexample.impl;

import com.pack.myexample.repo.Program;

public class Jvm implements Program {
    public Jvm() {
        System.out.println("Jvm Constructor");
    }

    public void compile() {
        System.out.println("Compiling Program jvm");
    }
}
