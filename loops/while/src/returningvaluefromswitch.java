public class returningvaluefromswitch {
    public static void main(String[] args) {
        int day=4;
        String ans= switch (day){
            case 1 ->{
                yield "monday";//yield return ka bhai

            }
           // case 2 -> yield "tue"; yield jabhi likhte jb bracket ho
            default -> "gaandu";// bina yield ke aise valu return krate hai

        }; // kisi bhi cheez ko = ke ek trf likh de toh woh expression bn jata hai usko
    }      // ; se terminate krna hai

}
