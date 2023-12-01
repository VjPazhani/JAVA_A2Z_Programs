// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.Scanner;
public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Choose any operater +,-,*,/: ");
        System.out.println();
        String c= sc.next();
        if(c.equals("+"))
            System.out.println("The value "+(a+b));
        if(c.equals("-"))
            System.out.println("The value "+(a-b));
        if(c.equals("*"))
            System.out.println("The value "+(a*b));
        if(c.equals("/"))
            System.out.println("The value "+(a/b));
        sc.close();
    }
}
