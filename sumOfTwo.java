import java.util.Scanner;

public class sumOfTwo {

    public static void main(String[] args) {

        Scanner aadil=new Scanner(System.in);
        System.out.print("Please give first number to sum: ");
        double a=aadil.nextDouble();
        System.out.print("Please give second number to sum: ");
        double b=aadil.nextDouble();

        double result=a+b;

        System.out.println("Sum Of Two Numbers Is:"+result);
    }
}
