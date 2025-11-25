import java.util.Scanner;

public class typeCasting {
    public static void main(String[] args) {

    //implicitely doing type casting.
        Scanner tc=new Scanner(System.in);
        System.out.println("Enter Character To Convert: ");
        char ch=tc.next().charAt(0);
        int gi=ch;
        System.out.println("Your generated Ascii Value Implicitely: "+gi);
    //explicitely doing type casting.
        int ge=(int)ch;
        System.out.println("Your generated Ascii Value explicitely: "+ge);


    }
}
