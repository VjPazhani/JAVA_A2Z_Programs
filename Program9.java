import java.util.Scanner;

public class Program9 {

    static boolean isArmstrong(int n) {
        int temp=n;
        int sum=0;
        while(temp!=0) {
            int rem=temp%10;
            sum=sum+ rem*rem*rem;
            temp=temp/10;
        }
        if(sum==n) {
         return true;
        }
        else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
       if(isArmstrong(n))
            System.out.println("It is Armstrong Number");
       else
            System.out.println("It is not Armstrog Number"); 
        sc.close();
    }
}
