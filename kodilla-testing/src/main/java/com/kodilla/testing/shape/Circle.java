package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private int field;

    public Circle(String name, int field) {
        this.name = name;
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public int getField() {
        return field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        if (field != circle.field) return false;
        return name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }
}
