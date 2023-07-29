import java.lang.*;
import java.util.*;
class oddSum{
    public static int oddSum(int a){
        int sum=0;
        for(int i=1;i<=a;i=i+2){
            sum=sum+i;
        }
        System.out.print(sum);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        oddSum(a);
    }

}