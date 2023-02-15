/**
 * Program to calculate the power 
 */

 import java.util.Scanner;
public class Power {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("base : ");
        int base = in.nextInt();
        System.out.print("pow : ");
        int pow = in.nextInt();
        long res = 1;
        for(int i = 0; i < pow; i++ ){
            res = res*base;
        }
        System.out.println(base+"^"+pow+"="+res);
    }
}
