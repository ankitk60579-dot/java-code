
class Car{
	int a=10;
	public void fourTyres() {
		
		System.out.println("I have five tyres");
	}
}
class Santro extends Car
{
	
	int b=20;
	public void powerWindows() {
		System.out.println("I have power windows");
	}
}
	class BMW extends Santro
	{
		public void airbags() {
			
			System.out.println("i have air bags");
			
		}

		public void speed() {
			// TODO Auto-generated method stub
			
		}
	}

public class firstclass {
	public static void main(String[]args) {
		System.out.println("Hello");
       BMW hi=new BMW();
		hi.airbags();
		hi.fourTyres();
		hi.speed();
	}

		
		
	}


