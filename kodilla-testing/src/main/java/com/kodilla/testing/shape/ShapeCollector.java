package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumPost;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private Shape shape;

    public ShapeCollector(Shape shape) {
        this.shape = shape;
    }
    public String getName() {
    return name;
    }
}
    private List<Shape> list = new ArrayList<>();

    public void addFigure(Shape shape)
    {
        ShapeCollector shapeCollector = new ShapeCollector(Shape shape);
        shapeCollector.list.add(getName(), getField());
    }
    public void removeFigure(Shape shape),
    {
        ShapeCollector shapeCollector = new ShapeCollector(Shape shape);
        shapeCollector.list.remove(shape);
    }

    public int getFigure(int n)
    {
        ShapeCollector shapeCollector = new ShapeCollector(Shape shape);
        shapeCollector.list.get(n);
    }
    public void showFigures()
    {
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.list.toArray();
    }
