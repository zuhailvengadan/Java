package stringclassmethods;

public class stringmethods {

	    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="jaav";
		String s1="java is first";
	
			
				System.out.println(s.length());

		  char a1[]=s.toCharArray();
		  for (int i =0; i < s.length(); i++) {
			System.out.println(a1[i]);
			
		}
		  System.out.println(a1);
		  System.out.println(s.indexOf("j"));
		  System.out.println(s1.lastIndexOf("a"));
		  System.out.println(s.substring(3));
		  System.out.println(s.substring(0,4));
		  System.out.println(s1.replace('j','m'));
		  
		  System.out.println(a1[1]+" "+a1[3]);
		  System.out.println(s.toUpperCase());
			
			
	    }

		

	

}
