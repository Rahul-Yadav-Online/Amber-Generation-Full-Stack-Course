/**
 * Program to check if a n digit number is a Armstrong number
 */

 import java.util.Scanner;

 public class Armstrong{
    public static int pow(int x, int y){
        if(y==1){
            return x;
        }
        return x*pow(x,(y-1));
    }
     public static void main(String[] args){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter the Number : ");
         int num = in.nextInt();
         long sum = 0;
         int temp = num;
         int digits = 0;
         int digit = 0;
         while(temp>0){
            temp = temp/10;
            digits++;
         }
         temp=num;
         for(int i=0; i<digits; i++){
            digit = temp%10;
            sum = sum+pow(digit, digits);
            temp = temp/10; 
         }
         if(sum == num){
            System.out.println(num+" is an Armstrong number.");
         }else{
            System.out.println(num+" is not an Armstrong number.");
         }
     }
 }
 