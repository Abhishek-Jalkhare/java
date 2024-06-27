import java.sql.SQLOutput;
import java.util.Scanner;

public class calcdowhile {
    public static void main(String[] args) {
        // /n se print statement ke beech ein lagane se nyi line
        // /t se space aata hai ek tab barabar
        // // se sirf / print hojata hai
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Press 1 For SUM\nPress 2 for Product");
            ch = sc.nextInt();
            System.out.println("enter two number");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (ch == 1) {
                System.out.println(a + b);
            } else if (ch == 2) {
                System.out.println(a * b);
            } else
                System.out.println("chutiya hai gupta");
            System.out.println("Press 1 to repeat");
            ch = sc.nextInt();
        }while (ch==1);
    }
}
