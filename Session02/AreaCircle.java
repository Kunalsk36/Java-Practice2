// Calculate area of a Circle.

package Session02;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double r = sc.nextDouble();
        // double pi = 3.14;
        // double area = pi * r * r;
        double area = Math.PI * r * r;
        System.out.println(area);
        sc.close();
    }
}