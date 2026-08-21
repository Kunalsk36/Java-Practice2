// Calculate grade using the given A–F percentage rules.
/*
    Percentage        Grade
    100               O
    90-99             A+
    80–89             A
    70–79             B+
    60–69             B
    50–59             C+
    35-49             C
    Below 35          F
*/

package Session05;

import java.util.Scanner;

public class CalcGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage: ");
        double percentage = sc.nextDouble();
        String grade = "";
        if(percentage > 100 || percentage < 0) {
            System.out.println("Entered wrong percentage not in range of 0 to 100");
        } else { 
            if(percentage == 100) {
                grade = "O";
            }
            else if(percentage >= 90) {
                grade = "A+";
            }
            else if(percentage >= 80) {
                grade = "A";
            }
            else if(percentage >= 70) {
                grade = "B+";
            }
            else if(percentage >= 60) {
                grade = "B";
            }
            else if(percentage >= 50) {
                grade = "C+";
            }
            else if(percentage >= 35) {
                grade = "C";
            }
            else {
                grade = "F";
            }
            System.out.println("The final grade is "+grade);
        } 
        sc.close();
    }
}