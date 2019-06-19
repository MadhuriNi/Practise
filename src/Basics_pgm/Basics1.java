package Basics_pgm;

public class Basics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("I started learning");
		
	Header h=new Header();  // Create a object of the method class
	
     String d=h.ValidateHeader();      // call the method of method class
	
     System.out.println("Validate header is "+ d);
			
		//Addition of two numbers
		
		int a, b,c;
		
		String s,n;
		
		a=2;
		b=3;
		
		c=a+b;
		
		System.out.println("Addition is "+c);
		
		
		s="Madhuri";
		n="is Mad";
		
		System.out.println("String is "+s+" "+n);
		
		
		Footer f= new Footer();
		
		f.ValidateFooter();
		
		
	}

}
