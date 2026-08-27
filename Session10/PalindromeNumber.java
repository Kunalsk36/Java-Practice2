// Check whether a number is palindrome.

package Session10;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindromeNumber(int num) {
        if(num < 0) {
            return false;
        }
        int temp = Math.abs(num);
        int rev = 0;
        while(temp > 0){
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        }
        return num==rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check for palindrome : ");
        int num = sc.nextInt();
        if(isPalindromeNumber(num)){
            System.out.println("The number "+num+" is Palindrome number.");
        }
        else{
            System.out.println("The number "+num+" is not a Palindrome number.");
        }
        sc.close();
    }
}
