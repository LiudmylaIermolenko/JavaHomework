package org.asd.D_Z_Tasks;

import java.util.*;

class Point implements Comparable<Point> {
        int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
        @Override
        public int compareTo(Point other) {
            if (this.y == other.y) {
                return Integer.compare(this.x, other.x);
            }
            return Integer.compare(this.y, other.y);
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
            return "Point[" + x + ", " + y + ']';
        }

        public static void main(String[] args) {
            List<Point> points = Arrays.asList(
                    new Point(3, 2), new Point(1, 5), new Point(4, 5),
                    new Point(2, 3), new Point(1, 2), new Point(3, 2)
            );
            System.out.println(points);
            // Сортируем список по y (если y равны, сортируем по x)
            Comparator<Point> pointComparator = new Comparator<Point>() {
                @Override
                public int compare(Point o1, Point o2) {
                    if (o1.y != o2.y) {
                        return Integer.compare(o1.y, o2.y); // Сравниваем по y
                    }
                    return Integer.compare(o1.x, o2.x); // Если x равны, сравниваем по x
                }
            };
            points.sort(pointComparator);

            System.out.println("Отсортированный список по y:");
            System.out.println(points);

            // TreeSet с уникальными точками (использует compareTo)
            TreeSet<Point> uniquePoints = new TreeSet<>(points);
            System.out.println("\nTreeSet с уникальными точками:");
            System.out.println(uniquePoints);

            // TreeSet, в котором точки различаются только по y
            TreeSet<Point> uniqueYPoints = new TreeSet<>(Comparator.comparingInt(p -> p.y));
            uniqueYPoints.addAll(points);
            System.out.println("\nTreeSet с уникальными координатами y:");
            System.out.println(uniqueYPoints);
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

