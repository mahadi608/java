/*
*Write a program to find the length, number of vowels, consonants, digits, and white space
 characters in a string. You have to input the string.

*To better understand the problem consider the following Sample Input/Output:


*Input String: We are 45 intake

*String Length: 16

*Vowel: 6

*Consonant: 5

*Digits: 2

*White Space: 3

 */

import java.util.Scanner;


public class vowelConsonant {

    public static void main(String[] args) {

        int V = 0, C = 0, D = 0, W = 0;

        //String input = "We are 45 intAke";

        Scanner sc = new Scanner(System.in);

        System.out.print("Input String:");

        String input = sc.nextLine();
		
		sc.close();

        String lowercase = input.toLowerCase();

        int Length = lowercase.length();


        for (int i = 0; i < Length; i++) {

            char c = lowercase.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

                V += 1;

            } else if (c != ' ' && !Character.isDigit(c)) {
                C += 1;
            } else if (Character.isDigit(c)) {
                D += 1;
            } else {
                W += 1;
            }

        }

        System.out.println("String Length:" + Length + "\n" + "Vowel:" + V + "\n" + "Consonant:" + C + "\n" + "Digits:" + D + "\n" + "White Space:" + W);

    }
}
