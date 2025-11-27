import java.util.Scanner;

public class NumberDivisible {

    public static void main(String[] args) {

        int b=5;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To Check Divisible Number To 5");
        int a=sc.nextInt();

        if(a%b==0){
            System.out.println("Number is divisable");
        }
        else
        {
            System.out.println("Number is not divisible");
        }

    }
}
