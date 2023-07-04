package swiggy;
import java.util.Scanner;
public class exe implements food {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("select\n1:meals\n2:fried rice\n3:biriyani\n4:ice crem");
		System.out.println("select choice");
		int choice=sc.nextInt();
		food a1;
		// TODO Auto-generated method stub
		switch(choice) {
		case 1: a1=new meals();
		a1.fooda();
		break;
		case 2: a1=new friedrice();
		a1.fooda();
		break;
		case 3: a1=new biriyani();
		a1.fooda();
		break;
		case 4: a1=new exe();
		a1.fooda();
		break;
		default:System.out.println("select coice please");
		
		}

	}

	@Override
	public void fooda() {
		// TODO Auto-generated method stub
		
	}

	
}
