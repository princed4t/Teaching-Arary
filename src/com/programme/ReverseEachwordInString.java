package com.programme;

public class ReverseEachwordInString {
	public static void main(String[] args) {
		String s = "java devloper gyu";
		String[] split = s.split(" ");
		
	   for(int i=0;i<split.length;i++) {
		   String newstring="";
		 String st=  split[i];
		   for(int j=st.length()-1;j>=0;j--) {
			   newstring=newstring+st.charAt(j);
			  
			   
		   }
		 System.out.print(newstring+" ");
		   
	   }
		
		
		
		
		
		
		
		
	}		
		
//		String[] split = s.split(" ");
//		String orign="";
//		for (String se : split) {
//				
//			
//	
//			
//			for (int i = se.length() - 1; i >= 0; i--) {
//				
//
//				orign = orign + se.charAt(i);
//				
//
//			}
//			
//
//			
//
//		}
//		System.out.println(orign);
//			
//	}
	
}
