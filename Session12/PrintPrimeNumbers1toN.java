// Print Prime Numbers from 1 to N:

package Session12;

import java.util.Scanner;

public class PrintPrimeNumbers1toN {
    public static void printPrimeNumbers1toN(int n) {
        if (n <= 1) {
            System.out.println("No Prime numbers.");
            return;
        }
        if (n >= 2) {
            System.out.print("2");
        }
        for(int i = 3; i <= n; i++) {
            boolean isPrime = true;
            for(int j = 2; j*j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(" "+i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n number : ");
        int n = sc.nextInt();
        printPrimeNumbers1toN(n);
        sc.close();
    }
}
