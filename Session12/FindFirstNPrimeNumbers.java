package Session12;

import java.util.Scanner;

public class FindFirstNPrimeNumbers {
    public static boolean isPrime(int num){
        if(num == 2) {
            return true;
        }
        if(num % 2 == 0) {
            return false;
        }
        for(int i = 3; i*i<=num; i=i+2){
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void printPrimeNumbers(int n) {
        if (n <= 0) {
            System.out.println("There is no prime numbers.");
            return;
        }
        int count = 0;
        int num = 2;
        while(count != n) {
            if(isPrime(num)) {
                count++;
                System.out.print(num+" ");
            }
            num++;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n Number : ");
        int n = sc.nextInt();
        printPrimeNumbers(n);
    }
}
