/**
* Program to print a diamond of Stars
*/
import java.util.Scanner;

public class PrintDiamond{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Length of Diamond : ");
		int len = in.nextInt();
		for(int i=0; i<(len/2); i++){
			for (int j=0; j<((len/2)+i+1); j++){
				if(j < ((len/2)-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
		for(int i=((len/2)); i>=0; i--){
			for (int j=0; j<((len/2)+i+1); j++){
				if(j < ((len/2)-i)){
					System.out.print(" ");
				}else{
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}
	}
}