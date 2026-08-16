// Calculate area of a rectangle.

package Day2;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length : ");
        double length = sc.nextDouble();
        System.out.println("Enter the width : ");
        double width = sc.nextDouble();
        double area = length * width;
        System.out.println("The area of rectangle is "+area);
        sc.close();
    }
}
