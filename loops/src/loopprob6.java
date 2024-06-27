import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class loopprob6

    /* Name of the class has to be "Main" only if the class is public. */

    {
        public static void main (String[] args)
        {
            Scanner sc= new Scanner(System.in);
            int t=sc.nextInt();
            int n=sc.nextInt();
            for(int o=0;o<t;o++){
                int om[]=new int[n];
                for(int i=0;i<n;i++){
                    om[i]=sc.nextInt();
                }
                int addy[]=new int[n];
                for(int j=0;j<n;j++){
                    addy[j]=sc.nextInt();
                }
                int temp=0;
                int streak=0;
                int k=0;
                while(k<n){
                    while(om[k]!=0   ){
                        temp=temp+1;
                        k++;
                        if(k==n){
                            break;
                    }
                    if(streak<temp){
                        streak=temp;
                    }
                    temp=0;
                    k++;
                }
                temp=0;
                int streak1=0;
                k=0;
                while(k<n){
                    while(addy[k]!=0   ){
                        temp=temp+1;
                        k++;
                        if(k==n){
                            break;
                        }
                    }
                    if(streak1<temp){
                        streak1=temp;
                    }
                    temp=0;
                    k++;
                }
                if(streak1>streak){
                    System.out.println("ADDY");
                }
                else if(streak>streak1){
                    System.out.println("OM");
                }
                else{
                    System.out.println("DRAW");
                }
            }
        }
    }
}
