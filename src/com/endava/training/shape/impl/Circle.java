package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class Circle implements Shape2D {
    public double r;

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * this.r;
    }
}
