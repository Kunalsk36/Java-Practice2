// Reverse a number.

package Session10;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse : ");
        int num = sc.nextInt();
        int sign = num < 0 ? -1 : 1;
        int temp = Math.abs(num);
        int rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp /= 10;
        } 
        System.out.println("The reverse number is "+rev*sign);
        sc.close();
    }
}