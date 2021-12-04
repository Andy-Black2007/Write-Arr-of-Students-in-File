package homework;

public class Student extends Person {
	private String group;

	public Student() {
		super();
	}

	public Student(String group, String name, String secondName, int age) {
		super(name, secondName, age);
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}