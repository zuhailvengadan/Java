package objectclassmethods;

public class tostring1 {
	int sno=2;
	String sname="ram";

	
	
	public static void main(String [] args) {
		tostring1 a1=new tostring1();
		System.out.println(a1.toString());
	}
	@Override
	public String toString() {
		return "tostring1 [sno=" + sno + ", sname=" + sname + "]";
	}

}
