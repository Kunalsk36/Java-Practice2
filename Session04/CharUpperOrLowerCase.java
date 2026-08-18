// Check whether a character is uppercase or lowercase.

package Session04;

import java.util.Scanner;

public class CharUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <='z') {
            System.out.println("The character is Lower Case.");
        }
        else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("The character is Upper Case.");
        }
        else {
            System.out.println("The character is not alphabet.");
        }
    }
}
