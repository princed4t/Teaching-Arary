package com.programme;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class java8 {
	
	public static void main(String[] args) {
   List<Student> students=new ArrayList<>(); 
   students.add(new Student("John", 20, 50000.0, "New York", "john@example.com"));
   students.add(new Student("Alice", 22, 60000.0, "Los Angeles", "alice@example.com"));
   students.add(new Student("Bob", 21, 55000.0, "Chicago", "bob@example.com"));
   students.add(new Student("Emily", 23, 65000.0, "Houston", "emily@example.com"));
   students.add(new Student("Michael", 24, 70000.0, "San Francisco", "michael@example.com"));
   students.add(new Student("Samantha", 19, 45000.0, "Seattle", "samantha@example.com"));
   students.add(new Student("Daniel", 25, 75000.0, "Boston", "daniel@example.com"));
   students.add(new Student("Sophia", 18, 40000.0, "Atlanta", "sophia@example.com"));
   students.add(new Student("William", 26, 90000.0, "Dallas", "william@example.com"));
   students.add(new Student("zlivia", 27, 85000.0, "Miami", "olivia@example.com"));

   
   Optional<Student> findFirst = students.stream().filter(i->i.getSalary()>50000)
		   .sorted(Comparator.comparingInt(Student::getAge).reversed().
				   thenComparing(Student::getName,Comparator.reverseOrder()))
		   .findFirst();
			Student student = findFirst.get();	
			System.out.println(student);

   
	

}}
