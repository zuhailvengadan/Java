package learning;

import java.util.Scanner;

public class Fbfull {
	private String url="www.facebook.com";
	private String user="zuhail";
	private int pass=1234;
    private String login="login";
    private String register="register";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter URL");
		String URL=sc.next();
         
		Fbfull a1=new Fbfull();
		
		if (a1.url.equals(URL)) {
			//System.out.println("****WELCOME TO FACEBOOK****");
			System.out.println("$$ Get Facebook for Android and browse faster");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("                facebook");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("  Mobile numer or email address");
			System.out.println(" ");
			System.out.println("  password");
			System.out.println(" ");
			System.out.println("                Log in");
			System.out.println(" ");
			System.out.println("           Forgotten password");
			System.out.println(" ");
			System.out.println("-----------------or-----------------------------");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("           Create new account");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println("    English(uk)                 hindi");
			System.out.println("    urudu                       marathi");
			System.out.println("    kannada                     [+] ");
			System.out.println("             ");
			System.out.println("               About.Help.More");
			System.out.println(" ");
			System.out.println("                 Meta@2023");
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("select login or register ");
			String select=sc.next();
			if (select.equals(a1.login)) {
				System.out.println("enter user");
				String usr=sc.next();
				System.out.println("enter password");
				int pswd=sc.nextInt();
				if (a1.user.equals(usr)&&a1.pass==pswd) {
					System.out.println("          LOG IN SUCCESSFULL");
					System.out.println(" ");
					System.out.println(" ");
					System.out.println("      ****WELCOME TO FACEBOOK****");}
				else 
					System.out.println("enter valid credential");}
				
				else if (select.equals(a1.register)) {
					Fbfull2.register();
				}
		}
				else {
					System.out.println("url is wrong");
				}
		}


	 }
	



