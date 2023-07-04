package revision;


public class ba {

	public static void main(String[] args) {
		
	String b="hi h87ow&* are you";
			//int a[]= {12,34,24,12}
		char a[]=b.toCharArray();
	 char c[]= {'a','e','i','o','u'};
	       for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (a[i]==c[i]) {
				a[i]=(char) i++;
					
				}
			}System.out.println(a[i]);
			}
			
			}
		
	

}
	


