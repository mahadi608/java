/*

Take a string having a length greater than 10 as input and display the substring(1, 7) then
delete the substring.

To better understand the problem consider the following Sample Input/Output:

Input/output:
Input String: We are Bangladeshi
Substring (1,7) = e are B
After Deleing the substring: W angladeshi


*/


import java.util.Scanner;


public class substring {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input String: ");
        
        String input = sc.nextLine();
        
        while(input.length()<10){
            System.out.println("Pleace Enter minimum 10 charter");
            
            input = sc.nextLine();
        }
        
        String str = input.substring(1, 8);
        
        System.out.println("Substring (1,7) = "+str);
        
        String delete = input.replace(str, " ");
        
        System.out.println("After Deleing the substring: "+delete);
        
        
        
        
    }
    
}
