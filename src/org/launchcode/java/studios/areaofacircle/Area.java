package org.launchcode.java.studios.areaofacircle;


import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);
        double radius;
        do {
            System.out.println("What is the radius of your circle?");
            while (!input.hasNextDouble()) {
                System.out.println("Please enter a valid number!");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
        input.close();
    }
}
