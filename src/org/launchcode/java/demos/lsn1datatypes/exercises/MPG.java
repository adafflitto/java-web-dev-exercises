package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class MPG {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        System.out.println("What is the number of miles you have driven?");
        double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you consumed?");
        double gallons = input.nextDouble();

        double mpg = miles / gallons;
        System.out.println("You got " + mpg + " miles per gallon.");
    }


}
