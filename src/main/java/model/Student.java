package model;

public class Student {
	private String stdId;
	private String stdName;

	public Student(String stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + "]";
	}

}
