package Exceptionhandling;
import java.util.Scanner;
public class customException{

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18) {
        System.out.println("eligible to vote");
		} 
		else {
	try {
        throw new notabletovote();
        
	    }
		catch(notabletovote e) {
			System.out.println(e.getMessage());
		}
	
         
}
}
}
	

	
