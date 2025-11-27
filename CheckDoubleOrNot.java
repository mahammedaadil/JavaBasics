import java.util.Scanner;

public class CheckDoubleOrNot
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number To Check Absolute Value: ");
        double a=sc.nextDouble();

        if(a-(int)a==0){
            System.out.println("its integer");
        }
        else
        {
            System.out.println("its not an integer");
        }
    }
}
