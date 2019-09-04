import java.util.Iterator;
import java.util.Stack;

public class Stackq {

	public static void main(String[] args) {
		Stack<Integer> st=new Stack<>();
		st.push(34);
		st.push(45);
		st.push(67);
		st.push(98);
		st.push(67);
		st.pop();
		st.remove(2);
//		System.out.println(st);
//		Using for each loop
		for(Integer x:st)
		{
			System.out.println(x);
		}
//		Using Iterator
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
