import java.lang.*;
import java.util.*;
class pattern6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
        
            System.out.println();
       }
    }
}