package Abinash;

public class Pratice3_Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum("Abinash");
		sum(1);
		sum();

	}
	
	 static  void  sum() {
		System.out.println("No argument method");
		
	}
	
	static void sum(int i)
	{
		System.out.println("Single argument Method");
		
	}
	
	static void sum(String s)
	{
		System.out.println("Single Argument Method of type String");
	}
	}


