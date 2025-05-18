package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 121;
		int output=0;
		int temp=input;
		
		for(;temp!=0; temp=temp/10) {
			int digit = temp%10;
			output = output * 10+digit;
		}
		if(input==output) {
			System.out.println(input+" is a palindrome");
		}else {
			System.out.println(input+"is not a palindrome");
		}

	}

}
