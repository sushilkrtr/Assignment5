import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
	
	
	
	public static HashMap<Integer,Person> newentry()
	{
		HashMap<Integer,Person> ht=new HashMap<>();
		
		String pname;
		String Designation;
		String Add;
//	int mob=1;
////		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter name of person");
//		pname=sc.next();
//		System.out.println("Enter Designation of Person");
//		Designation=sc.next();
//		System.out.println("Enter Address of person");
//		Add=sc.next();
//		System.out.println("Enter Mobile number");
//		mob=sc.nextInt();
		Person p=new Person("Nikhil", "SE", "kanpur");
		Person p1=new Person("sushil", "ds", "gzb");
		ht.put(1,p);
		ht.put(2,p1);
//		for(Map.Entry m:ht.entrySet())
//		{
//			Integer k=(Integer)m.getKey();
//			Person ps=(Person)m.getValue();
//			System.out.print(k);
//		
//			System.out.println(ps);
//		}
		return ht;
	}
	
	public void start() {
		
		HashMap<Integer,Person> ht=new HashMap<>();
		Person p1=new Person("sushil", "ds", "gzb");
		ht.put(123,p1);
//		Person p=new Person("Anil", "Sr. Associate"," B-234,GHAZIABAD");
//		Person p1=new Person("Ramesh", "Sr. Analyst"," B-234,NOIDA");
//		Person p2=new Person("Rimmi", "Manager"," B-234,DELHI");
//		Person p3=new Person("Tinku", "Engineer"," B-234,GURGAON");
//		ht.put(124,p1);
//		ht.put(125,p2);
//		ht.put(126,p3);
//		System.out.println(ht);
		
		//Using For loop
		for(Map.Entry m:ht.entrySet())
		{
			Integer k=(Integer)m.getKey();
			Person ps=(Person)m.getValue();
			System.out.print(k);
			System.out.println(ps);
//			ps.disp();
		}
		
		//Using Iterator
//		Set s=ht.entrySet();
//		
//		Iterator it=s.iterator();
//		while(it.hasNext())
//		{
//			Map.Entry m=(Map.Entry)it.next();
//			System.out.println(m.getKey());
//			System.out.println(m.getValue());
//		}
	}
	    
	public static void search()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number that you want to search");
		int b=sc.nextInt();
		HashMap<Integer,Person> hm = newentry();
        System.out.println(hm.get(b));
	}
}
