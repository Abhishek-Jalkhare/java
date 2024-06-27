import java.util.Scanner;

public class primenomymethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 0;
        if (n == 1) {
            System.out.println("unique");
        }
        for (int i = 2; i <= n / 2; i++) {//n/2 tk bhi chala skte hai
            if (n % i == 0) {

                System.out.println("Not a Prime");
                flag = -1;
                break;
            }
        }
        if (flag != -1) {
            System.out.println("prime");
        }
    }
}
