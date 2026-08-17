// Take two integers and print sum, difference, product, quotient and remainder.

package Day1;

import java.util.Scanner;

public class ArithmeticOps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();

        // Sum
        int sum = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+sum);

        // Difference
        int diff = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+diff);

        // Product
        int mul = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+mul);

        // Quotient
        int div = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+div);

        // Remainder
        int rem = num1 % num2;
        System.out.println(num1+" % "+num2+" = "+rem);

        sc.close();
    }
}
