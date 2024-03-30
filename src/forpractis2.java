
public class forpractis2 {

	public static void main(String[] args) {
		String str="donkey";
		char[] cha = str.toCharArray();
	  for(int i=0;i<str.length()-1;i++) {
		  for(int j=0;j<str.length()-1-i;j++) {
			if(cha[j]<cha[j+1]) {
				char temp=cha[j];
				cha[j]=cha[j+1];
				cha[j+1]=temp;
			}
			  
			  
			  
		  }
		  
		  
		  
		  
	  }
		
		
		
		String result=new String(cha);
		System.out.println(result);
		
		
		
		

	}

}
