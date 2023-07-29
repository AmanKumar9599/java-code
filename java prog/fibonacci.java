import java.lang.*;
import java.util.*;
class fibonacci{
    public static int fibo(int n){
        int a=0;
        int b=1;
        if(n>=1){
            if (n==1){
                System.out.println("0");}
            else if(n==2){
                System.out.println("0 1");}
            else if(n>=3){
                System.out.print("0 1 ");
                for(int i=1;i<=n-2;i++){
                    int c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                    
                }
            }

        }
        else{
            System.out.print("please enter valid data");
        }
        
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int a=sc.nextInt();
        fibo(a);

            }

}