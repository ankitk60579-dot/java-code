
	
import java.util.Scanner;

class one
{
	public void mt1() {
		System.out.println("call Mt1");
		System.out.println(0%10);
	}
}
class Two
{
	public static void mt2() {
		System.out.println("call Mt2");
	}
}
public class sectionL {
	
	public static void main(String[] args) {
	
  	

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter choice");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			one one=new one();
			one.mt1();
		}
		else if(choice==2)
		{
			Two.mt2();
			
		}
	
		else
		{
			main(args);
		}
	}
	
}

