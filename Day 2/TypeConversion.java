public class TypeConversion{
	/**
	* Program to show javas Implicit Type casting 
	*/
	public static void main(String args[]){
		String name = "XYZ";
		int marks = 90;
		double percentage = marks;	// Here integer type marks are implicitly converted to
									// double by the compiler during compilation
		System.out.println("Name = "+(name));
		System.out.println("Marks = "+(marks));
		System.out.println("Percentage = "+(percentage));
		
		int marks2 = (int)85.98;
		System.out.println("Percentage of 2nd subject : "+(double)marks2); // explicit typeconversion
	}
}