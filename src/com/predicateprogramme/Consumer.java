package com.predicateprogramme;

public class Consumer {
	
 
	
	

	public static void main(String[] args) {
		java.util.function.Consumer<String> c= s->{
		
		System.out.println(s.toUpperCase());};
		
		
		c.accept("aba");
		

	}

}
