// Convert lowercase character to uppercase without using toUpperCase().

package Session04;

import java.util.Scanner;

public class ConvertLowerCaseCharToUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Lower Case Alphabet : ");
        char ch = sc.next().charAt(0);
        if(ch>='a' && ch <='z'){
            char upperCh = (char) (ch - ('a' - 'A'));
            System.out.println(upperCh);
        }
        else {
            System.out.println("Enter the lowerCase Alphabet.");
        }
        sc.close();
    }
}
