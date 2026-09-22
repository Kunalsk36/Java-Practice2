/*
Create a method to print the power of 2 till n 
e.g. 2, 4, 8, 16, 32 
and call it in main method.
*/

package Session17;

import java.util.Scanner;

public class PrintPowerOf2TillN {
public static void printPowerOf2(int n) {
    int num = 2; 
    int pow = 1; 
    for(int i = 1; i <= n; i++) {
        pow *= num;
        System.out.print(pow + " ");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value : ");
        int n = sc.nextInt();
        printPowerOf2(n);
        sc.close();
    }
}
