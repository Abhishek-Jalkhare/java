public class while1 {
    public static void main(String[] args) {
        int n=1234;
        while(n!=0){
            int rem=n%10;
            System.out.println(rem);
            n=n/10;
        }
        System.out.println();
        //in for
        for(n=1234;n!=0;n=n/10){
            int rem1=n%10;
            System.out.println(rem1);
        }
    }
}
