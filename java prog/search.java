import java.lang.*;
import java.util.*;
class search{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to search:");
        int n=sc.nextInt();
        System.out.print("Enter size of array:");
        int a=sc.nextInt();
        int marks[]=new int[a];
        System.out.print("Enter marks:");
        for(int i=0;i<a;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<a;i++){
            if(n==marks[i]){
                System.out.print("The number has been found on the index: "+i);
            }
            else{
                System.out.print("The number does not exist in the given array")
            }
        }
    }
}