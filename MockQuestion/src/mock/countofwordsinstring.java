package mock;
import java.util.Scanner;
public class countofwordsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter string");
	      String a=sc.nextLine();
int count=0; 

	       for(int i=0;i<=a.length()-1;i++) {
	    	 a.charAt(i);
	    	   if (a.charAt(i)==' ') {
count++;

	    	   }
	       }
	    	   System.out.println(count+1+" words present");

	       
	}

}
