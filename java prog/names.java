import java.lang.*;
import java.util.*;
class names{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student name's you want:");
        int n=sc.nextInt();

        String names[]=new String[n];
        System.out.print("Enter names:");
        for(int i=0;i<n;i++){
            names[i]=sc.next();
        }
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
           
        }
    }
}