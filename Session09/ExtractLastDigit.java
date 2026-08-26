// Extract the last digit from a number.

package Session09;

import java.util.Scanner;

public class ExtractLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int lastNum = Math.abs(num % 10);
        System.out.println("The last number from number "+num+" is "+lastNum);
        sc.close();
    }
}
