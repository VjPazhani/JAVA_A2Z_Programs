// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest

import java.util.Scanner;
public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Pricipal amount: ");
        double p = sc.nextDouble();
        System.out.println("Enter the time period: ");
        double t=sc.nextDouble();
        System.err.println("Enter the Rate of interest: ");
        double r=sc.nextDouble();

        double SimpleInterst= (p * t * r )/100;

        System.out.println("The Simple Interest "+SimpleInterst);
        double Amount= p+SimpleInterst;

        System.out.println("The Total Amount "+Amount);
        sc.close();

    }
}
