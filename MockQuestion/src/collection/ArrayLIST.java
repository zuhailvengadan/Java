package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLIST {

	public static void main(String[] args) {
		int a[]= {13,432,421,12,14};
		ArrayList a1=new ArrayList();
		ArrayList a2=new ArrayList();
		a1.add("java");
		a1.add(123);
		a1.add(21);
		a2.add(23);
		a2.addAll(a1);
			   
		
		
	System.out.println(a1);
	//System.out.println(a2);
	for (int i = 0; i < a1.size(); i++) {
		System.out.println(a1.get(i));
	}
	for(Object i:a2) {
	System.out.println(i);
	
	}	
	Iterator a4=a1.iterator();
	
		
	
	
	}
}
		// TODO Auto-generated method stub
 /*    ArrayList a1=new ArrayList();
     a1.add(12);
     a1.add('g');
     a1.add("java");
     a1.add("mavaa");
     System.out.println(a1);
     a1.remove(1);
     System.out.println(a1);
     a1.size();
     System.out.println(a1.size());
     
     
     ArrayList a2=new ArrayList();
     a2.add("second array");
     System.out.println(a2);
     a2.addAll(1,a2);
     System.out.println( a2);
     a1.removeAll(a2);
  System.out.println(a1);   
  System.out.println(a1 instanceof ArrayList);
  for (int i = 0; i < a1.size(); i++) {
	System.out.println(a1.get(i));   */

	

	

