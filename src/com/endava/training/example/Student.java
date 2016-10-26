package com.endava.training.example;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class Student extends Person { /* We need a default constructor in parent class */

    int year;
    int exams;

    public Student() {
        System.out.println("Hello from constructor with no arguments!");
    }

    public Student(int year) {
        System.out.println("Hello from constructor with 1 argument!");
    }

    public Student(int year, int exams) {
        System.out.println("Hello from constructor with 2 arguments!");
    }
}
