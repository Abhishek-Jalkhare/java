import java.util.Scanner;
//switch case kb lagta hai-
//single variable s ecompare (==) wala comp
//== wala hee comparison
//constant ke saath comparison
//no case duplicacie allowed
//related to hashing
//floating cases nhi allowed because ambigouity
//8.45 8.45000040 ki tarh bhi store ho skta hai
//saare case check nhi hote seedhe shi waale pe jaate isliye fast
//to accomplish that switch table is used just like hash table
//this is newer version of switch case jisme -> lagta
public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            // case day++ is invalid bcause only const expressions are allowed kuki variable value ki mapping nhi hoti
            case 6 -> System.out.println("Saturday");
            case 7,8 -> System.out.println("Sunday");// 7,8 pr same output chahiye toh aise likhte
            default -> System.out.println("Gupta Gaandu hai pr tum kyu bn rhe");//saare case agr nhi chale toh default chlta


        }
    }
}
