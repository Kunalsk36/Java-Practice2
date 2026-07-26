// 3. Factorial

// Find factorial of a number.

// Input:
// 5

// Output:
// 120

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        long fact = 1;
        if(num < 0) {
            System.out.println("No factorial");
        }
        else{
            for(int i = 1; i <= num; i++){
                fact *= i;
            }
            System.out.println("the factorial of "+num+" is "+fact);
        }
        sc.close();
    }
}
