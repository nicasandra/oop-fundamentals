package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class Triangle implements Shape2D {

    public double l1;
    public double l2;
    public double l3;

    @Override
    public double computeArea() {
        double s=(this.l1+this.l2+this.l3)/2;
        return Math.sqrt(s*(s-this.l1)*(s-this.l2)*(s-this.l3));
    }

    @Override
    public double computePerimeter() {
        return this.l1 + this.l2 + this.l3;
    }
}
