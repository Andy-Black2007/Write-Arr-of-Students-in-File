package homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Group gr = new Group("TR-42");

		for (int i = 0; i < 5; i++) {
			System.out.println((i+1)+"/5 Студент");
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите имя студента:");
			String name = sc.nextLine();
			System.out.println("Введите фамилию студента:");
			String secondName = sc.nextLine();
			Scanner scInt = new Scanner(System.in);
			System.out.println("Введите возраст студента:");
			int age = scInt.nextInt();
			gr.addStudent(new Student(gr.getName(), name, secondName, age));
		}
		
		File file = new File(gr.getName()+".txt");
		file.createNewFile();
		gr.writeStudentsToFile(file);
		System.out.println(gr.readStudentsFromFile(gr));
		
	}
}
