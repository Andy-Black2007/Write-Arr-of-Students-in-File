package homework;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class Group {
	private Student[] students = new Student[5];
	private String name;

	public Group(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//
	public void addStudent(Student student) {
		for (int i = 0; i < students.length + 1; i++) {

			try {
				if (i >= students.length) {
					throw new TheGroupIsFullException();
				}

				if (students[i] == null) {
					students[i] = student;
					System.out.println("student was added");
					break;
				}
			} catch (TheGroupIsFullException e) {
				System.err.println(e.getMessage());

			}
		}
	}

	public void deleteStudent(String secondName) {
		int d = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSecondName().equals(secondName)) {
				students[i] = null;
				System.out.println("Студент удален");
				break;
			} else {
				d++;
			}
		}
		if (d == students.length) {
			System.out.println("Такого студента или группы нет");
		}
	}

	public Student findStudent(String secondName) {
		Student student = new Student();
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null && students[i].getSecondName().equals(secondName)) {
				student = students[i];
				break;
			}
		}
		return student;
	}

	public void sortStudentsByLastName() {
		Arrays.sort(students, Comparator.nullsLast(new StudentSecondNameComparator()));
	}
	/*
	 * public void sortStudentsByLastName() { Student student = new Student(); for
	 * (int i = 0; i < students.length; i++) { for (int j = 0; j < students.length;
	 * j++) { if (students[i] == null || students[j] == null ||
	 * students[i].getName().compareTo(students[j].getName()) < 0) { student =
	 * students[j]; students[j] = students[i]; students[i] = student; } } } }
	 */

	public void writeStudentsToFile(File file) {
		FileOperation.writeStudentsInFile(file, this, students);
	}
	
	public String readStudentsFromFile(Group gr) {
		File file = new File(gr.getName()+".txt");
		return FileOperation.readStudentsFromFile(file);
	}

	@Override
	public String toString() {
		sortStudentsByLastName();
		return "Group " + this.name + ": " + Arrays.toString(students);
	}
}