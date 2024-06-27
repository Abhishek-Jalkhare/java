public class loops {

    public static void main(String[] args) {
        int n=10;
        byte i=-9;
        for(i=0;i<=n;i--){//iterations would stop when  i would decrement from -128 as it is
            //out of bound for byte it will reverse to 127 and it is > 10 condition would be false

            System.out.println(i);
        }
        System.out.println(i);// condition false at 127
    }


}
