
import java.util.Scanner;

public class guesstheno {
    public static void main(String[] args) {
        int ans=(int)(1000*Math.random());//math.randomn  ek double return krta hai jo
        System.out.println("Enter your guess");// 0 aur 1 ke beech mein hota hai
        Scanner sc=new Scanner(System.in);
        do{
            int guess= sc.nextInt();
            if(guess==ans){
                System.out.println("no. guessed");
                break;
            }
            if(guess>ans){
                System.out.println("chota hai");
            }
            else{
                System.out.println("bada hai");
            }
        }while (true);
    }
}
