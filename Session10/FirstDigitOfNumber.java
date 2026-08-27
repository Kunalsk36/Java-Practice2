// Find the first digit of a number.

package Session10;

import java.util.Scanner;

public class FirstDigitOfNumber {
    public static int firstDigit(int num){
        int digit = 0;
        int sign = num < 0 ? -1 : 1;
        int temp = Math.abs(num);
        while(temp > 0) {
            digit = temp % 10;
            temp /= 10;
        }
        return digit*sign;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println("The first digit of the number "+num+" is "+firstDigit(num));
    }
}
