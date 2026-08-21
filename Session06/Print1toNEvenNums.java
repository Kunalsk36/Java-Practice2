// Print all even numbers from 1 to N.

package Session06;

import java.util.Scanner;

public class Print1toNEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N Number : ");
        int n = sc.nextInt();
        System.out.println("\nThe 1 to "+ n +" Even numbers are : ");
        for(int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}
