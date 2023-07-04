package swiggy;

public class imple implements CHILD{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
imple a1=new imple();
a1.sub();
a1.add();
a1.muti();

	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub");
	}

	@Override
	public void muti() {
		// TODO Auto-generated method stub
		System.out.println("muti");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
System.out.println("add");
	}

}
