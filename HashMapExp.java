package collection.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class HashMapExp 
{
	public static void findEntry(HashMap<Integer, Person> hm,int key)
	{
		System.out.println(hm.get(key));
	}
	public static void printbyIterator(HashMap<Integer, Person> hm)
	{
//		Set s = hm.entrySet();
		Iterator it = hm.entrySet().iterator();
		while (it.hasNext())
		{
			Map.Entry m = (Entry) it.next();
			System.out.println(m.getKey());
			System.out.println(m.getValue());
		}
	}
	
	public static void printbyForEach(HashMap<Integer, Person> hm)
	{
		for(Map.Entry m : hm.entrySet())
		{
//			System.out.println(m);
			Integer k= (Integer)m.getKey();
			Person p = (Person) m.getValue();
			System.out.println(k);
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		HashMap<Integer, Person> hm = new HashMap<Integer, Person>();
		System.out.println("enter the number of person to be add");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Person p[] =new Person[10];
		for(int i = 1;i<=n;i++)
		{
			System.out.println("enter the name, id, add of person "+i);
			String name =sc.next();
			int id= sc.nextInt();
			String add=sc.next();
			p[i]=new Person(name, id, add);
			hm.put(i, p[i]);
		}
		System.out.println("Enter key to find Value of person");
		int key = sc.nextInt();
		System.out.println("Data at key "+key);
		findEntry(hm, key);
		System.out.println("Print by iterator");
		printbyIterator(hm);
		System.out.println("Print by ForEach");
		printbyForEach(hm);
	}
}
