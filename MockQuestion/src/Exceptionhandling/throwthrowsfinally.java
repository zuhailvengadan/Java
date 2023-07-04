package Exceptionhandling;

public class throwthrowsfinally {
	 static int a=25,b=15,c=0;

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		throwthrowsfinally a1=new throwthrowsfinally();
	    a1.add();
	    a1.sub();
	    try {
	    a1.multi();
	    throw new Exception();
	}
	    catch(Exception e) {
	    	System.out.println(e.getMessage()+" Comparable by main");
	    }
	    finally {
	    	System.out.println("not done mutil");
	    }
	}
	    
		public static void  add() throws Exception{
			
			int added=a+b;
			System.out.println(added);
		}
		public static void sub() throws Exception {
			
			int sub=a-b;
			System.out.println(sub);
			
		}
		public static void multi() throws Exception{
		
			int multi=a*b/c;
			System.out.println(multi);
			
		
		

	}
}


