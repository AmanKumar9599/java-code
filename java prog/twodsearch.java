import java.lang.*;
import java.util.*;
class twodsearch{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows of array:");
        int r=sc.nextInt();
        System.out.println("Enter columns of array:");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.print("Enter a number to searrch:");
        int n=sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if (arr[i][j]==n){
                    System.out.print("The index at which the number is found:"+i+","+j);
                }
            }
        }
    }   
}