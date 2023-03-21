package exam07;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human man = new Human("Steve", 30);
		System.out.println(man);
		
		Student student = new Student("Par",23,"physcis");
		
		System.out.println(student);
		
		student.setAge(11);
		
		System.out.println(student.getAge());

		

	}

}
