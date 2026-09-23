// Check whether two numbers are both prime.

package Session17;

import java.util.Scanner;

public class Check2NumsPrimes {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        for(int i = 3; i * i <= num; i=i+2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkBothNumsPrimes(int num1, int num2) {
        return isPrime(num1) && isPrime(num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second Number : ");
        int num2 = sc.nextInt();
        System.out.println("Both numbers are Prime = "+checkBothNumsPrimes(num1, num2));
        sc.close();
    }
}
