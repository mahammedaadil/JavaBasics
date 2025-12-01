import java.util.Scanner;

public class Checknames {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number To Check: ");
        int a= sc.nextInt();
        if(a%5==0 && a%3==0){
            System.out.println("Apurva");
        }
        else if (a%5 !=0 && a%3 !=0){
            System.out.println("Isha");
        }
        else if (a%5==0) {
            System.out.println("Riya");
        }
        else
        {
            System.out.println("Banu");
        }


    }
}
