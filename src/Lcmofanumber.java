
public class Lcmofanumber {

	public static void main(String[] args) {
		int []a= {10,20,30,40};
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				max=a[i+1];
			}	
		}
		int count=0;
		while(true) {
		for(int i:a) {
			if(max%i==0) {
              count++;				
			}}
			if(count==a.length) {
				break;
			}
			else {
				count=0;
			
		}
		++max;	
			
			
			
		}
		
		
		System.out.println(max);
		
	}

}
