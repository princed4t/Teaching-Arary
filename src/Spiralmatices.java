
public class Spiralmatices {

	public static void main(String[] args) {
		int[][]a= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}			
		};
	int startrow=0;
	int endrow=a.length-1;
	int startcol=0;
	int endcol=a[0].length-1;
	for(int i=startrow;i<=endcol;i++) {
		System.out.print(a[startcol][i]);
	}
	startrow++;
	for(int i=startrow;i<=endcol;i++) {
		System.out.print(a[i][endcol]);
	}
	endcol--;	
	for(int i=endcol;i>=startcol;i--) {
		System.out.print(a[endrow][i]);
	}
	endrow--;
	for(int i=endrow;i>=startrow;i--) {
		System.out.print(a[i][startcol]);
	}
	startcol--;
	
		
	}

}
