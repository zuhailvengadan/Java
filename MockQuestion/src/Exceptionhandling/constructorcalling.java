package Exceptionhandling;
import java.io.IOException;
public class constructorcalling {
	int a=3;
	int b=4;
	public constructorcalling() {
		int c=a+b;
		System.out.println(c);
	}
	public constructorcalling(int a) {
		
	this ();
		int d=this.a+a;
		System.out.println(d);
		
	}
	

	
	
	
}