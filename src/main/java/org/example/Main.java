package org.example;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Point p2 = new Point(6, 8);

        System.out.println("p1'in (0,0) noktasına uzaklığı: " + p1.distance());
        System.out.println("p1'in p2 noktasına uzaklığı: " + p1.distance(p2));
        System.out.println("p1'in (1,1) noktasına uzaklığı: " + p1.distance(1, 1));


        Player player1 = new Player("Mert", 120, Weapon.SWORD);
        Player player2 = new Player("Murat", -10, Weapon.BOW);

        System.out.println(player1.healthRemaining());
        System.out.println(player2.healthRemaining());

        player1.loseHealth(30);
        System.out.println(player1.healthRemaining());

        player1.loseHealth(80);
        System.out.println(player1.healthRemaining());

        player2.restoreHealth(50);
        System.out.println(player2.healthRemaining());
    }
}