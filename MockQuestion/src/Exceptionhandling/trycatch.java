package Exceptionhandling;
import java.util.Scanner;
public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int n=sc.nextInt();
		int sum=0,fact=1,temp=n;
		while (n>0) {
			int rem=n%10;
			sum=sum*10+rem;
			n=n/10;
			
		}
		if (sum==temp) {
			System.out.println(temp+" is paliodrome");
		}
		else {
			try {
			throw new Exception(temp+" not pali");
			
		}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
	}

}
}
