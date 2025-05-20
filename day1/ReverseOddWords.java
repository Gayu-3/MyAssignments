package week2.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text =" I am a software tester";
		
		String[] ro = text.split(" ");
		System.out.println("The output is :");
		
		for (int i = 0; i < ro.length; i++) {
			
			if(i%2!=1) {
			
			char[] ca = ro[i].toCharArray();
			for (int j = ca.length-1; j >=0; j--) {
				System.out.print(ca[j]);
			}
		}
			else {
				System.out.print(ro[i]);
			}
			
			System.out.print(" ");

	}
		
		

}
}