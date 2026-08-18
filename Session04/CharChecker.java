// Check whether a character is uppercase alphabet, lowercase alphabet, digit or special character.

package Session04;

import java.util.Scanner;

public class CharChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'a' && ch <= 'z') {
            System.out.println("Character is Lower Case Alphabet.");
        }
        else if(ch >= 'A' && ch <= 'Z') {
            System.out.println("Character is Upper Case Alphabet.");
        }
        else if(ch >= '0' && ch <= '9') {
            System.out.println("Character is Digit.");
        }
        else {
            System.out.println("Character is Special Character.");
        }
        sc.close();
    }
}
