// Print N to 1 Using while loop:

package Session07;

import java.util.Scanner;

public class PrintNto1UsingWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Number : ");
        int n = sc.nextInt();
        int i = n;
        System.out.println("The Numbers from "+n+" to 1 are : ");
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        sc.close();
    }
}
