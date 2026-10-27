class javacode{

	int getRollNo() {
		return 101;
		
		
	}
	String getName() {
		return"Ankit kumar";
	}
	public float getFine() {
		// TODO Auto-generated method stub
		return 0;
	}
}
class Teacher{
	double getSalary() {
		return 50000.45;
	}
	boolean isPermanent() {
		return true;
	}
}
public class javacode{
	public static void main(String[] args) {
		 Student s=new Student();
		 Teacher t=new Teacher();
		 System.out.println("Student Roll No:"+s.getRollNo());
		 System.out.println("Student Name:"+s.getName());
		 System.out.println("Teacher Salary:"+t.getSalary());
		 System.out.println("Permanent Teacher:"+t.isPermanent());
		 
		 
		 
		 
	}

}
