import java.util.Scanner;



class Test

{
	public int calculateSoD(int num)
	{
		int sum=0;
		for(;num>0;)
		{
			int rem=num%10;
			sum=sum*10+rem;
			num=num/10;
			System.out.println("Reverse="+sum);
		}
		return sum;
	}
}

public class Sumofdigits {
 public static void main(String[]args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the value:");
	 int x=s.nextInt();
	 Test test=new Test();
	 System.out.println(test.calculateSoD(x));
 }
}

