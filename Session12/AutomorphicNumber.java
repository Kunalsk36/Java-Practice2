/*
Automorphic Number

A number is automorphic if its square ends with the number itself.

5² = 25 → last 1 digit is 5 → 5 = 5 Automorphic
6² = 36 → last 1 digit is 6 → 6 = 6 Automorphic
25² = 625 → last 2 digits are 25 → 25 = 25 Automorphic

4² = 16 → last 1 digit is 6 → 4 != 6 → Not Automorphic
*/

package Session12;

import java.util.Scanner;

public class AutomorphicNumber {
    public static boolean isAutomorphicNumber(long num) {
        if(num < 0) {
            return false;
        }
        long temp = num;
        long divisor = 1;
        while (temp != 0) {
            temp /= 10;
            divisor *= 10;
        }
        return num == (num*num)%divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = sc.nextLong();
        if (isAutomorphicNumber(num)) {
            System.out.println("The number "+num+" is Automorphic Number.");
        }
        else {
            System.out.println("The number "+num+" is not Automorphic Number.");
        }
        sc.close();
    }
}