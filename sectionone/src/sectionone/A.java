package sectionone;
import java.util.Iterator;
import java.util.Scanner;
public class A {
		public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value");
		int n=sc.nextInt();
		int sum=0,temp=n,rem=0;
		while (n>9) {
			rem=n%10;
			while (n>0) {
				
			
			
			
				
				sum=sum+rem*rem;
				n=n/10;
		}
			if(sum>9) {
		n=sum;
			}
		}
		
		if (sum==1) {
			System.out.println("happy");
		}
		else
			System.out.println("not");
		
		}
}
