package Session12;

import java.util.Scanner;

public class PrintPrimeNumbersInRange {
    public static void printPrimeNumbersInRange(int start, int end) {
        if(start > end) {
            System.out.println("Invalid range.");
            return;
        }
        if(end < 2) {
            System.out.println("Don't have prime numbers in that range.");
            return;
        }
        if(start <= 2 && end >= 2) {
            System.out.print("2 ");
        }
        if(start % 2 == 0) {
            start++;
        }
        if(start < 2) {
            start = 3;
        }
        for(int i = start; i <= end; i=i+2) {
            boolean isPrime = true;
            if(i < 2) {
                isPrime = false;
            }
            else {
                for(int j = 2; j*j <= i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            }
            if(isPrime) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        printPrimeNumbersInRange(start, end);
        sc.close();
    }
}
