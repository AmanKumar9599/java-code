import java.lang.*;
import java.util.*;
class relation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.print("a=");
        a=sc.nextInt();
        System.out.print("b=");
        b=sc.nextInt();
        if (a==b){
            System.out.print("Equal");

        }
        else if (a>b){
            System.out.print("a is greater than b");
        }
        else{
            System.out.print("b is greater than a");
        }
    }
}