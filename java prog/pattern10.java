import java.lang.*;
import java.util.*;
class pattern10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int r = sc.nextInt();
        for(int i=1 ;i<=r;i++){
            for (int j=1;j<=r;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}