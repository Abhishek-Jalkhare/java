public class Palindrome {
    public static void main(String[] args) {
        int n=12331;
        int temp=n;
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(rev==temp){
            System.out.println("Palindrome ");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }
}
