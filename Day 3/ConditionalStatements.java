public class ConditionalStatements{
	/**
	* Program to show use of conditional statements 
	*/
	public static void main(String args[]){
		int a = 1;
		int b = 5;
		boolean x = true;
		boolean y = false;
		// If else
		System.out.println("If-else");
		if(x){
			System.out.println("X : "+a);
		}else{
			System.out.println(b);
		}
		if(y){
			System.out.println(a);
		}else{
			System.out.println("Y : "+b);
		}
		// If-else if
		System.out.println("If-else-if");
		if(a>b){
			System.out.println("a : "+a);
		}else if(a<b){
			System.out.println("b : "+b);
		}
		
		// switch condition
		int xx = 0;
		System.out.println("Switch");
		switch(xx){
			case 0: System.out.println("a : " + a);
				break;
			case 1: System.out.println("b : " + b);
				break;
			default: System.out.println("default print");
		}
		System.out.println();
	}
}