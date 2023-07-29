import java.lang.*;
import java.util.*;
class Greeting{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
        // if (num==1){
        //     System.out.print("Hello");

        // }
        // else if(num==2){
        //     System.out.print("Namaste");

        // }
        // else if (num==3){
        //     System.out.print("Bonjour");
        // }
        // else{
        //     System.out.print("Invalid button");


        switch(num){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste");
            break;
            case 3:System.out.println("Bonjour");
            break;
            default: System.out.println("Invalid button");
        }
    }
}