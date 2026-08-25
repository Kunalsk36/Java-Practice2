// Print a 5×5 matrix of a chosen character.

package Session08;

import java.util.Scanner;

public class Print5by5MatrixOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        System.out.println("\n5x5 Matrix of character "+ch+" :");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
    }

}
