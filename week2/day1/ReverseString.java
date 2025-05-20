package week2.day1;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input ="GAYATHIRI";
		char[] name = input.toCharArray();
		
		for (int i = name.length-1; i >=0; i--) {
			System.out.print(name[i]);
			
		}

	}

}
