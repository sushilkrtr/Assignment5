package collection.practice;

public class Student {
	int id;
String name;
int marks;
public Student(int id, String name, int marks) {
	this.id = id;
	this.name = name;
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
}
