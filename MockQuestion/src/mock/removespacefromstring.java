package mock;
import java.util.Scanner;
public class removespacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	      System.out.println("enter string");
	      String a=sc.nextLine();
	      String c="";
	      for(int i=0;i<=a.length()-1;i++) {
	    	  
	    	 if (a.charAt(i)!=' ') {
	    		 c=c+a.charAt(i);
	    	 } 
	      }
	     System.out.println(c);
	      
	}

}
