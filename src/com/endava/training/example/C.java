package com.endava.training.example;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class C extends B {
    @Override
    public void f() {
        System.out.println("Hello from C!");
    }

    @Override
    public void f(int a) {
        System.out.println("Hello from C - 1 argument");
    }

    @Override
    public void f(int a, int b) {
        System.out.println("Hello from C - 2 arguments");
    }
}
