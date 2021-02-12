package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    List<Shape> list = new ArrayList<>();


    public void addFigure(Shape shape) {
        list.add(shape);

    }

    public boolean removeFigure(Shape shape) {
        list.remove(shape);

        return true;
    }

    public Shape getFigure(int n) {
        return list.get(n);

    }

    public void showFigures() {
        System.out.println(list);

    }
}


