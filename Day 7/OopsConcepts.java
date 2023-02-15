/**
* Program to demonstrate use of Classes in Java
*/
class Pen{
	String company;
	String color;
	
	public void write(){
		System.out.println(company);
	}
	
	public void writeColor(){
		System.out.println(color);
	}
	
}

public class OopsConcepts{
	public static void main(String args[]){
		Pen x = new Pen();
		x.company = "Reynolds";
		x.color = "blue";
		x.write();
		x.writeColor();
	}
}