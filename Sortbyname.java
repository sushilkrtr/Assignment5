import java.util.Comparator;

public class Sortbyname implements Comparator<Teacher> {
	int id;
	String name;
	String subject;
	int salary;
	
	public int compare(Teacher t, Teacher t1) {
		
		return t.name.compareTo(t1.name);
	}

}
