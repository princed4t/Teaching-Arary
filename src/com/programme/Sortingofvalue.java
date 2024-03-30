package com.programme;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Sortingofvalue {

	public static void main(String[] args) {
		int[]a= {1,1,1,2,2,3,3,3,3,4,4,3,5};

		Map<Integer, Long> collect = Arrays.stream(a).mapToObj(i->i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		System.out.println(collect);
		collect.entrySet().stream().
		sorted(Map.Entry.<Integer,Long>comparingByKey().reversed()).collect(Collectors.toList());
		
		
		
		
		
		
		   List<Integer> collect2 = collect.keySet().stream().sorted(Comparator.comparingLong(collect::get).reversed()).collect(Collectors.toList());
		System.out.println(collect2);
		       List<Entry<Integer, Long>> collect3 = collect.entrySet()
                       .stream()
                       .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                       .collect(Collectors.toList());
		       
	       for(Entry<Integer, Long> entry :collect3) {
	    	   System.out.println("key"+entry.getKey()+"value"+entry.getValue());
	       }
		
		
		
		}
		
		
		
		
	}


