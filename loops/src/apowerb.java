import java.util.Scanner;

public class apowerb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int base=1;
        for(int i=1;i<=b;i++){
            base=base*a;
        }
        System.out.println(base);
    }
}
