// Take name and age from Scanner and print a formatted introduction.

package Day1;

import java.util.Scanner;

public class PrintIntro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello, my name is "+name+" and age is "+age);
        sc.close();
    }    
}
