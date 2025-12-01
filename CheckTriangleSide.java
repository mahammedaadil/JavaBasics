import java.util.Scanner;

public class CheckTriangleSide {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Side To Check: ");
        double a= sc.nextInt();
        System.out.println("Enter B Side To Check: ");
        double b= sc.nextInt();
        System.out.println("Enter C Side To Check: ");
        double c= sc.nextInt();

        if(a+b>c && b+c>a && c+a>b)
        {
            System.out.println("Valid Triangle");
        }
        else
        {
            System.out.println("Invalid Triangle");
        }
    }
}
