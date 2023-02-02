import java.util.*;

public class ProductList{
	/**
	* Take 3 Product name and their price as Input and return the total Price of all Products
	*/
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		// Enter the Name of Products
		System.out.print("Enter name of 1st product : ");
		String prod_name1 = cin.next();
		System.out.print("Enter name of 2nd product : ");
		String prod_name2 = cin.next();
		System.out.print("Enter name of 3rd product : ");
		String prod_name3 = cin.next();
		// Enter the Price of the Products
		System.out.print("Enter price of "+prod_name1+" product : ");
		int prod_price1 = cin.nextInt();
		System.out.print("Enter price of "+prod_name2+" product : ");
		int prod_price2 = cin.nextInt();
		System.out.print("Enter price of "+prod_name3+" product : ");
		int prod_price3 = cin.nextInt();
		// Print the Total of Product Prices
		System.out.println("\n------\nTotal Price : "+(prod_price1+prod_price2+prod_price3));
		
	}
}