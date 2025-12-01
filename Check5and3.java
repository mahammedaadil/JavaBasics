import java.util.Scanner;

public class Check5and3 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number To Check: ");
        int digit= sc.nextInt();
        if(digit%5==0 || digit%3==0){
            System.out.println("Number Is Divisible By 5 And 3");
        }
        else
        {
            System.out.println("Its Not Divisible");
        }

    }

}
