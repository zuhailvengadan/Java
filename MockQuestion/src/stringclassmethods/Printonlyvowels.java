package stringclassmethods;



public class Printonlyvowels {
	public static void main(String[] args) {
		char a[]={'a','e','i','o','u'};
		String b="i love bengaluru";
		
       for (int i = 0; i < a.length; i++) {
    	   for (int j = 0; j < b.length(); j++) {
			
		
		if (a[i]==b.charAt(j)) {
			System.out.println(a[i]);
		}
	}
		}
	}
}

