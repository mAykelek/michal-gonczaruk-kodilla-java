package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private int field;

    public Square(String name, int field) {
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

        Square square = (Square) o;

        if (field != square.field) return false;
        return name.equals(square.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + field;
        return result;
    }
}
