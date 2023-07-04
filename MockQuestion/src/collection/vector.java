package collection;

import java.util.Vector;

public class vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector a1=new Vector();
		a1.add(10);
		a1.addElement(101);
		a1.add(true);
		a1.add("java");
		System.out.println(a1);
		
		a1.removeElementAt(1);
		System.out.println(a1);
		System.out.println(a1.elementAt(2));
		

	}

}
