import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Implementationofset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student student1 = new Student(1, "Alice", "New York", "Address 1");
	        Student student2 = new Student(2, "Bob", "Los Angeles", "Address 2");
	        Student student3 = new Student(3, "Charlie", "Chicago", "Address 3");
	        Student student4 = new Student(2, "Bob", "Los Angeles", "Address 4"); // Duplicate of student2
	        Student student5 = new Student(4, "David", "San Francisco", "Address 5");
	        Student student6 = new Student(3, "Charlie", "Chicago", "Address 6"); // Duplicate of student3
	        Student student7 = new Student(5, "Eve", "Seattle", "Address 7");
	        Student student8 = new Student(6, "Frank", "Boston", "Address 8");
	        Student student9 = new Student(7, "Grace", "Denver", "Address 9");
	        Student student10 = new Student(8, "Henry", "Miami", "Address 10");

	        // Creating a HashSet to store unique students
	        Set<Student> studentSet = new LinkedHashSet<>();
	        studentSet.add(student1);
	        studentSet.add(student2);
	        studentSet.add(student3);
	        studentSet.add(student4);
	        studentSet.add(student5);
	        studentSet.add(student6);
	        studentSet.add(student7);
	        studentSet.add(student8);
	        studentSet.add(student9);
	        studentSet.add(student10);
		System.out.println(studentSet);
		
		
		
		
		
		
	}

}
