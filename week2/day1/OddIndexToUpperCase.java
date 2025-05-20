package week2.day1;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test="changeme";
		
		char[] cs = test.toCharArray();
		
		for (int i = cs.length-1; i >=0; i--) {
			
			if(i%2!=0) {
				
			cs[i]= Character.toUpperCase(cs[i]);
			
			}
			
		}
		
		System.out.println(new String(cs))	;
	

	}

}
