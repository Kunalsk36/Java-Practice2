/*
A neon number is a special number where the sum of the digits of its square is equal to the number itself. 
For example, 9 is a neon number because: 
You square the number: (9 * 9 = 81)
You add the digits of the square:(8 + 1 = 9) 
*/

package Session18;

import java.util.Scanner;

public class NeonNumber {
    public static int squareNum(int num) {
        return num * num;
    }

    public static int sumDigits(int num) {
        int sum = 0;
        while(num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }

    public static boolean isNeonNumber(int num) {
        return num==sumDigits(squareNum(num));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(isNeonNumber(num) ? num + " is a Neon Number." : num + " is not a Neon Number.");
        sc.close();
    }
}
