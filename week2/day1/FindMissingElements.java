package week2.day1;

import java.util.Arrays;

public class FindMissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,4,3,2,8,6,7};
		
	Arrays.sort(arr);
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i]!=i+1) {
			System.out.println("The Missing Element is :"+(i+1));
			break;
		}
		
	}
		

	}

}
