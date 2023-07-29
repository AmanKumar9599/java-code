//compare
import java.lang.*;
import java.util.*;
class substring{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name\n");
        String fname= sc.nextLine();
        String name=fname.substring(0,5);
        System.out.print(name);
    }
}