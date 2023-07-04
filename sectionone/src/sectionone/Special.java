package sectionone;
import java.util.Scanner;

public class Special {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value a");
		int n=sc.nextInt();
		//special
		int rem=0,sum=0,fact=1,temp=n;
		int j=1;
		while(j<=n) {
		temp=j;	
		
		while(j>0) {
			rem=j%10;
			
			fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			j=j/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is special");
			
		}
		sum=0;
		j=temp;
		j++;
	}
	}
}
