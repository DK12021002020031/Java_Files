package day_6;

import java.util.Arrays;

public class Symmetric_Matrix {

	public static boolean isSymmetric(int[][] arr) {
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<i;j++) {
				
				if(arr[i][j]!=arr[j][i]) return false;
			}
		}
		
		return true;
	}
	public static void main(String[] args) {
		
		int arr[][]=Max_Element_In_2D_Array.createMatrix();
		
		int arr1[][]=Max_Element_In_2D_Array.createMatrix();
		
		Max_Element_In_2D_Array.displayMatrix(arr);
		
		System.out.println(isSymmetric(arr));
		
		System.out.println(Arrays.deepEquals(arr, arr1));
	}
}
