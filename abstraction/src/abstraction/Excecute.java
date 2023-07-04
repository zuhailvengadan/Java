package abstraction;
import java.util.Scanner;
public class Excecute extends Chocolateshop {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc=new Scanner(System.in);
		System.out.println("select \n1:diary\n,2:kit,\n3:vicks");
		System.out.println("enter choice");
		int choise=sc.nextInt();
       switch(choise) {
       case 1: Diarymilk a1=new Diarymilk();
       a1.chocolate();
       break;
       case 2: Kitkat a2=new Kitkat();
       a2.chocolate();
       break;
       case 3:Vicks a3=new Vicks();
       a3.chocolate();
       break;
       case 4:Excecute a4=new Excecute();
       a4.chocolate();
       break;

       default:System.out.println("enter choise");
       
       
       }

	}

	@Override
	public void chocolate() {
	System.out.println("ferroro");
		// TODO Auto-generated method stub
		
    }

}
