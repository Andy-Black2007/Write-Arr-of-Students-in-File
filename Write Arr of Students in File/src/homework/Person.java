package homework;

public class Person {
	private String name;
	private String secondName;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, String secondName, int age) {
		super();
		this.name = name;
		this.secondName = secondName;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " " + secondName + ", age=" + age;
	}
}