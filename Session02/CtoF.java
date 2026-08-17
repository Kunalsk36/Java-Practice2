// Convert Celsius to Fahrenheit.

package Session02;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Celsius to Fahrenheit is "+fahrenheit);
        sc.close();
    }
}
