// Remove the last digit from a number.

package Session09;

import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        num /= 10;
        System.out.println("The num after remove last digit is : "+num);
        sc.close();
    }
}