package org.asd._17_12_2024;

abstract class Figure {
    String name;
    String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract double calcSquare();
    }


class Triangle extends Figure{
    int side;
    int base;
    int height;

    public Triangle(String name, String color, int side, int base, int height) {
        super(name, color);
        this.side = side;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calcSquare() {
        double sTriangle = 0.5 * this.base * this.height;
        return sTriangle;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side=" + side +
                ", base=" + base +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "side=" + side +
//                ", base=" + base +
//                ", height=" + height +
//                '}';
//    }
}

class Square extends Figure{
    int side;

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    @Override
    public double calcSquare() {
        double sSquare = this.side*this.side;
        return sSquare;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Square{" +
//                "side=" + side +
//                '}';
//    }
}

class Circle extends Figure{
    int radius;

    public Circle(String name, String color, int radius) {
        super(name, color);
        this.radius = radius;
    }

    @Override
    public double calcSquare() {
        double sCircle = Math.PI * this.radius * this.radius;
        return sCircle;
    }

//    @Override
//    public String toString() {
//        return "Circle{" +
//                "radius=" + radius +
//                '}';
//    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

