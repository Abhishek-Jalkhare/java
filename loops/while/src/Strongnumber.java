public class Strongnumber {
    public static void main(String[] args) {
        int n = 145;
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int r = n % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Strong Number");
        } else {
            System.out.println("Not A Strong Number");
        }
    }
}
