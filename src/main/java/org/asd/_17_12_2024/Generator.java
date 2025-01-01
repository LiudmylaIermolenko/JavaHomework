package org.asd._17_12_2024;

import java.util.Random;


import java.util.Random;

public class Generator {
    Random rand = new Random();

    public Square makeSquare() {
        Square square = new Square("Square1", "black", rand.nextInt(1,50));
        System.out.println(square.calcSquare());
        return square;
    }

    public Triangle makeTriangle() {
        Triangle triangle = new Triangle("triangle1", "white", rand.nextInt(1,50), rand.nextInt(1, 50), rand.nextInt(1, 50));
        if (triangle.side < (triangle.height + triangle.base)) {
            System.out.println(triangle.calcSquare());
        }
        return triangle;
    }

    public Circle makeCircle() {
        Circle circle = new Circle("circle1", "red", rand.nextInt(1, 50));
        System.out.println(circle.calcSquare());
        return circle;
    }


    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println("Квадрат " + generator.makeSquare());
        System.out.println("Круг " + generator.makeCircle());
        System.out.println("Треугольник " + generator.makeTriangle());
    }
}


