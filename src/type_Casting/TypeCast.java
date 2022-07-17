package type_Casting;

public class TypeCast {

	public static void main(String[] args) 
	{
		//implicit type casting
		System.out.println("Implicit Type Casting");
		char x='A';
		System.out.println("Value of a: "+x);
		int b=x;
		System.out.println("Value of b: "+b);
		float c=x;
		System.out.println("Value of c: "+c);
		long d=x;
		System.out.println("Value of d: "+d);
		double e=x;
		System.out.println("Value of e: "+e);
		System.out.println("Explicit Type Casting");
		//explicit type casting 
		double xx=45.5;
		int y=(int)xx;
		System.out.println("Value of xx: "+xx);
		System.out.println("Value of y: "+y);
		
	}
}

