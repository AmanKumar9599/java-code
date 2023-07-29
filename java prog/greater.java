import java.lang.*;
import java.util.*;
class greater{
    public static void great(int a,int b){
        if (a>b){
            System.out.print(a);
        }
        else if (b>a){
            System.out.print(b);
        }
        else{
            System.out.print("Equal");
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a=sc.nextInt();
        
        System.out.print("Enter second number:");
        int b=sc.nextInt();
        great(a,b);
    }

}