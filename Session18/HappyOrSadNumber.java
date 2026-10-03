package Session18;

import java.util.Scanner;

public class HappyOrSadNumber {
    public static int square(int num) {
        return num*num;
    }

    public static int sumOfSquareOfDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum += square(digit);
            num /= 10;
        }
        return sum;
    }

    public static boolean isHappy(int num) {
        while(num != 1 && num != 4) {
           num = sumOfSquareOfDigits(num);
        }
        if(num==1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        System.out.println(isHappy(num) ? num+" is Happy" : num+" is Sad");
        sc.close();
    }
}