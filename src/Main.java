import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	 List<Student> personList = new ArrayList<>();

     // Manually creating Person objects and adding them to the list
     personList.add(new Student(1, "John Doe", "New York", "123 Main St"));
     personList.add(new Student(2, "Alice Smith", "Los Angeles", "456 Elm St"));
     personList.add(new Student(3, "Bob Johnson", "Chicago", "789 Oak St"));
     personList.add(new Student(5, "Michael Lee", "Chicago", "202 Cedar St"));
     personList.add(new Student(4, "Emily Brown", "San Francisco", "101 Pine St"));
     personList.add(new Student(6, "Sophia Davis", "Boston", "303 Maple St"));
     personList.add(new Student(7, "William Wilson", "Dallas", "404 Birch St"));
     personList.add(new Student(8, "Olivia Taylor", "Miami", "505 Walnut St"));
     personList.add(new Student(9, "James Martinez", "Houston", "606 Pine St"));
     personList.add(new Student(10, "Emma Anderson", "Phoenix", "707 Oak St"));
	Map<String, Long> collect = personList.stream().map(i->i).collect(Collectors.groupingBy(s->s.getCity(),Collectors.counting()));
	System.out.println(collect);
	
	
	
	
	
	
	
	
	
	
	
}

}
