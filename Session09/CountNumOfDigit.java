// Count the number of digits.

package Session09;

import java.util.Scanner;

public class CountNumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int count = 0;;
        // Method 1: 
        // int count = String.valueOf(num).length();
        // if(num < 0){
        //     count--;
        // }

        // Method 2:
        if(temp==0) {
            count = 0;
        }
        while (temp > 0) {
            temp /= 10;
            count++;
        }
        System.out.println("The counts of digits in num "+num+" is "+count);
        sc.close();
    }
}