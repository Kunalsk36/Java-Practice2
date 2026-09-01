// Find the largest and second largest digit.

package Session11;

import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static int[] largestAndSecondLargestDigit(int num) {
        int largestDigit = -1;
        int secondLargestDigit = -1;
        int temp = Math.abs(num);
        if(num == 0) {
            return new int[] {0 , -1};
        }
        while(temp > 0) {
            int digit = temp % 10;
            if(digit > largestDigit) {
                secondLargestDigit = largestDigit;
                largestDigit = digit;
            }
            else if(digit > secondLargestDigit && digit < largestDigit) {
                secondLargestDigit = digit;
            }
            temp /= 10;
        }
        return new int[] {largestDigit, secondLargestDigit};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int[] res = largestAndSecondLargestDigit(num);
        System.out.println("From the number "+num+" the largest digit is "+res[0]+" and second largest digit is "+res[1]);
        sc.close();
    }
}
