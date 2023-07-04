package UserdefinedException;
import java.util.Scanner;

public class Marriageeligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age");
		int age=sc.nextInt();
		if (age>=21) {
			System.out.println("eligible for marriage");
			
		}
		else {
			try {
			throw new NotableforMarriage();
		}
			catch(NotableforMarriage e) {
				System.out.println(e.getMessage());
			}

	}

	}
}
