// Check whether a number is prime.

package Session12;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        if(num <= 1 || num % 2 == 0) {
            System.out.println("The number "+num+" is not a prime number.");
            return;
        }
        if(num == 2){
            System.out.println("The number "+num+" is prime number.");
            return;
        }
        int i = 3;
        while(i <= num/2) {
            if(num % i == 0){
                System.out.println("The number "+num+" is not a prime number.");
                return;
            }
            i++;
        }
        System.out.println("The number "+num+" is prime number.");
    }
}
