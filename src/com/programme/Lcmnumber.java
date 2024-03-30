package com.programme;

public class Lcmnumber {

	public static void main(String[] args) {
	int []a= {50,60,70,80,90};
	//to find the lcm fir find greates one
	int max=0;
	for(int i=0;i<a.length-1;i++) {
		 max = Math.max(a[i], a[i+1]);
	}
	System.out.println(max);
	
	//we do a operation of infinite wha
	
while(true) {
	int count =0;
	  for(int i:a) {
		  if(max%i==0) {
			  count++;
		  }
	  }
	if(count==a.length) {
		break;
	}
	else {
		count =0;
	}
	++max;
}
		
System.out.println(max);		
		
		

	}

}
