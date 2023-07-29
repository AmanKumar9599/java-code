import java.lang.*;
import java.util.*;
class mulFun{
    public static int mulfun(int a,int b){
        int mul=a*b;
        System.out.print(mul);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        mulfun(a,b);
    }

}