import java.lang.*;
import java.util.*;
class common{
    public static void commonDivisor(int a,int b){
        int c=1;
        if(a>b){
            for (int i=1;i<=b;i++){
                if (a%i==0 && b%i==0){
                    c=i;
                }
            }
        }
         if(a<b){
            for (int i=1;i<=a;i++){
                if (a%i==0 && b%i==0){
                    c=i;
                }
            }
        }
    System.out.print(c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        commonDivisor(a,b);
    }
}