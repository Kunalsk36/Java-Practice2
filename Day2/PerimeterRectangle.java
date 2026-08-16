// Calculate perimeter of a rectangle.

package Day2;

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double l = sc.nextDouble();
        System.out.println("Enter the width : ");
        double w = sc.nextDouble();
        double perimeter = 2 * (l + w);
        System.out.println("The Perimeter of Rectangle is "+perimeter);
        sc.close();
    }
}