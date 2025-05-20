package week2.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text1 ="stops";
		String text2 ="potss";
		
		char[] array1 = text1.toCharArray();
		char[] array2 = text2.toCharArray();
		
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		if(Arrays.equals(array1, array2)) {
			System.out.println("The given Strings are Anagram");
		}else {
			System.out.println("The given strings are not an Anagram");
		}
	}

	


}
