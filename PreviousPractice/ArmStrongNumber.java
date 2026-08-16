package PreviousPractice;
// 8. Armstrong Number
// Input:
// 153

// Output:  
// Armstrong

import java.util.Scanner;

public class ArmStrongNumber {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num < 0){
            System.out.println("Not a Armstrong Number");
            sc.close();
            return;
        }
        long power = String.valueOf(num).length();
        double sum = 0;
        int temp = num;
        while(temp != 0){
            int digit = temp % 10;
            sum = sum + Math.pow(digit, power);
            temp /= 10;
        }
        if(num == sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
        sc.close();
    }
}