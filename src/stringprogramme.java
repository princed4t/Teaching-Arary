
public class stringprogramme {
	public static void main(String[] args) {
		String s="opentext";
		//to replace t with 1 and 2
		Integer count=1;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]=='t') {
				c[i]=count.toString().charAt(0);
				count ++;
			
				
			}
			
			
			
		}
		System.out.println(new String(c));

		
		
		
		
		
	}
	

}
