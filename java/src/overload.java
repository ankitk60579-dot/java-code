class User
{
	int x=45;
			
	public User() {
		System.out.println("Hi this is constructor block");
	}
	public void show() {
		System.out.println("This is show from child class");
		
	}
	public void testing() {
		System.out.println("For testing");
	}
}
public class overload {
	public static void main(String[]args) {
		User newUser=new NewUser();
		System.out.println(newUser.x);
		newUser.show();
		newUser.testing();
	}

}
