
class Person1 extends Thread
{
	public void run() {
		try
		{
			for(int i=0;i<10;i++)
			{
				Thread.sleep(500);
				System.out.println("Running p1");
			}
		}
		catch(Exception e) {
			System.out.println("Stopped 1"+e);
		}
	}
}
class Person2 extends Thread
{
	public void run() {
		
		
			for(int i=0;i<10;i++)
			{
				try {
				Thread.sleep(1000);
				System.out.println("Running p2");
				}
				catch(Exception e) {
					System.out.println("Stopped 2"+e);
				}
			}
		}
	}



