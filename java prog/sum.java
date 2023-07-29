import java.lang.*;
import java.util.*;
class sum{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter the value of a and b:");
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;        
        System.out.print("The sum of a and b is "+ c);
    }
}