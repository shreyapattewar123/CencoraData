package com.pack.myexample.impl;

import com.pack.myexample.repo.Program;

public class CalculatorProgram implements Program {
    public CalculatorProgram() {
        System.out.println("CalculatorProgram constructor");
    }

    public void compile() {
        System.out.println("Compiling in CalculatorProgram");
    }
}