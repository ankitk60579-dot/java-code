abstract class One
{
	abstract void test();
	abstract void display();
	public void show()
	{
		System.out.println("Work in show");
	}
}
class Two extends one
{
	int x=20;
	void test() {
		System.out.println("Hi from test");
		System.out.println(x);
	}
}
public class Testermainjava {


public static void main(String[]args) {
	 One one=new Onee() {
		 void test()
		 {
			 System.out.println("Flow");
			 
		 }
	 
	 }

}

	




