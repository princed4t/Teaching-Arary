package com.programme;

public class Aspiralmatrix {

	public static void main(String[] args) {
		int[][]a= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}			
		};
		int startrow=0;
		int endrow=a.length-1;
		int startcolum=0;
		int endcolumn=a[0].length-1;
	  while(startrow<=endrow&&startcolum<=endcolumn) {
	for(int i=startcolum;i<=endcolumn;i++) {
		System.out.print(a[startrow][i]+",");
	}
	    startrow++;	
	    
		for(int j=startrow;j<=endrow;j++) {
			System.out.print(a[j][endcolumn]+",");
		}
		
         endcolumn--; 
         
         for(int k=endcolumn;k>=startcolum;k--) {
        	 System.out.print(a[endrow][k]+",");
         }
         
         endrow--;
         for(int l=endrow;l>=startrow;l--) {
        	 System.out.print(a[l][startcolum]+",");
         }
         startcolum++;
        
	}
	
	
	
	}

}
