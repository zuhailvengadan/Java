package sectionone;
import java.util.Scanner;
public class Lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value a");
		int a=sc.nextInt();
		System.out.println("enter value b");
		int b=sc.nextInt();
		//lcm
		int lcm=a>b?a:b;
		
		while (true) {
			if (lcm%a==0 && lcm%b==0) {
				System.out.println(lcm+" is the lcm of "+a+","+b);
				break;
			}
			lcm++;
		}
			

	}

}
