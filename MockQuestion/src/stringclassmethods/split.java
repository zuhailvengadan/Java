package stringclassmethods;

public class split {
	public static void main(String[] args) {
		
		String b="i love u";
		String a[]=b.split(" ");
       System.out.println(a[2]+" "+a[1]+" "+a[0]);
    	   System.out.println(a[1].replace(a[1].charAt(0),'I'));
		}
	
		
}


