import java.util.Comparator;

public class Sortbysalary implements Comparator<Teacher> {	
	
		public int compare(Teacher t, Teacher t1) {
			if(t.salary>t1.salary)
				return 1;
			else
				return -1;
		}

}