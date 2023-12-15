// To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class Program8 {

 //1. Naive Approach
    static boolean isPalindrome(String s) {
        String rev="";

        boolean ans=false;

        for(int i=s.length()-1;i>=0;i--) {
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)) {
            ans=true;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        boolean a=isPalindrome(s);
        System.err.println(a);

        sc.close();
    }
}
