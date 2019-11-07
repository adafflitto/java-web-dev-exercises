package org.launchcode.java.demos.exercises;


import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("What is the length of your rectangle?");
        int length = input.nextInt();

        System.out.println("What is the width of your rectangle?");
        int width = input.nextInt();

        int area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
