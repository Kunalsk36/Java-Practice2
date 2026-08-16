package PreviousPractice;
public class IncrementDecrement{
    public static void main(String[] args){
        // Increment Operator:
        
        // Pre Increment Operator:
        int num = 10; 
        System.out.println(++num); // 11
        System.out.println(num); // 11

        char ch = 'A';
        System.out.println(++ch); // B
        System.out.println(ch); // B

        // Post Increment Operator:
        int num2 = 10;
        System.out.println(num2++); // 10
        System.out.println(num2); // 11

        char ch2 = 'A';
        System.out.println(ch2++); // A
        System.out.println(ch2); // B

        // Expression:
        int a = 63;
        int b = -17;
        int c = ++a - b++ - a - ++b - b + a++;
        System.out.println("a : "+ a); // 65
        System.out.println("b : "+ b); // -15 
        System.out.println("c : "+ c); // 111

        int a2 = -12;
        int b2 = 18;
        int c2 = a2++ + ++b2 + 2*a2 - ++a2 - b2++ - 2*b2;
        int d2 = ++c2 - c2*c2 + 3*a2++ - ++b2/2;
        System.out.println("a2 : "+a2); // -9
        System.out.println("b2 : "+b2); // 21
        System.out.println("c2 : "+c2); // -63
        System.out.println("d2 : "+d2); // -4072
    }
}