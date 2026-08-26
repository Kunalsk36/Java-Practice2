// Find the smallest digit.

package Session09;

import java.util.Scanner;

public class SmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int smallestNum = Integer.MAX_VALUE;
        if(num==0) {
            smallestNum = 0;
        }
        else{
            while (temp > 0) {
                int digit = temp % 10;
                if(digit < smallestNum) {
                    smallestNum = digit;
                }
                temp /= 10;
            }
        }
        System.out.println("The smallest digit from number "+num+" is "+smallestNum);
        sc.close();
    }
}
