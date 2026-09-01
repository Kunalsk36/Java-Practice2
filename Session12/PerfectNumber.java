// Perfect Number
// It is  a Positive Integer.
// The number which has addition of there factors except that number is equal to the number is perfect number.
// 6 ==> 1, 2, 3 ===> 1+2+3 = 6 and 6=6 so 6 is perfect number.

package Session12;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        sc.close();
        if(num <= 1) {
            System.out.println("The number is not a perfect number.");
            return;
        }
        int sum = 0;
        for(int i = 1; i <= num/2; i++) {
            if(num % i == 0) {
                sum += i;
            }
        }
        System.out.println(num == sum ? "The number "+num+" is perfect number" : "The number "+num+" is not a perfect number.");
    }
}
