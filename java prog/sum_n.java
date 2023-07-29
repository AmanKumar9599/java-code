import java.lang.*;
import java.util.*;
class sum_n{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int i;
        for(i=0;i<=n;i++){
            sum+=i;
            
        }
        System.out.println(sum);
    }
}