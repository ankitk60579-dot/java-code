import java.util.Scanner;

public class Testexcprion {
	public static void main(String[]args) {
		System.out.println("Enter your nyumbers");
		int a,b;
		Scanner scanner=new Scanner(System.in);
		try
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			System.out.println(a/b);

		}
		catch(Exception abc) {
			System.out.println("please dp prper input"+abc);
			
		}
		finally {
			System.out.println("Always executed");
		}
	}

}
