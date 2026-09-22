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
