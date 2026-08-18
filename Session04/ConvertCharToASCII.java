// Convert a character to its ASCII value.

package Session04;

import java.util.Scanner;

public class ConvertCharToASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character : ");
        char ch = sc.next().charAt(0);
        System.out.println((int) ch);
        sc.close();
    }
}
