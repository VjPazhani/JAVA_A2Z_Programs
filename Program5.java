// Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();        
        int b=sc.nextInt();
        int c=sc.nextInt();

        int d= c>(a>b ? a: b) ? c:a>b ? a:b;
        System.out.println("The Largest number is: "+d);
        sc.close();
        // if(a>=b && a>=c)
        //     System.out.println("a is greatest");
        // else if(b>=a && b>=c)
        //     System.out.println("b is greatest");
        // else
        //     System.out.println("c is greatest");
    }
}
