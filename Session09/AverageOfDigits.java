// Find the average of digits.

package Session09;

import java.util.Scanner;

public class AverageOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int temp = Math.abs(num);
        int count = 0;
        int sum = 0;
        if(num == 0) {
            System.out.println("The average of digits of number "+num+" is 0");
            sc.close();
            return;
        }
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp /= 10;
            count++;
        }
        double avg = sum / count;
        System.out.println("The average of digits of number "+num+" is "+avg);
        sc.close();
    }
}
