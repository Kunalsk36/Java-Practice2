// Take an integer from Scanner and print it.

package Day1;

import java.util.Scanner;

public class ScannerPrintInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter int num : ");
        int num = sc.nextInt();
        System.out.println("Entered Num is : "+ num);
        sc.close();
    }
}
