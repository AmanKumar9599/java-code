import java.lang.*;
import java.util.*;
class power{
    public static int power(int a,int b){
        int pow=1;
        for (int i=1;i<=b;i++){
            pow=pow*a;
        }
        System.out.print(pow);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        power(a,b);
    }

}