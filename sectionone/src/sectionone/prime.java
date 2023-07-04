package sectionone;
import java.util.Scanner;

public class prime
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("range");
		int n=sc.nextInt();
		int count1=0;
		
		for(int i=1;i<=n;i++)
		
		{
			int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0) {
count++;
			}
		}
			if(count==2) {
				System.out.print(i+" ");
				 count1++;
			}
			
		}
		System.out.println("count is "+count1);

	}

}
