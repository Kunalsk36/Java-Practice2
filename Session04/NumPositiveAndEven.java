// Check Whether a number is positive and even:

package Session04;

import java.util.Scanner;

public class NumPositiveAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        if(num > 0 && num % 2 == 0) {
            System.out.println("The number is Positive and Even.");
        }
        else if(num > 0) {
            System.out.println("The number is positive but not even.");
        }
        else if(num == 0) {
            System.out.println("The number zero.");
        }
        else{
            System.out.println("The number is negative.");
        }
        sc.close();
    }
}
