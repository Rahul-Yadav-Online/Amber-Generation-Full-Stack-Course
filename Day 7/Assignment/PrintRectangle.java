/**
* Program to print a rectangle of Stars using nested loops
*/
import java.util.Scanner;

public class PrintRectangle{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Length : ");
		int len = in.nextInt();
		System.out.print("Width : ");
		int wid = in.nextInt();
		for(int i=0; i<wid; i++){
			System.out.print("*");
			for (int j=0; j<len-2; j++){
				if(i == 0 || i == wid-1){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.print("*\n");
		}
		
	}
}