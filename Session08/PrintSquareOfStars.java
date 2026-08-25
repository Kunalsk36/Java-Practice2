// Print a square of stars.

package Session08;

public class PrintSquareOfStars {
    public static void main(String[] args) {
        String star = " * ";
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
