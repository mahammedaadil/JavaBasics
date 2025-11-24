import java.util.Scanner;



public class simpleInterest {
    public static void main(String[] args) {

        Scanner mysc=new Scanner(System.in);
        System.out.print("Please Enter Principle Amount: ");
        double principle=mysc.nextDouble();
        System.out.print("Please Enter Rate Percentage: ");
        double rate=mysc.nextDouble();
        System.out.print("Please Enter Time Period: ");
        double time=mysc.nextDouble();

        double SimpleInterest=principle*rate*time/100;

        System.out.println("Simple Interest Is: "+SimpleInterest);



    }
}
