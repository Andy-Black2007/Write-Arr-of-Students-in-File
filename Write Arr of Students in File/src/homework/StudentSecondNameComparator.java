package homework;
import java.util.Comparator;

public class StudentSecondNameComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Student st1 = (Student)o1;
		Student st2 = (Student)o2;
		
		String secondName1 = st1.getSecondName();
		String secondName2 = st2.getSecondName();
		
		if (secondName1.compareTo(secondName2) > 0) {
			return 1;
		}
		if (secondName1.compareTo(secondName2) < 0) {
			return -1;
		}
		
		return 0;
	}
}