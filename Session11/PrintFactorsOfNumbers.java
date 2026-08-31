// Print all factors of a number.

package Session11;

import java.util.Scanner;

public class PrintFactorsOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num);
        if (num == 0) {
            System.out.println("0 has infinitely many integer factors");
            sc.close();
            return;
        }
        System.out.println("The factors of number "+num*sign+" are : ");
        for(int i = 1; i <= num; i++) {
            if(num % i == 0) {
                System.out.print(i + ", ");
            }
        }
        sc.close();
    }
}

// Optimized Version: 
// Print all factors of a number.

// package Session11;

// import java.util.Scanner;

// public class PrintFactorsOfNumbers {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();

//         System.out.println("The factors of " + num + " are:");

//         for (int i = 1; i * i <= num; i++) {

//             if (num % i == 0) {
//                 System.out.print(i + ", ");

//                 if (i != num / i) {
//                     System.out.print((num / i) + ", ");
//                 }
//             }
//         }

//         sc.close();
//     }
// }