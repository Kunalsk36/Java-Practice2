// Print Fibonacci Series: 

package Session13;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value: ");
        int n = sc.nextInt();
        sc.close();
        int num1 = 0;
        int num2 = 1;
        if(n <= 0) {
            System.out.println("No Fibonacci Series.");
            return;
        }
        for(int i = 1; i<= n; i++) {
            System.out.print(num1+" ");
            int temp = num1;
            num1 = num2;
            num2 = temp+num2;
        }
    }
}