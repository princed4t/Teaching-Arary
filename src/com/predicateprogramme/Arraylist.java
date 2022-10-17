package com.predicateprogramme;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Arraylist {

	public static void main(String[] args) {
		List<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(21);
		a.add(30);
		a.add(41);
		a.add(50);
		
		Predicate<Integer> p1=i->i%2==0;
		boolean removeIf= a.removeIf(p1);
		System.out.println(a);
		
		

	}

}
