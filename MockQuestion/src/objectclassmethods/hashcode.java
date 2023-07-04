package objectclassmethods;

public class hashcode {
int a=7;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashcode a1=new hashcode();
		hashcode a2=a1;
		hashcode a3=new hashcode();
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		System.out.println(a3.hashCode());
		System.out.println(a1.hashCode());
	}
	
}
