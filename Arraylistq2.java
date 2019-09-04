import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylistq2 {

	
//	public String toString(int id,String name,String subject,double salary)
//	{
//		return "Teacher   ["+id+"|"+name+"|"+subject+"|"+salary+"]";
//	}
	public static void main(String[] args) {

		Teacher t=new Teacher(123,"Sunil","Maths",32000);
		Teacher t1=new Teacher(124,"Sharad","DBDA",38000);
		Teacher t2=new Teacher(125,"Sushil","Machine Learning",45000);
		Teacher t3=new Teacher(126,"Shashank","Big Data",55000);

	ArrayList<Teacher> al=new ArrayList<>();
	al.add(t);
	al.add(t1);
	al.add(t2);
	al.add(t3);
	al.add(new Teacher(126,"Amit","Python",585000));
	
	Sortbysalary sa=new Sortbysalary();
	Collections.sort(al,sa);
	
	
//	System.out.println(al);
	
	Iterator it=al.iterator();
			while(it.hasNext())
			{
				Teacher st=(Teacher)(it.next());
//				System.out.println(it.next());
				System.out.println(st.id+"|"+st.name+"|"+st.subject+"|"+st.salary);
			}
			//Sorting by name
			
			Sortbyname sn=new Sortbyname();
			Collections.sort(al,sn);
			
			
			while(it.hasNext())
			{
				Teacher tt=(Teacher)(it.next());
				tt.disp();
//				System.out.println();
//				System.out.println(sn.id+"|"+sn.name+"|"+sn.subject+"|"+sn.salary);
				
			}
	}

}

class Teacher
{
int id;
String name;
String subject;
int salary;

void disp()
{
	System.out.println(id+name+subject+salary);
	
	
}

public Teacher(int id,String name,String subject,int salary)
{
	this.id=id;
	this.name=name;
	this.subject=subject;
	this.salary=salary;
}
}