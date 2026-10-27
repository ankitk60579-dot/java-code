import java.beans.Statement;

public class Testerjava {
	public static void main(String[]args) {
		StudentDao dao=new StudentDao();
		float max=0.0f;
		String maxName=null;
		for(Statement s:dao.show())
		{
			if(((Object) s).getFine()>max)
			
				max=((Object) s).getFine();
				maxName=s.getName();
				
				
			}
		}
		System.out.println(maxName);

	

}

