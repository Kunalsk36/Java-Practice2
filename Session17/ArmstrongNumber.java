// Check whether a number is an Armstrong number.
// e.g. 153 ==> 1^3 + 5^3+ 3^3 == 153

package Session17;

import java.util.Scanner;

public class ArmstrongNumber {
    public static int countDigits(int num) {
        if(num == 0) {
            return 1;
        }
        int count = 0;
        while(num != 0) {
            count++;
            num /= 10;
        }
        return count;
    } 

    public static int power(int digit, int pow) {
        int power = 1;
        for(int i = 1; i <= pow; i++) {
            power *= digit;
        }
        return power;
    }

    public static boolean isArmstrongNumber(int num) {
        if(num < 0) {
            return false;
        }
        int pow = countDigits(num);
        int temp = num;
        int sum = 0;
        while (temp != 0) {
            int digit = temp%10;
            sum += power(digit, pow);
            temp /= 10;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(isArmstrongNumber(num)) {
            System.out.println("The number "+num+" is a ArmStrong Number.");
        }
        else{
            System.out.println("The number "+num+" is not a ArmStrong Number.");
        }
        sc.close();
    }
}
