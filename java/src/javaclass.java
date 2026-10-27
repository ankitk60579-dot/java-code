
public class javaclass{
	public void testCount() {
	
int count=0;
int count4=0;
int count5=0;
int i=20;
while(i<=40)
{
	if(i%3==0) {
		System.out.print(i+"/3");	}
	if(i%4==0)
	{
		count4=i;
		System.out.print(count4+"/4");
	}
	if(i%5==0) {
		count5++;
	}
	i++;
}
}



	   	public static void main(String[]args) {
	   		javaclass test=new javaclass();
	   		test.testCount();
	   	}

}
