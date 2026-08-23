// Print all odd numbers from 1 to N.

package Session06;

import java.util.Scanner;

public class Print1toNOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N Number: ");
        int n = sc.nextInt();
        System.out.println("\nFollowing are the Odd numbers from 1 to "+n+" : ");
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
