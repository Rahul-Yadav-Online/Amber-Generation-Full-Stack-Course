/**
 * Program to print fibonacci numbers
 */

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Number of terms : ");
        int terms = in.nextInt();
        int sum = 0, prev_term=0;
        if(terms <= 0){
            System.out.println("[!] Invalid Number of terms! Please enter a positve number.");
            return;
        }
        if(terms == 1){
            System.out.println("1");
            return;
        }else{
            System.out.print("1\t");
            sum = 1;
            for(int i = 0; i < terms-1; i++){
                sum = sum+prev_term;
                System.out.print(sum+"\t");
                prev_term = sum-prev_term;
            }
        }
    }
}
