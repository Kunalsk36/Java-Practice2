/*
A strong number (also known as a Krishnamurthy number or special number) is a number where the sum of the factorials of its digits is equal to the original number itself.

For example, 145 is a strong number because: (1!+4!+5! = 1+24+120=145)
*/

package Session17;

import java.util.Scanner;

public class StrongNumber {
    public static boolean isStrongNumber(int num){
        if(num <= 0) {
            return false;
        }
        int temp = num;
        int sum = 0;
        while(temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return num == sum;
    }
    public static int factorial(int num){
        int fact = 1; 
        for(int i = num; i >= 1; i--) {
            fact *= i;
        }
        return fact;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(isStrongNumber(num)){
            System.out.println(num+" is a strong number");
        }
        else{
            System.out.println(num+" is not a strong number.");
        }
        sc.close();
    }
}
