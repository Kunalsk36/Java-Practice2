// Calculate area of a Circle.

package Day2;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r = sc.nextInt();
        double pi = 3.14;
        System.out.println(pi*r*r);
        sc.close();
    }
}