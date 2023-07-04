package objectclassmethods;

public class booleanequals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		booleanequals a1=new booleanequals();
		booleanequals a2=a1;
		booleanequals a3= new booleanequals();
		System.out.println(a1.hashCode()+"   "+a3.hashCode()+"  "+a2.hashCode());
				System.out.println(a1.equals(a2));
				System.out.println(a1.equals(a3));
			
	}

}
