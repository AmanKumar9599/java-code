import java.lang.*;
import java.util.*;
class pattern7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of rows:");
        int c=0;
        int r=sc.nextInt();
        for(int i=1;i<=r;i++){
            
            for (int j=1;j<=r-c;j++){
                System.out.print(j);
                
            }c++;
        
            System.out.println();
       }
    }
}