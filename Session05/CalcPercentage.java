// Input marks of five subjects and calculate percentage.

package Session05;

import java.util.Scanner;

public class CalcPercentage {
    public static void main(String[] args) {
        // When each subject can have different maximum marks.

        /* double totalMarksObtain = 0;
        double totalMaxMarks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total maximum marks : ");
        totalMaxMarks = sc.nextDouble();
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter the marks for subject "+i+" : ");
            totalMarksObtain += sc.nextDouble();
        }
        double percentage = (totalMarksObtain/totalMaxMarks) * 100;
        System.out.println("The percentage is "+percentage);
        sc.close();
         */

        // Assume that each subject is out of 100 marks.
        Scanner sc = new Scanner(System.in);
        int totalMarks = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.println("Enter the marks for Subject "+i+" : ");
            totalMarks += sc.nextInt();
        }
        double percentage = totalMarks / 5.0;
        System.out.println("The percentage are "+percentage);
        sc.close();
    }
}
