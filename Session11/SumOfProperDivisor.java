// Find the sum of proper divisors.

package Session11;

import java.util.Scanner;

public class SumOfProperDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0) {
            System.out.println("The number 0 has infinite divisor");
            return;
        }
        int sum = 0;
        int absNum = Math.abs(num);
        for(int i = 1; i <= absNum/2; i++) {
            if(absNum % i == 0) {
                sum += i;
            }
        }
        System.out.println("The sum of the proper divisor of number "+num+" is "+sum);
    }
}
