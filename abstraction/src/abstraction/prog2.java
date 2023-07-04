package abstraction;

 public class prog2 extends pro1 {
public prog2(int a)
{
	
	System.out.println("con 2");
}
	
	
	
public static void main(String[] args) {
	pro1.staticlass();
	//prog2 a1=new prog2();
	//a1.m1();
	prog2 a2=new prog2(2);
	a2.m1();
//	prog2 a3=new prog2();
	
	
	
}

	@Override
	public void m1() {
		System.out.println("m1 abs over ride");
		// TODO Auto-generated method stub
		
	}
	
}
