package Session04;

import java.util.Scanner;

public class ConvertUpperCaseCharToLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(ch >= 'A' && ch <= 'Z') {
            char lowerCaseCh = (char) (ch + ('a' - 'A'));
            System.out.println(lowerCaseCh);
        }
        else{
            System.out.println("Enter the Upper Case Alphabet.");
        }
        sc.close();
    }
}
