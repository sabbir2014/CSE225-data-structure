package project1;

public class Student implements Comparable<Student> {
	private Integer id;
	private String name;
	private Integer marks;
	public Student(Integer id, String name, Integer marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMarks() {
		return marks;
	}
	public void setMarks(Integer marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "[" + id + ", " + name + ", " + marks + "]";
	}
	@Override
	public int compareTo(Student s) {
		return this.id.compareTo(s.getId());
	}
	
}
