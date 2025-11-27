import java.util.Scanner;

public class oddEven {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Nummber To Check Odd Even: ");
        int a= sc.nextInt();

        if(a%2==0){
            System.out.println("its even number");
        }
        else {
            System.out.println("its odd number");
        }
    }
}
