package learning;
import java.util.Scanner;
public class Fbfull2 {
	
	public static void register() {
		String password1,password2;
		//String  password[]= new String [2];
	
	
		System.out.println("");
		System.out.println("");
        System.out.println("           join facebook");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("  first name         surname");
		System.out.println(" ");
		System.out.println("  date of birth ");
		System.out.println(" ");
		System.out.println("  enter the phone number");
		System.out.println(" ");
		System.out.println("  enter the new password");
		System.out.println(" ");
		System.out.println("  confirm password");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("           [SIGN UP] ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter first name");
	    String firstname=sc.next();
	    System.out.println(" enter surname");
	    String surname=sc.next();
	    System.out.println(" enter date of birth");
	    int dateofbirth=sc.nextInt();
	    System.out.println(" enter the phone number");
	    int phonenumber=sc.nextInt();
	    System.out.println(" enter gender ");
	    String gender=sc.next();
	    System.out.println(" enter the new password");
	    password1=sc.next();
	    System.out.println(" confirm password");
	    password2=sc.next();
	    System.out.println("");
	    System.out.println("");
	    
	   // if (password1==password2) {
	    	System.out.println("    sign in successfull");
		    System.out.println("");
		    System.out.println("");
		    System.out.println("****WELCOME TO FACEBOOK****");
		    
	    	
	  /*  }
	    else
	    	System.out.println("both password should be same");*/
	    	
	    
	}
}
