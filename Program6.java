// Input currency in rupees and output in USD.

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
     
        Scanner sc= new Scanner(System.in);
        double rupees= sc.nextDouble();
        double dollar= rupees/83;

        System.out.println(dollar+" dollars");
        sc.close();

    }
}
