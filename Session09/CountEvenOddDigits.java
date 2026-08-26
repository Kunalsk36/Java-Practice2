// Count how many even and odd digits are present.

package Session09;

import java.util.Scanner;

public class CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int evenCount = 0;
        int oddCount = 0;
        do {
            int digit = temp % 10;
            if(digit % 2 == 0) {
                evenCount++;
            }
            else {
                oddCount++;
            }
            temp /= 10;
        } while(temp > 0);
        System.out.println("The count of Even digits is "+evenCount+" and count of Odd digits is "+oddCount+" in number "+num);
        sc.close();
    }
}
