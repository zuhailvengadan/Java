package abstraction;
import java.util.Scanner;
public class prog5 {
 static String rev="";
 static String b[]= {"raj","hi"};
 	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		String a=sc.next();
		// TODO Auto-generated method stub
		
		
		
		try {
     for (int i=a.length()-1;i>=0;i--) {
    	rev=rev+a.charAt(i);
    	//System.out.println(b[2]);
    	
     }
		}
     
		
		catch(Exception a1)
		{
			System.out.print(a1.getMessage());
		}
		System.out.println(a.charAt(3));
     System.out.println(rev);
	}

}
