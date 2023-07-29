import java.lang.*;
import java.util.*;
class Strings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first name\n");
        String fname= sc.nextLine();
        System.out.print("Enter last name\n");
        String lname= sc.nextLine();
        String name=fname+" "+lname;
        System.out.println(name);
        System.out.println("String length:"+name.length());
        //charAt
        for(int i=0;i<name.length();i++){
            System.out.print(name.charAt(i));
        }
    }
}