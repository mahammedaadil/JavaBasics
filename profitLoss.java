import java.util.Scanner;

public class profitLoss {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Costing Price: ");
        int cp= sc.nextInt();
        System.out.println("Enter Selling Price: ");
        int sp= sc.nextInt();

        if(sp>cp) System.out.println("Profit is: "+(sp-cp));
        if(cp>sp) System.out.println("Lost is: "+(cp-sp));
        if(sp==cp) System.out.println("No Profit No Loss");

        int profit=sp-cp/cp*100;
        System.out.println("Profit % gained by Seller : "+profit + "%");

    }
}
