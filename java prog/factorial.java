import java.lang.*;
import java.util.*;
class factorial{
    public static int fact(int a){
        int f=1;
        if (a<0){
            System.out.print("Invalid number");
        }
        else{
            for(int i=1;i<=a;i++){
                f=f*i;
            }
            System.out.print(f);
           
        }
         return 0;
         
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a=sc.nextInt();
        fact(a);
    }

}