package sectionone;

import java.util.Scanner;

public class Palidrome {

	public static void main(String[] args) {
	
			Scanner sc=new Scanner(System.in);
		    System.out.println("enter the value");
		    int n=sc.nextInt();
		   
		    //paliodrome 
		    
		    int rem=0,sum=0,temp=n;
		    while (n>0) {
		    rem=n%10;
		    sum=sum*10+rem;
		    n=n/10;
		    }
		    if(temp==sum)
		    {
		    	System.out.println(sum+" is pali");

			}
		    else
		    	System.out.println("not pali");

		}

	}


