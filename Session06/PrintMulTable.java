// Print the multiplication table of a number.

package Session06;

import java.util.Scanner;

public class PrintMulTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of "+n+" : ");
        for(int i = 1; i<=10;i++) {
            System.out.println(i*n);
        }
        sc.close();
    }
}
