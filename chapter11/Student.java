package chapter11;

import java.util.Objects;

public class Student {
	
	private String studentNum;
	
	public Student(String studentNum) {
		// TODO Auto-generated constructor stub
		this.studentNum = studentNum;
	}

	/**
	 * @return the studentNum
	 */
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Student)) {
			return false;
		}
		Student other = (Student) obj;
		return Objects.equals(studentNum, other.studentNum);
	}
}