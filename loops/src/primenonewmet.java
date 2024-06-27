import java.util.Scanner;

public class primenonewmet {
    //agar kisi bhi no. factor uske sqr root tk nhi mila toh aage bhi nhi milega
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        if (n <= 1) {
            System.out.println("not prime");
        }
        for (int i = 2; i <= (int)Math.sqrt(n) / 2; i++) {//  sqrt ko int mein typecast karna
            if (n % i == 0) {

                System.out.println("Not a Prime");
                flag = false;
                break;
            }

        }
        if (flag ) {//flag true ki condition
            System.out.println("prime");

        }
    }
}
