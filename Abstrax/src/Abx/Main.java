package Abx;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//Amazon l;
		System.out.println("Select Bank");
		System.out.println("1>SBI\n 2>ICICI");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:Amazon l=new SBI();
		l.payment();
		break;
		case 2:Amazon p=new ICICI();
		p.payment();
		break;
		default:System.out.println("Select valid bank account");
		}
		

	}

}
