import java.util.Scanner;

public class AbsoluteVal {


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number To Check Absolute Value: ");
        int a=sc.nextInt();
        if(a>=0){
            System.out.println(a);
        }
        else{
            System.out.println(-a);
        }
    }
}
