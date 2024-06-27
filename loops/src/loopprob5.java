public class loopprob5 {
    public static void main(String[] args) {
        int n = 6;


        int sum = 0;
        for (int i = 1; i < n/2; i++) {//aga itself ko chodna haitoh loop n/2 tk check kro
            if (n % i == 0) {
                //i factor
                sum += i;//sum of factor

            }


        }


        System.out.println(sum);
    }
}
