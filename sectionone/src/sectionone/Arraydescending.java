package sectionone;
import java.util.Scanner;
public class Arraydescending {

	public static void main(String[] args) {
		int a[]=new int [4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of array");
		for(int i=0;i<=3;i++) {
			a[i]=sc.nextInt();
		}
		
		for (int i=0;i<a.length ;i++ )
		{ 
			for (int j=i+1 ;j<a.length ;j++ )
			{
			if (a[i]<a[j])

			{
				int temp=a[i];
				    a[i]=a[j];
			        a[j]=temp;

			}	

			}
		
		System.out.print(+a[i]+" ");
				
			}
		System.out.print(" desc ");
		}
}
	


