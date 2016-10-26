package com.endava.training;

import com.endava.training.example.A;
import com.endava.training.example.B;
import com.endava.training.example.C;
import com.endava.training.example.Student;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello OOP!");

        Circle c = new Circle();
        c.r = 10;
        System.out.println("Circle perimeter: " + c.computePerimeter());
        System.out.println("Circle area: " + c.computeArea());

        Square s = new Square();
        s.l = 10;
        System.out.println("Square perimeter: " + s.computePerimeter());
        System.out.println("Square area: " + s.computeArea());

        Triangle t = new Triangle();
        t.l1 = 10;
        t.l2 = 12;
        t.l3 = 15;
        System.out.println("Triangle perimeter: " + t.computePerimeter());
        System.out.println("Triangle area: " + t.computeArea());

        Student s1 = new Student();
        Student s2 = new Student(2);
        Student s3 = new Student(3, 2);

        A a = new B();
        a.f();

        B b = new C();
        b.f();

        A a1 = new C();
        a1.f();

        B b1 = new C();
        b1.f();

        A a2 = new A();
        a2.f();

        a1.f(1);
        a1.f(2, 3);
    }
}
