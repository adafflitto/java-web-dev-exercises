package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {

    public static void main(String[] args) {

        String myString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        char[] charsInString = myString.toCharArray();
        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (char letter : charsInString) {
            int count = 0;

            for (int i = 0; i < charsInString.length; i++) {
                if (letter == charsInString[i]) {
                    count++;
                }
            }
            letterCount.put(letter, count);
        }

        for (Map.Entry<Character, Integer> letter : letterCount.entrySet()) {
            System.out.println(letter.getKey() + ": " + letter.getValue());
        }
    }


}
