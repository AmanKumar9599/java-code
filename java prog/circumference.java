import java.lang.*;
import java.util.*;
class circumference{
    public static int circum(int r){
        double cir=3.14*r*r;
        System.out.print(cir);
        return 0;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius:");
        int a=sc.nextInt();
        circum(a);
    }

}