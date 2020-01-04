package model;

import java.util.List;

public class Teacher {
	private String tchId;
	private String tchName;
	private List<?> students;

	public Teacher(String tchId, String tchName) {
		super();
		this.tchId = tchId;
		this.tchName = tchName;
	}

	public List<?> getStudents() {
		return students;
	}

	public void setStudents(List<?> students) {
		this.students = students;
	}

	@Override
	public String toString() {
		return "Teacher [tchId=" + tchId + ", tchName=" + tchName + ", students=" + students + "]";
	}

}
