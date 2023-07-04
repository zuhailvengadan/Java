package newday;
import java.util.Scanner;
public class Facelogin2 {
	
			public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			System.out.println("enter URL");
			String URL=sc.next();
			
			Facebook a1=new Facebook();
			
			if (a1.getUrl().equals(URL)) {
				System.out.println("****WELCOME TO FACEBOOK****");
				System.out.println("enter user");
				String usr=sc.next();
				System.out.println("pswd");
				int pswd=sc.nextInt();
				if (a1.getUser().equals(usr)&&a1.getPass()==pswd) {
					System.out.println("LOG IN SUCCESSFULL");}
				else {
					System.out.println("WRONG CREDENTIAL");}
			}
				
			else {
				System.out.println("url is wrong");
			}
			
		}

	}



