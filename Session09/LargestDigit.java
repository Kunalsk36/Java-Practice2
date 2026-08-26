// Find the largest digit.

package Session09;

import java.util.Scanner;

public class LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int largestNum = Integer.MIN_VALUE;
        if(num == 0) {
            largestNum = 0;
        }
        while(temp > 0) {
            int digit = temp % 10;
            if(largestNum < digit) {
                largestNum = digit;
            }
            if(largestNum == 9) {
                break;
            }
            temp /= 10;
        }
        System.out.println("The largest number from number "+num+" is "+largestNum);
        sc.close();
    }
}
