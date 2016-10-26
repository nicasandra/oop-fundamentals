package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by nicasandra on 10/26/2016.
 */
public class Square implements Shape2D {

    public double l;

    @Override
    public double computeArea() {
        return this.l * this.l;
    }

    @Override
    public double computePerimeter() {
        return this.l * 4;
    }
}
