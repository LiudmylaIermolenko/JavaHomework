package org.asd._17_12_2024;

import java.util.Random;



import java.util.Random;

public class Generator {
    Random rand = new Random();

    public Square makeSquare (){
        Square square = new Square(rand.nextInt(1, 50));
        return square;
    }

    public Triangle makeTriangle (){
        Triangle triangle = new Triangle(rand.nextInt(1, 50), rand.nextInt(1, 50), rand.nextInt(1, 50));
        if (triangle.side < (triangle.height + triangle.base)){
        }
        return triangle;
    }

    public Circle makeCircle (){
        Circle circle = new Circle(rand.nextInt(1, 50));
        return circle;
    }


    public static void main(String[] args) {
        Generator generator = new Generator();
        System.out.println("Квадрат " + generator.makeSquare());
        System.out.println("Круг " + generator.makeCircle());
        System.out.println("Треугольник " + generator.makeTriangle());
    }
}


