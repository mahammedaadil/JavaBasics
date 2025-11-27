import java.sql.SQLOutput;
import java.util.Scanner;

public class FourDigitCheck {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To Check Four Digit Or Not: ");
        int a=sc.nextInt();

        if(a>999 && a<10000){
            System.out.println("Its Four Digit");
        }
        else
        {
            System.out.println("Its Not Four Digit");
        }
    }
}
