import java.util.IntSummaryStatistics;
import java.util.Scanner;

public class AutoMorphicno {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int dig=0;
        int square=n*n;
        while(n!=0){
            n=n/10;
            dig++;
        }
        if(square% ((int)Math.pow(10,dig)) ==temp){
            System.out.println("Automorphic number");

        }
        else {
            System.out.println("Not A Automorphic no.");
        }
    }
}
