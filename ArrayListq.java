import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListq {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(23);
		al.add(34);
		al.add(45);
		al.add(89);
		al.add(99);
		al.remove(2);
		al.set(2,22);
//		System.out.println(al);
		
//		Using for loop
//		for(Integer a:al)
//		{
//			System.out.println(a);
//		}
//		Using Iterator
		Iterator it=al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
//		Printing element Using get
		int z=al.get(0);
		System.out.println();
		System.out.println(z);
		System.out.println();
		Collections.sort(al);
		System.out.println(al);
	}
}
