package org.example;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("p1'in (0,0) noktasına uzaklığı: " + p1.distance());
        System.out.println("p1'in p2 noktasına uzaklığı: " + p1.distance(p2));
        System.out.println("p1'in (1,1) noktasına uzaklığı: " + p1.distance(1, 1));
    }
}