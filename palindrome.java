/*
*Take a string as input and check whether it is palindrome or not using java built-in
*method reverse() and equals()/equalsIgnoreCase().

*Input/output 1:
*Input String: mam
*mam is a palindrome


*Input/output 2:
*Input String: BUBT
*BUBT is not a palindrome

 */
 

import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
		
		sc.close();

        String input = str.toLowerCase();

        int l = 0;

        boolean Notpalindrome = false;

        int length = input.length() - 1;

        for (int i = length; i >= (length / 2); i--) {

            char a = input.charAt(i);
            char b = input.charAt(l);

            if (a != b) {
                Notpalindrome = true;
                break;
            }

            l = l + 1;

        }

        if (Notpalindrome) {
            System.out.println(str + " is not a palindrome");
        } else {
            System.out.println(str + " is a palindrome");
        }


    }
}
