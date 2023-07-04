package stringclassmethods;

import java.util.Iterator;

public class uppercase {

	public static void main(String[] args) 
	{
		upp("how are you");
		upp(1,"how r you");
	}
	
	
	
	
	
	public static void upp(String b)
	{
		// TODO Auto-generated method stub
    String a=b;
   String d=a.substring(0,1);
   String s=a.substring(1,a.length());
   System.out.println(d.toUpperCase()+s);
     }
	public static void upp(int s,String b) {
		String a=b;
		String d1=a;
		String d=a.toUpperCase();
		System.out.println( a.replace(a.charAt(0),d.charAt(0))+"??");
	}

	}


