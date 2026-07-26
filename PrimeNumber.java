// 4. Prime Number

// Check whether a number is prime.

// Input:
// 29

// Output:
// Prime

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i * i <= num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
        sc.close();
    }
}