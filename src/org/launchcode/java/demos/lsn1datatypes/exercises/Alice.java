package org.launchcode.java.demos.lsn1datatypes.exercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input;
        input = new Scanner(System.in);

        String aliceIW = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:" +
                " once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        System.out.println("What term do you want to search the sentence for?");
        String searchTerm = input.nextLine();

        boolean contains = aliceIW.toLowerCase().contains(searchTerm);
        System.out.println(contains);

    }
}
