public class loopprob3 {
    public static void main(String[] args) {
        int so = 0;//odd ka sum
        int se = 0;//even ka sum
        int r  = 5; //range
        for (int i = 0; i <= r; i++) {
            if (i % 2 == 0)
                se = se + i;
            else
                so = so + i;
        }
        System.out.println(so + "   " + se);
    }
}
