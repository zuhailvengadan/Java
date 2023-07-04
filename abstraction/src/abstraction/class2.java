package abstraction;

public class class2 extends class1 implements demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
class2 a1=new class2();
a1.vehicle();
a1.vehicle1();
	}

	@Override
	public void vehicle() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}
	public void vehicle1() {
		System.out.println("truck");
	}
}
