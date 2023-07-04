package mock;
import java.util.Scanner;
public class stringpalodrome  {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter string");
		String b=sc.next();
		
		String temp="";
		for( int i=b.length()-1;i>=0;i--) {
			
			
			temp=temp+b.charAt(i);
			
			
		}
		if(temp.equals(b)) {
			
		
		System.out.println(temp+" is palidrome");
		}
		else
			System.out.println(temp+" is not palidrome");
			
	}

}
