// Check whether an alphabet is a vowel or consonant.

package Session04;

import java.util.Scanner;

public class AlphabetVowelOrConsonent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet : ");
        char ch = sc.next().charAt(0);
        ch = Character.toLowerCase(ch);
        // if(!Character.isLetter(ch)) {
        if(!(ch >= 'a' && ch <= 'z')) {
            System.out.println("The character is not Alphabet");
        }
        else if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The Alphabet is a Vowel.");
        }
        else {
            System.out.println("The Alphabet is Consonant.");
        }
        sc.close();
    }
}
