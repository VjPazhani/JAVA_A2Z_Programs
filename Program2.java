// Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String msg= sc.nextLine();

        System.out.println("Welcome, "+msg+".");
        sc.close();
    }
}
