package collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<Student>();
		Student s = new Student(1, "Nikhil", 70);
		Student s1 = new Student(2, "Ahivam", 80);
		Student s2 = new Student(3, "Ihubham", 60);
		Student s3 = new Student(4, "Hsreya", 50);
		al.add(s);
		al.add(s1);
		al.add(s2);
		al.add(s3);

//		for (Student i : al) {
//			System.out.println(i);
//		}

		Iterator it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		SortbyMarks sm = new SortbyMarks();
		Collections.sort(al, sm);
		System.out.println("After Sorting by marks");
		Iterator it1 = al.iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}
		SortbyName sn = new SortbyName();
		Collections.sort(al, sn);
		System.out.println("After Sorting by name");
		Iterator it2=al.iterator();
		while (it2.hasNext())
		{
			System.out.println(it2.next());
		}
	}

}
