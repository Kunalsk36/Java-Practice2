/*
Create a method to check whether the given number is prime or not, call it inside another method named isEvenPrime, checking whether the prime number is even or not, and call that method in main method.
*/

package Session17;

import java.util.Scanner;

public class PrimeEvenOrNot {
    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        if(num==2) {
            return true;
        }
        if(num%2==0) {
            return false;
        }
        for(int i = 3; i*i <= num; i = i+2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void isEvenPrime(int num) {
        boolean isPrimeNum = isPrime(num);
        if (isPrimeNum) {
            if (num % 2 == 0) {
                System.out.println("The number " + num + " is Even Prime Number.");
            }
            else {
                System.out.println("The number " + num + " is Odd Prime Number. I.e, not even prime number.");
            }
        }
        else{
            System.out.println("Number "+num+" is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        isEvenPrime(num);
        sc.close();
    }
}
