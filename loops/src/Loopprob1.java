import java.util.Scanner;

public class Loopprob1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s =sc.next();
        int n= sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++)
            sum=sum+i;
        System.out.println(sum);
    }
}
