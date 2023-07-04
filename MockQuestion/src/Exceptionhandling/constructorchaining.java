package Exceptionhandling;

public class constructorchaining extends constructorcalling{
	public constructorchaining() {
	super(2);
		System.out.println("2 nd con"+super.a);
	}

	public static void main(String[] args) {
		constructorchaining a1=new constructorchaining();
		
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage()+" Arithmatic");
		}
    finally 
    {
	     System.out.println("bye");
	
}
	}

}
