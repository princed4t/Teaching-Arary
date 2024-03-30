package com.programme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Duplicateelemarray {

	public static void main(String[] args) {
		int [] a= {2,3,2,4,5,2,5};
		Map<Integer, Long> collect2 = Arrays.stream(a).mapToObj(i->i)
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect2);
		List<Object> collect3 = collect2.keySet().stream()
		.filter(i->collect2.get(i)>1)		
	    .collect(Collectors.toList());
		System.out.println(collect3);
		
		
		 Set<Integer> li=new HashSet<Integer>();
               for(int i=0;i<a.length-1;i++) {
            	   for(int j=i+1;j<a.length;j++) {
            		   if(a[i]==a[j]) {
            		   li.add(a[i]);
            		   break;
            		   
            		   
            	   }
        
            	   
               }
            		int [] b= {2,3,2,4,5,2,5};
            		String string = b.toString();
	                char[] charArray = string.toCharArray();
	    	for(int j=0;j<b.length;j++) {
	    	        char ch=charArray[j];	
	    	         int indexOf = string.indexOf(ch,j+1);
	    	        if(indexOf==-1) {
	    	        	
	    	        }
	    	
	    }
               
               
               }
               
               
         
               
                LinkedHashMap<Integer, Long> collect = Arrays.stream(a).mapToObj(i->i)
               .collect(Collectors.groupingBy(i->i,LinkedHashMap::new,Collectors.counting()));
              // List<Integer> collect2 = collect.keySet().stream().filter(i->collect.get(i)>1).collect(Collectors.toList());
              // System.out.println(collect2+"pri");
               
               System.out.println(li);
}}
