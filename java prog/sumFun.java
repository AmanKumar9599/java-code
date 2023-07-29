import java.lang.*;
import java.util.*;
class sumFun{
    public static int sumfun(int a,int b){
        int sum=a+b;
        System.out.print(sum);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        sumfun(a,b);
    }

}