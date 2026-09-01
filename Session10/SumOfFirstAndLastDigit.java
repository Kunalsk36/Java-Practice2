// Find the sum of first and last digit.

package Session10;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {
    public static int sumOfFirstAndLastDigit(int num) {
        int sum = 0;
        int sign = num < 0 ? -1 : 1;
        int temp = Math.abs(num);
        int firstDigit = 0;
        int lastDigit = 0;
        boolean isFound = false;
        while(temp > 0) {
            firstDigit = temp % 10;
            if(!isFound) {
                lastDigit = firstDigit;
                isFound = true;
            }
            temp /= 10;
        }
        sum = firstDigit*sign + lastDigit*sign;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int res = sumOfFirstAndLastDigit(num);
        System.out.println("The sum of first and last digit of number "+num+" is "+res);
        sc.close();
    }
}
