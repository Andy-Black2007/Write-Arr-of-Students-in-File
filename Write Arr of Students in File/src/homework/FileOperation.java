package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
	public static void writeStudentsInFile(File file, Group gr, Student[] students) {
		StringBuilder sb = new StringBuilder("List of Students of group " + gr.getName() + ":");
		sb.append('\n');
		for (Student student : students) {
			sb.append(student.getName() + " " + student.getSecondName() + ", " + student.getAge());
			sb.append('\n');
		}
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readStudentsFromFile(File file) {
		 StringBuilder sb = new StringBuilder("");
		 try(BufferedReader br = new BufferedReader (new FileReader(file)))
	        {
	            int c;
	            while((c=br.read())!=-1){
	                sb.append((char)c);
	            }
	        }
	        catch(IOException ex){
	            System.out.println(ex.getMessage());
	        } 
		 return sb.toString();
	}
}
