import java.lang.*;
import java.util.*;
class calculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=sc.nextInt();
        
        System.out.println("Enter any operator '+' , '-' , '*' , '/' , '%':");
        char symbol=sc.next().charAt(0);
        System.out.println("Enter Second number:");
        int b=sc.nextInt();
        switch(symbol){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            break;
            case '%':System.out.println(a%b);
            break;
            default :System.out.println("Error");
        }
        
    }
}