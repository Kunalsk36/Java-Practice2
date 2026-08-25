// Print a rectangle of stars.

package Session08;

public class PrintRectangleOfStar {
    public static void main(String[] args) {
        String star = " * ";
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 6; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
