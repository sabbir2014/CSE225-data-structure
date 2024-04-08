package project1;

public class Main {

	public static void main(String[] args) {
		System.out.println("Generic Array : ");
		GenArray<Integer> a1 = new GenArray<Integer>();
		a1.add(30);
		a1.add(80);
		a1.add(60);
		a1.add(20);
		System.out.println("Length : " + a1.size());
		System.out.println(a1.toString());
		a1.clear();
		System.out.println("is Empty? : " + a1.isEmpty());
		System.out.println(a1.toString());
		GenArray<String> a2 = new GenArray<String>();
		a2.add("Java");
		a2.add("Python");
		a2.add("C-lang");
		a2.add("C++");
		System.out.println("Length : " + a2.size());
		System.out.println(a2.toString());
		a2.remove("C-lang");
		System.out.println(a2.toString());
		Student s1 = new Student("Sujit",151);
		Student s2 = new Student("Siyam",152);
		Student s3 = new Student("Abir",151);
		Student s4 = new Student("Tonmoy",161);
		GenArray<Student> a3 =new GenArray<Student>();
		a3.add(s1);
		a3.add(s2);
		a3.add(s3);
		System.out.println(a3.size());
		System.out.println(a3.toString());
		a3.set(2, s4);
		System.out.println(a3.toString());
		a3.reverse();
		System.out.println(a3.toString());
		a3.remove(s2);
		System.out.println(a3.toString());
		
		System.out.println("IntArray : ");
		IntArray i1 = new IntArray();
		System.out.println("Length : " + i1.size());
		System.out.println("IS empty ? " + i1.isEmpty());
		i1.add(10);
		i1.add(30);
		i1.add(50);
		i1.add(20);
		i1.add(80);
		System.out.println(i1.toString());
		System.out.println("Length : " + i1.size());
		System.out.println(i1.get(0));
		i1.set(0, 40);
		System.out.println(i1.toString());
		i1.removeAt(2);
		System.out.println(i1.toString());
		i1.remove(80);
		System.out.println(i1.toString());
		i1.reverse();
		System.out.println(i1.toString());
		
	}

}
