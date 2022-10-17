package com.predicateprogramme;

import java.util.function.Predicate;

public class predicate {

	public static void main(String[]as) {
		Predicate<Integer> p1=i->i%2==0;
			
		
		Predicate <Integer> p2=i->{
			return  i>=25 || i<=100;
					} ;
			
		
		
			
			
		
	
		boolean test = p1.or(p2).test(10);
		System.out.println(test);
		
		
		
		
	}

}
