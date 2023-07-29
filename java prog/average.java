import java.lang.*;
import java.util.*;
class average{
    public static int average(int a,int b,int c){
        int sum=a+b+c;
        int av=sum/3;
        return av;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        System.out.print("Enter third number:");
        int c=sc.nextInt();
        System.out.print(average(a,b,c));
    }

}