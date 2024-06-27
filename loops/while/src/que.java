import java.util.Scanner;

public class que {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);



        char a = sc.next().charAt(0);
        String result = switch (a) {
            case 'A', 'a', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' -> "vowel";
            default -> "consonant";

        };
        System.out.println(result);

    }
}