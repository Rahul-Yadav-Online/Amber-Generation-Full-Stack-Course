public class Operators{
	/**
	* Program to show use of javas operators 
	*/
	public static void main(String args[]){
		int a = 1;
		int b = 5;
		boolean x = true;
		boolean y = false;
		// Unary Operators
		System.out.println("\nIncrement and Decrement : ");
		System.out.println(a++);
		System.out.println(a);
		System.out.println(a--);
		System.out.println(a);
		System.out.println(++b);
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		System.out.println("\nNegation and Not : ");
		System.out.println(b);
		System.out.println(~b);
		System.out.println(~(-1*b));
		System.out.println(x);
		System.out.println(!x);
		
		// Arithmetic Operators
		System.out.println("\nArithmetic Operator");
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		// Logical and Bitwise Operator
		System.out.println("\nLogical and Bitwise Operator");
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<b && a>b); // if first condition is false then return false
		System.out.println(a<b || a>b); // if first condition is true then return true
		System.out.println(a<b & a>b); // check both contitions before returning true or false
		System.out.println(a<b | a>b); // check both contitions before returning true or false
		
		// Ternary operator
		System.out.println("\nTernary operator");
		System.out.println(a>b?a:b);
	}
}