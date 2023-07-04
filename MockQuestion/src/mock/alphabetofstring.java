package mock;
import java.util.Scanner;
public class alphabetofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
      System.out.println("enter string");
      String a=sc.next();

      System.out.print("[ ");
     for(int i=0;i<=a.length()-1;i++) {
    	 System.out.print(a.charAt(i)+" ");
     }
     System.out.print("] these Are alpabelts in string");

	}

}
