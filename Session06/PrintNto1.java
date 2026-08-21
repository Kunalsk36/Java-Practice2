// Print numbers from N to 1.

package Session06;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N number : ");
        int n = sc.nextInt();
        System.out.println("\nThe numbers from "+ n +" to 1 : ");
        for(int i = n; i>=1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
