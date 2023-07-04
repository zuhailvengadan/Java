package UserdefinedException;
import java.util.Scanner;

import Exceptionhandling.notabletovote;
public class Eligibilityforvote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
        int age=sc.nextInt();
        if (age>=18) {
        	System.out.println("eligile for vote");
        }
        else {
        	try{
        		throw new Notabletovote();
        	}
        	catch(Notabletovote e){
        		System.out.println(e.getMessage());
        	}
        	
        }
	}

}
