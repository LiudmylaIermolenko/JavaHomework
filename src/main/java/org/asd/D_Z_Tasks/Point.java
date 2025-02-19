package org.asd.D_Z_Tasks;

import java.util.*;

class Point implements Comparable<Point> {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point other) {
        if (this.y != other.y) return this.y - other.y;
        return this.x - other.x;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Point)) return false;
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point[" + x + ", " + y + "]";
    }

    public static void main(String[] args) {
        List<Point> points = Arrays.asList(
                new Point(3, 2), new Point(1, 5), new Point(4, 5),
                new Point(2, 3), new Point(1, 2), new Point(3, 2)
        );
        System.out.println("Исходный список: " + points);

        Collections.sort(points);
        System.out.println("\nОтсортированный список по y: " + points);

        TreeSet<Point> uniquePoints = new TreeSet<>(points);
        System.out.println("\nTreeSet с уникальными точками: " + uniquePoints);

        TreeSet<Point> uniqueYPoints = new TreeSet<>();
        for (Point p : points) {
            uniqueYPoints.add(new Point(0, p.y));
        }

        System.out.println("\nTreeSet с уникальными y-координатами: " + uniqueYPoints);
    }
}







// * Создать класс Point для хранения координат (x, y) точки на плоскости.
// * Создать список точек, отсортировать по координате y.
// * Создать TreeSet со всеми уникальными точками.
// Создать TreeSet со всеми различными по координате y точками.

//public int compareTo(Point other) {
//    int result = Integer.compare(this.y, other.y); // Сравниваем по y
//    if (result == 0) {
//        return Integer.compare(this.x, other.x); // Если y равны, сортируем по x
//    }
//    return result;
//}

