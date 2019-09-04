import java.util.Collections;
import java.util.LinkedList;

public class LinkedListq {

	public static void main(String[] args) {
		LinkedList<Integer> ll=new LinkedList<>();
		try
		{
		ll.add(56);
		ll.add(9);
		ll.add(90);
		ll.add(2,77);
		ll.add(78);
		ll.set(3, 56);
		ll.removeFirst();
		ll.remove(3);
		ll.removeLast();
		ll.remove();
		ll.addFirst(34);
		
		}catch(IndexOutOfBoundsException e)
		{
			System.out.println("Out of current size");
		}
		Collections.reverse(ll);
		System.out.println(ll);
	}
}
