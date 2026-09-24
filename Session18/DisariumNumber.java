/*
Disarium number is a positive integer where the sum of its digits raised to the power of their respective positions (from left to right, starting at 1) equals the number itself.

Take the number 135:
Position 1: 1¹ = 1
Position 2: 3² = 9
Position 3: 5³ = 125
Sum: 1 + 9 + 125 = 135

*/

package Session18;

import java.util.Scanner;

public class DisariumNumber {
    public static int countDigits(int num){
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

    public static int power(int num, int pow) {
        int power = 1;
        for(int i = 1; i <= pow; i++) {
            power *= num;
        }
        return power;
    }

    public static boolean isDisariumNumber (int num) {
        if(num <= 0) {
            return false;
        }
        int count = countDigits(num);
        int sum = 0;
        int temp = num;
        while(temp != 0) {
            int digit = temp % 10;
            sum += power(digit, count--);
            temp /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isDisariumNumber(num) ? num +" is a Disarium Number." : num +" is not a Disarium Number.");
        sc.close();
    }
}