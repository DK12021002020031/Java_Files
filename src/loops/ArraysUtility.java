package loops;

import java.util.Arrays;

public class ArraysUtility {

	public static void main(String[] args) {
		
		int [] arr= {1,4,219,21,7,94,45,78,23,77,90,9,900};
		
		int target=9;
		
		int isPresent=Arrays.binarySearch(arr, target); // The array should be sorted to perform this
		
		System.out.println(isPresent);
		
		int[] newArray=Arrays.copyOfRange(arr,2,5);
		
		for(int idx : newArray) System.out.println(idx);
		
		System.out.println(Arrays.equals(arr, newArray));
		
		int arr2[]= {56,43,90,78,62};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr2));
		
		
		
	}
}
