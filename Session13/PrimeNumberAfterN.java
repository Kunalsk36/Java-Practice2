// Find the next prime number after N.

package Session13;

import java.util.Scanner;

public class PrimeNumberAfterN {
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
        for(int i = 3; i <= num/i; i=i+2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumberAfterN(int num) {
        int primeNumber = num + 1;
        while(true) {
            if(isPrime(primeNumber)) {
                System.out.println("The prime Number after "+num+" is "+primeNumber);
                break;
            }
            primeNumber++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        printPrimeNumberAfterN(num);
    }
}
