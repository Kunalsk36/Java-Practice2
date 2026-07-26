// 5. Fibonacci Series

// Print first N Fibonacci numbers.

// Input:
// 7

// Output:
// 0 1 1 2 3 5 8

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int i = 0;
        int num1 = 0;
        int num2 = 1;
        while(i < num){
            System.out.print(num1+" ");
            int temp = num1;
            num1 = num2;
            num2 = num2+temp;
            i++;
        }
        sc.close();
    }
}
