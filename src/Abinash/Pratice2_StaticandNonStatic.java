package Abinash;

public class Pratice2_StaticandNonStatic {
 static int a=10;
  int b =20;
  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pratice2_StaticandNonStatic obj =new Pratice2_StaticandNonStatic();
		obj.look();
		display();
		Pratice2_StaticandNonStatic.display();
	}

	
	static void display() {
		System.out.println("Static Method calling");
	}
		
		public void  look() {
			 System.out.println ("Non Static Method Calling");
			
		}
		
	}


	

