package collection.practice;

public class Person {
	String name;
	int id;
	String add;

	public Person(String name, int id, String add) {
		this.name = name;
		this.id = id;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", code=" + id + ", add=" + add + "]";
	}

}
