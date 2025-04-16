package sorting;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = {6,3,9,5,2,8};
		System.out.println(Arrays.toString(arr));
		divide(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void divide(int[] arr,int start,int end) {
		if(start>=end) {
			return;
		}
		int mid = (start+end)/2;
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,mid,end);
	}
	
	public static void merge(int[] arr,int start,int mid,int end) {
		int leftArraySize = mid-start+1;
		int rightArraySize = end-mid;
		
		int[] left = new int[leftArraySize];
		int[] right = new int[rightArraySize];
		
		// copying the elements to left array
		for(int i=0;i<leftArraySize;i++) {
			left[i] = arr[start+i];
		}
		// copying the elements to right array
		for(int j=0;j<rightArraySize;j++) {
			right[j] = arr[mid+1+j];
		}
		
		// merge
		int i,j,k=start;
		i=j=0;
		
		while(i<leftArraySize && j<rightArraySize) {
			if(left[i]<=right[j]) {
				arr[k] = left[i];
				i++;
			}
			else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		
		//copying remaining elements of left array
		while(i<leftArraySize) {
			arr[k] = left[i];
			i++;
			k++;
		}
		
		//copying remaining elements of right array
		while(j<rightArraySize) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}
}
