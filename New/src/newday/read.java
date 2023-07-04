package newday;
import java.util.Scanner;

public class read {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value count");
		int count=sc.nextInt();
		int n1=0,n2=1,n3=n1+n2;
		System.out.print("{");
		if(count%2==0)
			{
			count=count-1;
			}
		else
		{
			count=count;
		}
		
		for(int i=1;i<=count;i++)
		{
			n3=n1+n2;
			System.out.print(n3+" ");
		
			n1=n2;
			n2=n3;
		}
		System.out.print("}");	
		
		// TODO Auto-generated method stub

	}

}
