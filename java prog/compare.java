//compare
import java.lang.*;
import java.util.*;
class compare{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name\n");
        String fname= sc.nextLine();
        System.out.print("Enter last name\n");
        String lname= sc.nextLine();
        //  s1>s2:+ve value
        // s1==s2:0
        //  s1<s2:-ve
        if(fname.compareTo(lname)==0){
            System.out.println("Strings are equal");
        }
        else{
            System.out.print("not equal");
        }
    }
}