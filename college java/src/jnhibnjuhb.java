package forcall;

import java.util.Scanner;

import forcall.sectionL;

public class jnhibnjuhb {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Console");
		int choice=scanner.nextInt();
		if(choice==1)
		{
			sectionL.main(args);
		}
		else if(choice==2)
		{
			Tester.main(args);
		}
		else
		{
			System.out.println("Please select proper option");
			jnhibnjuhb.main(args);
		}
	}

}
