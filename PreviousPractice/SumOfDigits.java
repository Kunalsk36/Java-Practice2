package PreviousPractice;
// 7. Sum of Digits
// Input:
// 456

// Output:
// 15

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int resultSum = 0;
        int temp = num; 
        while(temp != 0){
            int digit = temp % 10;
            resultSum += digit;
            temp /= 10;
        } 
        System.out.println("Sum of Digits of "+num+" is "+resultSum);
        sc.close();
    }
}
