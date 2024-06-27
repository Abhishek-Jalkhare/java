import java.util.Scanner;

public class puranaswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day= sc.nextInt();
        switch(day){
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2:{
                System.out.println("Tuesday");
                break;
            }
            case 3:{
                System.out.println("Wed");
                //jab break nhi lagate toh code girta chala jata hai baaki cases pr
            }
            default:{
                System.out.println("chodu");
            }

        }
    }
}
