package sectionone;

import java.util.Scanner;

public class Fabinocci {
//fabinocci with even and odd
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

	}

}
