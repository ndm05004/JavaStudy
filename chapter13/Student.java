package chapter13;

import java.util.Objects;

public class Student {
	public int studentNum;
	public String name;
	
	public Student(int studentNum, String name) {
		// TODO Auto-generated constructor stub
		this.studentNum = studentNum;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) {
			return false;
		}
		Student student = (Student) obj;
		if(studentNum != student.studentNum) { return false;}
		return true;
	}
	
	

}
