// Find the sum of digits.

package Session09;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int sum = 0;
        while(temp > 0){
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
        }
        System.out.println("The sum of digits of number "+num+" is "+sum);
        sc.close();
    }
}
