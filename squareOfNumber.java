import java.util.Scanner;

public class squareOfNumber {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Number For Square: ");
        double s=sc.nextDouble();
        double result=s*s;
        System.out.println("Square Of The Number Is: "+result);
    }
}
