package sectionone;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value a");
		int n=sc.nextInt();
		//perfect 
		int sum=0;
		for (int j=1;j<=n;j++) {
			
		sum=0;
		for (int i=1;i<j;i++) {
			if(j%i==0) {
				sum=sum+i;
				
			}
		}
		if(sum==j) {
			
			System.out.println(j+" is perfect");
		}
		}
		}
	
}


