package sectionone;
import java.util.Scanner;
public class Stringa {

	public static void main(java.lang.String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string");
		String a= sc.next();
		String b="";
		System.out.println(b);
		for(int i=a.length()-1;i>=0;i--) {
			b=b+" "+a.charAt(i);
		}
		System.out.println(b);
		// TODO Auto-generated method stub
 for (int i=0;i>=a.length()-1;i++) {
	 for (int j=0;j<=a.length()-1;j++) {
		 if (a[i]==b[j]) {
	 }
 }
	}
	}
}


