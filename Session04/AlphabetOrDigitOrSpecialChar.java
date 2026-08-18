// Check whether a character is an alphabet, digit or special character.

package Session04;

import java.util.Scanner;

public class AlphabetOrDigitOrSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character : ");
        char ch = sc.next().charAt(0);
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("The character is Alphabet.");
        } 
        else if(ch >= '0' && ch <= '9') {
            System.out.println("The character is Digit.");
        }
        else {
            System.out.println("The character is Special Character.");
        }
        sc.close();
    }
}
