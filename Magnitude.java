import java.util.Scanner;

public class Magnitude {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To Check Magnitude To 69 or not");
        double n=sc.nextDouble();

        if(n-(int)n==0 && n<69){
            System.out.println("Number is MAgnitude to smaller 69");
        }
        else
        {
            System.out.println("Number is not MAgnitude to smaller 69");
        }

    }
}
