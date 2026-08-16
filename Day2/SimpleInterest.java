// Calculate simple interest.

package Day2;

import java.util.Scanner;

public class SimpleInterest {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal amount: ");
        double P = sc.nextDouble();
        System.out.println("Enter the Time Period in years : ");
        double T = sc.nextDouble();
        System.out.println("Enter the rate of interest : ");
        double R = sc.nextDouble();
        double SI = ( P * T * R ) / 100;
        System.out.println("The Simple Interest is : "+SI);
        sc.close();
   } 
}
