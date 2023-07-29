import java.lang.*;
import java.util.*;
class infinite{
    public static int inf(int a){
        do{
            System.out.println("Hello Aman");
        }
        
        while (a!=0);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
    
        inf(a);
    }

}