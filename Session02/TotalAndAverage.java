// Calculate total and average of three numbers.

package Session02;

import java.util.Scanner;

public class TotalAndAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total;
        double avg;
        System.out.println("Enter num1 : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2 : ");
        double num2 = sc.nextDouble();
        System.out.println("Enter num3 : ");
        double num3 = sc.nextDouble();
        total = num1+num2+num3;
        avg = ( num1 + num2 + num3 ) / 3;
        System.out.println("The total is "+total);
        System.out.println("The average is "+avg);
        sc.close();
    }
}
