import java.io.Serializable;
import java.util.Iterator;
import java.util.Scanner;

public class Testphonebook {

	
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1 to add a new Phonebook entry");
	System.out.println("Enter 2 to find the person for a mobile number");
	System.out.println("Enter 3 to print the phonebook entry");
	System.out.println("Enter 4 to quit");
	Phonebook pb=new Phonebook();
	n=sc.nextInt();
//	Person p=new Person("Anil", "Sr. Associate"," B-234,GHAZIABAD");
	switch(n)
	{
	case 1:
		pb.newentry();
		break;
	case 2:
		pb.search();
		break;
	case 3:
		  pb.start();
		break;
	case 4:
		System.out.println("Quit");
		break;
	}
	
	}
}
