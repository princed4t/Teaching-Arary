
public class Implementation {
	int size=0;
	int []a=new int[100];
	public int add(int n) {
           if(size==a.length-1) {
        	   return -1;
           }
		int index=n%a.length;
		while(a[index]!=0) {
			index=(index+1)%a.length;
		}
		a[index]=n;
		return index;
	}
//	public boolean ifpresent(int n) {
//		int index=n%a.length;
//		if(a[index]==n) {
//			return true;
//		}
//		
//		
//		
//		
//	}
	
	

	public static void main(String[] args) {
		
		
	
		
		
		
		

	}

}
